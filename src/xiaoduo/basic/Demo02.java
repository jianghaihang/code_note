package xiaoduo.basic;

import java.util.Scanner;

/**
 * 	十进制与二进制的相互转换
 * 
 * @Ten
 * 1，Integer.parseInt(十进制数,权重)
 * 
 * @Two
 * 2，Integer.toBinaryString(二进制数)
 * 
 * @author admin
 *
 */
public class Demo02 {
	
	private static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {

		Demo02 demo02 = new Demo02();
		
		System.out.println("选择转换进制：[1：十进制][2：二进制][0：退出此模式][-1：退出系统]");
		
		boolean flag = true;
		
		while(flag) {
			
			int data = scanner.nextInt();
			
			if(data == -1) {
				
				System.out.println("退出系统！");
				
				scanner.close();
				
				flag = false;
				
			}else if(data == 0){
				
				System.out.println("退出此模式！请重新选择：");
				
				continue;
				
			}else if(data == 1) {
				
//				十进制转二进制
				
				demo02.changeTen();
				
			}else if(data == 2) {
				
//				二进制转十进制
				
				demo02.changeTwo();
				
				continue;
			}else {
				
				System.out.println("抱歉！不知道你输入的是啥？请重新输入：");
			}
		}
		
	}
	
	/**
	 * 	二进制转成十进制
	 */
	public void changeTen() {
		
		System.out.println("请输入一个二进制，将转换为十进制：");
		
		scanner.nextLine();
		
		boolean flag = true;
		
		while(flag) {
			
			String two = scanner.nextLine();
			
			if(two.equals("0")) {
				
				System.out.println("已退出此模式！请重新选择：");
				
				flag = false;
					
			}else {
				
				System.out.print("十进制数为：");
				
//				// 将二进制转成十进制
				System.err.println(Integer.parseInt(two, 2));
			}
			
		}
		
	}
	
	/**
	 * 	十进制转为二进制
	 */
	public void changeTwo() {
		
		System.out.println("请输入一个十进制，将转换为二进制：");
		
		boolean flag = true;
		
		while(flag) {
			
			int ten = scanner.nextInt();
			
			if(ten == 0) {
			
				System.out.println("已退出此模式！请重新选择：");
				
				flag = false;
				
			}else {
				
				System.out.print("转为二进制数是：");
				
				// 将十进制转成二进制
				System.err.println(Integer.toBinaryString(ten));
			}
			
		}
		
	}
}



























