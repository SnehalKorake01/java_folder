class Demo{
	public static void main(String[]args){
	Student s1=new Student();
	s1.gun();
	Student.fun();
	}
}
class Student{
	static void fun(){
		System.out.println("in static fun");
	}
	void gun(){
		System.out.println("in instance method");
	}
}
