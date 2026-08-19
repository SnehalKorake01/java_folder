abstract class Person{
	 abstract void fun();
	void property(){
		System.out.println("parent property");
	}
}
class Student extends Person{
	 public void fun(){
		System.out.println("in child fun");
	}

	void property(){
		System.out.println("child property");
	}
}
class Demo{
	public static void main(String[]args){
		Student s1=new Student();
		s1.property();
	}
}