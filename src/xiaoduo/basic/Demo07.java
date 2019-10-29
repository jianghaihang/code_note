package xiaoduo.basic;

/**
 * 	设计四个线程，其中两个线程每次对j增加1，另外两个线程每次对j减少1
 * @author admin
 *
 */
public class Demo07 {
	
	private int j = 0;
	
	public static void main(String[] args) {

		Demo07 demo = new Demo07();
		
		// 内部类不可以直接new，需要public类的引用实例化
		Inc inc = demo.new Inc();
		
		Dec dec = demo.new Dec();
		
		// 循环几次，为2的倍数个线程
		for(int i = 0; i < 3; i ++) {
			
			Thread t = new Thread(inc);
			
			t.start();
			
			t = new Thread(dec);
			
			t.start();
			
		}
	}
	
	// 每次增加j
	private synchronized void inc() {
	
		j ++;
		
		System.out.println(Thread.currentThread().getName() + "：inc：" + j);
	}
	
	// 每次减少j
	private synchronized void dec() {
		
		j --;
		
		System.out.println(Thread.currentThread().getName() + "：dec：" + j);
	}
	
	/**
	 * 	增加
	 */
	class Inc implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			// for循环控制j的值范围
			for(int i = 0; i < 1 ; i ++) {
				
				inc();
			}
			
		}
	}
	
	/**
	 * 	减少
	 */
	class Dec implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			for(int i = 0; i < 1 ; i ++) {
				
				dec();
			}
			
		}
	}

}







































