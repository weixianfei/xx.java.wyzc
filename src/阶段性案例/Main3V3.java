package �׶��԰���;

import java.util.Scanner;

public class Main3V3 {
	private Scanner scanner= new Scanner(System.in);
	private Student[] students =new Student[3];
	private Student student =new Student();
	public Main3V3(){//������
		for(int i=0;i<students.length;i++){
			System.out.println("������ѧ��������");
			student.setName(scanner.next());
			System.out.println("������ѧ����ѧ�ɼ���");
			student.setMath(scanner.nextFloat());
			System.out.println("������ѧ��Ӣ��ɼ���");
			student.setEnglish(scanner.nextFloat());
			System.out.println("������ѧ��������ɼ���");
			student.setComputer(scanner.nextFloat());
			System.out.println(student);//���Ҫ�����ַ���һ�����ѧ��������Ϣ��Ҫ�õ�toString����
			return;
		}
		/*
		System.out.println("�����ܳɼ���");
		System.out.println(student.getScoreSum());
		System.out.println("��óɼ���");
		System.out.println(student.getMax());
		System.out.println("���ɼ���");
		System.out.println(student.getMin());
		System.out.println("����ƽ���ɼ���");
		System.out.println(student.getScoreAvg());
		*/
	}
	public static void main(String[] args) {
		new Main3V3();
	}
}
