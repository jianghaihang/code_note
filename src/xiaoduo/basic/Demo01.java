package xiaoduo.basic;

import java.util.Arrays;

public class Demo01 {

		public static void main(String[] args) {
			
			int[] str = {3,1,2,12,24,13,99,5,2,56};
			
//			Arrays.sort(str);
			
			System.out.println(str.length);
			
			System.out.println("冒泡排序前：" + Arrays.toString(str));

			// 开始时间
			long startTime = System.currentTimeMillis();
			
			for (int i = 0; i < str.length; i++) {
				
				for (int j = 0; j < str.length - 1; j++) {
					
					// 如果此处为小于号，则为冒泡倒序
					// 如果此处为大于号，则为冒泡正序
					if(str[j] < str[j + 1]) {
						
						int step = str[j +1];
						
						str[j +1] = str[j];
						
						str[j] = step;
						
//						System.out.println("i = " + i + ", j = " + j);
						
//						System.out.println("J层：" + Arrays.toString(str));
					}
//					System.out.println("I层：" + Arrays.toString(str));
				}
			}
			
			// 结束时间
			long endTime = System.currentTimeMillis();
			
			System.out.println("运行总用时：" + (endTime - startTime));
			
			System.out.println("冒泡排序后：" + Arrays.toString(str));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			// 声明并赋值
//			String str = "student. a am I";
//			
//			// 根据 " " 空格拆分
//			String[] strs = str.split(" ");
//			
//			String value = "";
//			
//			// 遍历数组
//			for(int i = 0; i < strs.length; i ++) {
//				
//				value = strs[i] + " " + value;
//				
//			}
//			
//			// 截取字符串并输出
//			System.out.println(value.substring(0,value.length() -1));
			
		}
}
