class Demo{
	public static void main(String[]args){
		Student s1=new Student();
		Student s2=new Student("snehal",23);
		Student s3=new Student("Sakshi",20,"satara");
	}
}
class Student{
	String name;
	int age;
	String add;
	Student(){
		System.out.println("in no para constr");
	}
	Student(String name,int age){
		System.out.println("Name is:"+name+" "+"Age is:"+age);
	}
	Student(String name,int age,String add){
		System.out.println("Name is:"+name+" "+"Age is:"+age+" "+"Address is:"+add);
	}
}