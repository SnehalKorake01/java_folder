class Demo{
	public static void main(String[]args){
		Employee e1=new Employee("snehal",2000);
		Employee e2=new Employee("sakshi",5000);
		e1.display();
		System.out.println(".......................");
		e2.display();
	}
}
class Employee{
	String name;
	int sal;
	Employee(String s,int a){
		name=s;
		sal=a;
	}
	void display(){
		System.out.println("Name is:"+name+" Sal is:"+sal);
	}
}