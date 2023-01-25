package ThroughSetter;

public class Test {
	
	public static void main(String[] args) {
		
		Student stu=new Student();
		stu.setRollno(20);
		stu.setSname("Yashmit");
		stu.setSaddress("Pune");
		
		System.out.println(stu.getRollno());
		System.out.println(stu.getSname());
		System.out.println(stu.getSaddress());
	}

}
