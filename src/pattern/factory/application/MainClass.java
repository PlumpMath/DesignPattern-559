package pattern.factory.application;

import java.util.Scanner;

public class MainClass {
	
	private static Scanner sc = new Scanner(System.in);;
	private static double result = 0.0D;
	private static double num1 = 0.0D;
	private static double num2 = 0.0D;

	public static void main(String[] args) {
		
		//1.接收控制台输入
		System.out.println("——计算器程序——");
		
		System.out.println("请输入第一个操作数：");
		String str1 = sc.nextLine();
		num1 = Double.parseDouble(str1);
		
		System.out.println("请输入操作符：");
		String oper = sc.nextLine();
		
		System.out.println("请输入第二个操作数：");
		String str2 = sc.nextLine();
		num2 = Double.parseDouble(str2);
		
		//2.计算
		if("+".equals(oper)) {
			//直接调用工厂来生产对象是简单工厂，一条线
			//Operation op = OperationFactory.getOperation(oper);
			
			//先获得工厂再获得对象是工厂方法模式，两条线
			OperationFactory opf = new AddFactory();
			Operation op = opf.getFactory();
			op.setNum1(num1);
			op.setNum2(num2);
			result = op.getResult();
		}
		
		//3.返回结果
		System.out.println(str1 + oper + str2 + "=" + result);
	}
}
