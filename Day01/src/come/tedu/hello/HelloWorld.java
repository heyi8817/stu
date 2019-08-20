package come.tedu.hello;
/*
 定义一个包
 * package 包:用来定义包的关键字
 * come.tedu.hello:包名----全小写，公司域名倒着写
 *   ;    java语句的结束符
 */

import java.util.Scanner;

/*
 * 定义一个类
 * public   公共的，是类 的修饰符
 * class    类，用来定义类的关键字
 * HelloWorld   类名
 * 命名----驼峰规则
 * {JAVA代码}
 */



/*
 * 定义一个main方法，
 * main方法是主方法，程序的入口
 * public 公共的，是方法的修饰符
 * static 静态的，方法是静态的
 * void   空/无 方法是没有返回值的
 * main   方法名
 * ()     方法的标记
 * String[]args  方法的参数
 */
public class HelloWorld {

	public static void main(String[] args) {

		/*
		 * 指定输出内容	
		 * system 系统，发出系统指令
		 * out 做出一个输出动作
		 * print 打印
		 * println 打印完换行
		 * ()方法的标记
		 * 123 输出数字123
		 * "HelloWorld"输出字符串，内容应""引起来	
		 */
		System.out.print(123);
		System.out.println("HelloWorld");

     
		
		
		
		
		
	for(int i=0;i<=9;i++) {
		for(int j =1;j<=i;j++) {
			
			System.out.print(j+"*"+i+"="+i*j+"\t" );
		}
	System.out.println();
	}Scanner sc = new Scanner(System.in);
	System.out.println("请输入年份");
	int year = sc.nextInt();
	
	if(year%4==0&&year%100!=0||year%400==0) {
		System.out.println(year+"年是闰年");
	}else {
	System.out.println(year+"年是平年");
	}

		
		
	}

}
