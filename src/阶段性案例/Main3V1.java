package �׶��԰���;

import java.util.Scanner;

public class Main3V1 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("������ѧ��������");
		String name = scanner.nextLine();
		
		System.out.println("������ѧ����ѧ�ɼ���");
		Float math = scanner.nextFloat();
		
		System.out.println("������ѧ��Ӣ��ɼ���");
		Float english = scanner.nextFloat();
		
		System.out.println("������ѧ��������ɼ���");
		Float computer = scanner.nextFloat();
		
		System.out.println(name+" "+math+" "+english+" "+computer+" "+"�ܳɼ�"+(math+english+computer));
		
	}
}
