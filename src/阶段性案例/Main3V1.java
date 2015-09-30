package 阶段性案例;

import java.util.Scanner;

public class Main3V1 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("请输入学生姓名：");
		String name = scanner.nextLine();
		
		System.out.println("请输入学生数学成绩：");
		Float math = scanner.nextFloat();
		
		System.out.println("请输入学生英语成绩：");
		Float english = scanner.nextFloat();
		
		System.out.println("请输入学生计算机成绩：");
		Float computer = scanner.nextFloat();
		
		System.out.println(name+" "+math+" "+english+" "+computer+" "+"总成绩"+(math+english+computer));
		
	}
}
