package 面向对象;

public class 静态存储区 {
}
//静态存储区
class BeijingPerson{
	//属性一般都私有！
	public static String address="北京！";
	private String name;
	private int age;
	//用ALT+SHIFT+S 自动生成Get、Set方法。完成属性的封装。封装后别人看不到你真正的数据
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
