abstract class Person{
	abstract void fun();
	int age;
	String name;
	Person(int age,String name){
		this.age=age;
		this.name=name;
	}
}
class Student extends Person{
	void fun(){
		System.out.println("in child fun");
	}
	int marks;
	Student(int marks,int age,String name){
		super(age,name);
		this.marks=marks;
	}
	void display(){
		System.out.println("Name is:"+this.name+" Age is:"+this.age+" Marks is:"+this.marks);
	}
}
class Demo{
	public static void main(String[]args){
		Student s1=new Student(99,23,"snehal");
		s1.display();
	}
}