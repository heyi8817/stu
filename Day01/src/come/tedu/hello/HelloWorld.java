package come.tedu.hello;
/*
 ����һ����
 * package ��:����������Ĺؼ���
 * come.tedu.hello:����----ȫСд����˾��������д
 *   ;    java���Ľ�����
 */

import java.util.Scanner;

/*
 * ����һ����
 * public   �����ģ����� �����η�
 * class    �࣬����������Ĺؼ���
 * HelloWorld   ����
 * ����----�շ����
 * {JAVA����}
 */



/*
 * ����һ��main������
 * main����������������������
 * public �����ģ��Ƿ��������η�
 * static ��̬�ģ������Ǿ�̬��
 * void   ��/�� ������û�з���ֵ��
 * main   ������
 * ()     �����ı��
 * String[]args  �����Ĳ���
 */
public class HelloWorld {

	public static void main(String[] args) {

		/*
		 * ָ���������	
		 * system ϵͳ������ϵͳָ��
		 * out ����һ���������
		 * print ��ӡ
		 * println ��ӡ�껻��
		 * ()�����ı��
		 * 123 �������123
		 * "HelloWorld"����ַ���������Ӧ""������	
		 */
		System.out.print(123);
		System.out.println("HelloWorld");

     
		
		
		
		
		
	for(int i=0;i<=9;i++) {
		for(int j =1;j<=i;j++) {
			
			System.out.print(j+"*"+i+"="+i*j+"\t" );
		}
	System.out.println();
	}Scanner sc = new Scanner(System.in);
	System.out.println("���������");
	int year = sc.nextInt();
	
	if(year%4==0&&year%100!=0||year%400==0) {
		System.out.println(year+"��������");
	}else {
	System.out.println(year+"����ƽ��");
	}

		
		
	}

}
