package ThroughConstructor;

public class Test {
	
public static void main(String[] args) {
		
	Student stu = new Student(11,"Santosh","Pune");
				
		System.out.println(stu.getRollno());
		System.out.println(stu.getSname());
		System.out.println(stu.getSaddress());

}
}