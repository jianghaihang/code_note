package xiaoduo.basic;

/**
 * 1，java中有几种方法可以实现一个线程？
 * 2，用什么关键字修饰同步方法？
 * 3，stop()和suspend()方法为何不推荐使用
 * 
 * @author admin
 *
 */
public class Demo06{

	/**
	 * 	创建线程的两种方式
	 * 1，继承Thread线程类，在main方法中，实例化Thread类，引用指向继承的class，调用start方法启动。
	 * 2，实现Runnable接口，在main方法中，声明Runnable接口，引用指向继承的class，同时实例化Thread，并将Runnable引用放进Thread中，调用start方法启动。
	 * @param args
	 */
	public static void main(String[] args) {

		Thread t1 = new Thread(new Thread1());
		
		// 启动线程一
		t1.start();
		
		try {
			
			Thread.sleep(5000);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		Thread t2 = new Thread(new Thread2());
		
		// 启动线程二
		t2.start();
	}
}

/**
 * 	使用wait方法释放锁
 * @author admin
 *
 */
class Thread1 implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		/*
		 * 	释放锁有两种方式：
		 * 	1，程序自然离开监视器的范围，也就是离开了synchronized关键字管辖的代码范围。
		 * 	2，在synchronized关键字管辖的代码内部调用监视器对象的wait方法。
		 * 	
		 * 	这里使用wait方法释放锁
		 */
		synchronized (Demo06.class) {
			
			System.out.println("enter Thread1.......");
			
			System.out.println("Thread1 wait......");
			
			try {
				
				System.out.println("main is sleeping five millisecond .....");
				
				Demo06.class.wait();
				
				System.out.println("main is sleeping over!");
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Thread1 going on.......");
			
			System.out.println("Thread1 is being over!");
		}
	}
}

/**
 * 	唤醒锁，并进行sleep睡眠
 * @author admin
 *
 */
class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (Demo06.class) {
		
			System.out.println("enter Thread2.......");
			
			System.out.println("Thread2 notify other thread can release wait status......");
			
			/*
			 * 	由于notify方法并不释放锁，即使Thread2调用下面的sleep方法休息了10毫秒，但Thread1仍不会执行，
			 * 	因为Thread2没有释放锁，所以Thread1无法得到锁。
			 */
			
			// 唤醒Demo06线程
			Demo06.class.notify();
			
			System.out.println("Thread2 is sleeping five millisecond......");
			
			try {
				
				Thread.sleep(5000);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Thread2 is going on......");
			
			System.out.println("Thread2 is being over!");
		}
	}
	
}





































