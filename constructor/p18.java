class Demo{
	public static void main(String[]args){
		Employee e1=new Employee();
		Employee e2=new Employee("snehal",2000);
		Employee e3=new Employee("sakshi",5000);
	}
}
class Employee{
	String name;
	int sal;
	Employee(){
		System.out.println("in nopara constr");
	}
	Employee(String n,int a){
		System.out.println("in para constr");
	}
}