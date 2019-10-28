package xiaoduo.basic;

/**
 * 	正则表达式
 * @author admin
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		
		String data = "60";
		
		String regex = "[0-9]+";
		
		boolean flag = data.trim().matches(regex);
		
		int num = Integer.parseInt(data.trim());
		
		System.out.println(flag);
		
		/*
		 * 	邮箱的正则表达式
		 * 	[a-zA-Z0-9] + @[a-zA-Z0-9] + (\.[a-zA-Z])
		 */
//		String email = "jiang@tedu.cn";
//		
//		String regex = "[a-zA-Z0-9]+@[a-zA-Z]+(\\.[a-zA-Z]+)";
//		
//		System.out.println(regex);
//		
//		boolean match = email.matches(regex);
//		
//		if(match) {
//			 
//			System.out.println("是邮箱！");
//		}else {
//			
//			System.out.println("不是邮箱！");
//		}
	}
}
