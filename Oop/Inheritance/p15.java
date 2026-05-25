class Demo{
	public static void main(String[]args){
		Employee e =new Employee(20);

	}
}
class Company{
	int a;
	Company(int a){
		this.a=a;
	}
 }
class Employee extends Company{
	int b;
	Employee(int b){
		super(10);
		this.b=b;
		System.out.println("in employee:"+this.b);
		System.out.println("in company:"+super.a);
	}
}