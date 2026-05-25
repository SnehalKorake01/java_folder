class Demo{
	public static void main(String[]args){
		Employee e1=new Employee(10);
		Employee e2=new Employee(20);
		System.out.println(e1.a);
		System.out.println(e2.a);
	}
}
class Employee{
	int a;
	Employee(int b){
		a=b;
	}
}