package �׶��԰���;

import java.util.Scanner;

public class Main3V2 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Student student =new Student();
		System.out.println("������ѧ��������");
		student.setName(scanner.nextLine());
		
		System.out.println("������ѧ����ѧ�ɼ���");
		student.setMath(scanner.nextFloat());
		
		System.out.println("������ѧ��Ӣ��ɼ���");
		student.setEnglish(scanner.nextFloat());
		
		System.out.println("������ѧ��������ɼ���");
		student.setComputer(scanner.nextFloat());
		System.out.println(student);//���Ҫ�����ַ���һ�����ѧ��������Ϣ��Ҫ�õ�toString����
		
		System.out.println("�����ܳɼ���");
		System.out.println(student.getScoreSum());
		System.out.println("��óɼ���");
		System.out.println(student.getMax());
		System.out.println("���ɼ���");
		System.out.println(student.getMin());
		System.out.println("����ƽ���ɼ���");
		System.out.println(student.getScoreAvg());
	}
}
