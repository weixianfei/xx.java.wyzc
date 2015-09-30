package 阶段性案例;

public class Student {	//建立一个学生类
	private String name;	//属性
	private float math;//数学成绩
	private float english;//英语成绩
	private float computer;//计算机成绩
	//有相同的几行时，Ctrl+Alt+下方向键COPY；
	
//自动生成构造器
	public Student(String name, float math, float english, float computer) {
		super();
		this.name = name;
		this.math = math;
		this.english = english;
		this.computer = computer;
	}

//使用父类生成构造器（默认构造器）
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	//自动生成的Get Set方法
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
	
	//自动生成toString方法！****很好的方法***
	@Override
	public String toString() {
		return "Student [name=" + name + ", math=" + math + ", english=" + english + ", computer=" + computer
				+ ", getScoreSum()=" + getScoreSum() + ", getScoreAvg()=" + getScoreAvg() + ", getMax()=" + getMax()
				+ ", getMin()=" + getMin() + "]";
	}

	//获取总成绩
	public float getScoreSum(){
		return math+english+computer;
	}
	
	//获取三科平均分
	public float getScoreAvg(){
		return getScoreSum()/3;
	}
	
	//获取分数最高的成绩
	public float getMax(){
		float max= math;
		if(max<english){
			max=english;
		}
		max= max <computer?computer:max;
		return max;
	}
	
	//获取分数最低的成绩
	//系统提供的方法
	public float getMin(){
		float min=math;
		min =Math.min(computer, min);
		min =Math.min(english, min);
		return min;
	}

}
