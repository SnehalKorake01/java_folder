class Demo{
	public static void main(String[]args){
		Employee e1=new Employee();
		e1.display();
		Employee e2=new Employee("snehal",2000);
		e2.display();
		Employee e3=new Employee("sakshi");
		e3.display();
		
	}
}
class Employee{
	String name;
	int sal;
	Employee(){
	}
	Employee(String n,int a){
		name=n;
		sal=a;
	}
	Employee(String n){
		name=n;
	}
	void display(){
		System.out.println("name is:"+name+" Sal is:"+sal);
	}
}