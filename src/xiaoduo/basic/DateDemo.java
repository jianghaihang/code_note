package xiaoduo.basic;

import java.util.Timer;
import java.util.TimerTask;

public class DateDemo {

	public static void main(String[] args) {
		
		// 创建一个定时器
		Timer timer = new Timer();
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("aaaaa");
			}
		}, 0L, 1000L);
		
		// 取消定时器
		timer.cancel();
	}
}
