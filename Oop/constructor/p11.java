class Demo{
	public static void main(String[]args){
		Employee e=new Employee();
		System.out.println(e);
		Employee e1=new Employee();
		System.out.println(e1);
	}
}
class Employee{
	Employee(){
		System.out.println("in constr");
	}
}