class Demo{
	public static void main(String[]args){
		Employee e1=new Employee();
	}
}
class Company{
	Company(int a){
		System.out.println("in para company constr:"+a);
	}
}
class Employee extends Company{
	Employee(){
		super(10);
		System.out.println("in employee");
	}
}