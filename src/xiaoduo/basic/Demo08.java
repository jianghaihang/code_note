package xiaoduo.basic;
/**
 * 	子线程循环10次，接着主线程循环100次，接着又回到子线程循环10次，接着再回到主线程又循环100次，如此循环50次，请写出程序
 * @author admin
 *
 */
public class Demo08 {
	
	// 实例化业务类
	private Business business = new Business();
	
	public static void main(String[] args) {

		// 调用初始化方法
		new Demo08().init();
	}
	
	// 初始化启动线程
	public void init() {
		
		// 启动线程
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				// 保证子线程循环的次数，使子线程的次数与主线程的次数一致
				for(int i = 1; i <= 10; i ++) {
					
					// i 用于测试，子线程执行的次数是否正确
					business.subThread(i);
				}
			}
		}).start();
		
		// 保证主线程运行的次数，使主线程的次数与子线程的次数一致
		for(int i = 1; i <= 10; i ++) {
			
			// i 用于测试，主线程执行的次数是否正确
			business.mainThread(i);
		}
	}
	
	class Business{
		
		// 控制标识，用于控制哪一个线程的执行
		boolean bShouldSub = true;
		
		// 主线程
		public synchronized void mainThread(int i) {
			
			// 如果为true时，则线程进入阻塞状态
			if(bShouldSub) {
				
				try {
					
					// 线程阻塞，释放锁
					this.wait();
					
					System.out.println("MainThread's this name ：" + this.getClass());
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				// 控制主线程的循环次数
				for(int j = 1; j <= 5; j ++) {
					
					System.out.println(Thread.currentThread().getName() + "线程：i = " + i + ", j = " + j);
				}
			}
			
			bShouldSub = true;
			
			// 解除锁，激活线程
			this.notify();
			
			System.out.println("MainThread's");
			
		}
		
		// 子线程
		public synchronized void subThread(int i) {
			
			// 如果为false时，子线程进入阻塞状态
			if(!bShouldSub) {
				
				try {
					
					// 线程阻塞，释放锁
					this.wait();
					
					System.out.println("SubThread's this name ：" + this.getClass());
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				// 控制主线程的循环次数
				for(int j = 1; j <= 10; j ++) {
					
					System.out.println(Thread.currentThread().getName() + "线程：i = " + i + ", j = " + j);
				}
			}
			
			bShouldSub = false;
			
			// 激活线程
			this.notify();
			
			System.out.println("SubThread's");
			
		}
	}
}





































