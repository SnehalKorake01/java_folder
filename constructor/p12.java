class Demo{
	public static void main(String[]args){
		Employee e1=new Employee();
		e1.display();
		Employee e2=new Employee();
		e2.display();
	}
}
class Employee{
	int a;
	Employee(){
		a=20;
	}
	void display(){
		System.out.println("data is:"+a);
	}
}