package ������ʽ;

import java.util.Scanner;

/**
 * ��֤�����Ƿ���������
 * 		yyferfer@163.com
 * 
 * 		yasuoa_1_2@163.com
 * 
 * 		aa142133@sina.com.cn
 * 
 * 		hy@taobao.com
 * 
 * 		hy@taobao.cn
 * 
 * 		123aa2123 @ qq . com
 * 
 * 		\\w+@\\w{2,6}\.[a-z]{2,3}
 * 
 * @author max
 *
 */

public class Demo {
	public static void main(String[] args) {
		String regex = "\\w+@\\w{2,6}(\\.[a-z]{2,3})+";
		Scanner sc = new Scanner(System.in);
		System.out.println("���������䣺");
		String qq = sc.nextLine();
		boolean b = qq.matches(regex);
		System.out.println(b);
	}
}
