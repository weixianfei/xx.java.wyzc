package 阶段性案例;

import java.util.Scanner;

public class Main3V2 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Student student =new Student();
		System.out.println("请输入学生姓名：");
		student.setName(scanner.nextLine());
		
		System.out.println("请输入学生数学成绩：");
		student.setMath(scanner.nextFloat());
		
		System.out.println("请输入学生英语成绩：");
		student.setEnglish(scanner.nextFloat());
		
		System.out.println("请输入学生计算机成绩：");
		student.setComputer(scanner.nextFloat());
		System.out.println(student);//如果要用这种方法一次输出学生所有信息，要用到toString方法
		
		System.out.println("三科总成绩：");
		System.out.println(student.getScoreSum());
		System.out.println("最好成绩：");
		System.out.println(student.getMax());
		System.out.println("最差成绩：");
		System.out.println(student.getMin());
		System.out.println("三科平均成绩：");
		System.out.println(student.getScoreAvg());
	}
}
