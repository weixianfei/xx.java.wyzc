package �׶��԰���;

public class Student {	//����һ��ѧ����
	private String name;	//����
	private float math;//��ѧ�ɼ�
	private float english;//Ӣ��ɼ�
	private float computer;//������ɼ�
	//����ͬ�ļ���ʱ��Ctrl+Alt+�·����COPY��
	
//�Զ����ɹ�����
	public Student(String name, float math, float english, float computer) {
		super();
		this.name = name;
		this.math = math;
		this.english = english;
		this.computer = computer;
	}

//ʹ�ø������ɹ�������Ĭ�Ϲ�������
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	//�Զ����ɵ�Get Set����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public float getComputer() {
		return computer;
	}
	public void setComputer(float computer) {
		this.computer = computer;
	}
	
	//�Զ�����toString������****�ܺõķ���***
	@Override
	public String toString() {
		return "Student [name=" + name + ", math=" + math + ", english=" + english + ", computer=" + computer
				+ ", getScoreSum()=" + getScoreSum() + ", getScoreAvg()=" + getScoreAvg() + ", getMax()=" + getMax()
				+ ", getMin()=" + getMin() + "]";
	}

	//��ȡ�ܳɼ�
	public float getScoreSum(){
		return math+english+computer;
	}
	
	//��ȡ����ƽ����
	public float getScoreAvg(){
		return getScoreSum()/3;
	}
	
	//��ȡ������ߵĳɼ�
	public float getMax(){
		float max= math;
		if(max<english){
			max=english;
		}
		max= max <computer?computer:max;
		return max;
	}
	
	//��ȡ������͵ĳɼ�
	//ϵͳ�ṩ�ķ���
	public float getMin(){
		float min=math;
		min =Math.min(computer, min);
		min =Math.min(english, min);
		return min;
	}

}
