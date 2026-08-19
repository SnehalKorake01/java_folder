abstract class Person{
	void fun(){
		System.out.println("in fun");
	}
}
class Student extends Person{
	void gun(){
		System.out.println("in gun");
	}
}
class Demo{
	public static void main(String[]args){
		Student s1=new Student();
		s1.fun();
		s1.gun();
	}
}