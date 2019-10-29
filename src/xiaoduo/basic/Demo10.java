package xiaoduo.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * 	有一个字符串，其中包含中文字符、英文字符、数字字符等，请统计和打印出各个字符的个数
 * @author admin
 *
 */
public class Demo10 {

	public static void main(String[] args) {
		
		String str = "中国china666___+++制造";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
		
		for(int i = 0; i < str.length(); i ++) {
			
			// 遍历每一个字符
			Character ch = str.charAt(i);
			
			// 从map中获取到字符的个数
			Integer num = map.get(ch);
			
			// 如果字符的个数为空，则等于1
			if(num == null) {
				
				num = 1;
				
			}else {
				
				// 如果字符的个数不为空，则加1
				num = num + 1;
			}
			
			// 将字符和个数，放到map集合当中
			map.put(ch, num);
			
		}
		
		// map.entrySet：返回所包含的映射关系的Set集合(一个关系就是一个键值对)
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}





