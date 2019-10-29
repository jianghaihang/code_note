package xiaoduo.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 	实现异步交互
 * @author admin
 *
 */
public class MyExecutor {

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		try {

			demo.fun();
			
			System.out.println("你先睡吧，我先回家啦!");
			
		} catch (Exception e) {
			
			System.out.println("业务程序报错！");
		}
	}
}

class Demo{
	
	// ExecutorService ：线程池的主要接口
	ExecutorService executor = Executors.newCachedThreadPool();
	
	public void fun() {
		
		executor.submit(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					
					// 要执行的业务代码，我们这里没有写方法，可以让线程休息几秒进行测试
					Thread.sleep(10000);
					
					System.out.println("睡够了！");
					
					executor.shutdown();
					
				} catch (Exception e) {

					throw new RuntimeException("报错了！");
				}
			}
		});
	}
}




























