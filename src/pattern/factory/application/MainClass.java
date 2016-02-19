package pattern.factory.application;

import java.util.Scanner;

public class MainClass {
	
	private static Scanner sc = new Scanner(System.in);;
	private static double result = 0.0D;
	private static double num1 = 0.0D;
	private static double num2 = 0.0D;

	public static void main(String[] args) {
		
		//1.���տ���̨����
		System.out.println("�������������򡪡�");
		
		System.out.println("�������һ����������");
		String str1 = sc.nextLine();
		num1 = Double.parseDouble(str1);
		
		System.out.println("�������������");
		String oper = sc.nextLine();
		
		System.out.println("������ڶ�����������");
		String str2 = sc.nextLine();
		num2 = Double.parseDouble(str2);
		
		//2.����
		if("+".equals(oper)) {
			//ֱ�ӵ��ù��������������Ǽ򵥹�����һ����
			//Operation op = OperationFactory.getOperation(oper);
			
			//�Ȼ�ù����ٻ�ö����ǹ�������ģʽ��������
			OperationFactory opf = new AddFactory();
			Operation op = opf.getFactory();
			op.setNum1(num1);
			op.setNum2(num2);
			result = op.getResult();
		}
		
		//3.���ؽ��
		System.out.println(str1 + oper + str2 + "=" + result);
	}
}
