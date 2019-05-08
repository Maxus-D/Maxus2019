package 正则表达式;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		String regex = "-";
		
		String str = "18-24";
		
		String[] strings = str.split(regex);
//		for (String string : strings) {
//			System.out.println(string);
//		}
		
		int startAge = Integer.parseInt(strings[0]);
		
		int endAge = Integer.parseInt(strings[1]);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入你的年龄：");
		
		int age = sc.nextInt();
		
		if (age>=startAge && age<=endAge) {
			System.out.println("你就是我要找的，"+age);
		}else {
			System.out.println("你不是我想要的！");
		}
	}
}
