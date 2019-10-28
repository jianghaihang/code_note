package xiaoduo.basic;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Demo05 {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String name = "淡淡";
		
		// 字符串根据字符集进行编码
		String name01 = URLEncoder.encode(name,"UTF8");
		
		System.out.println(name01);
		
		// 字符串根据字符集进行解码
//		String name02 = URLDecoder.decode(name01,"ISO8859-1");
		String name02 = URLDecoder.decode(name01,"UTF8");
		
		System.out.println(name02);
	}

}
