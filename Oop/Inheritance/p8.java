class Demo{
	public static void main(String[]args){
		Employee e=new Employee();
	}
}
class Company{
	Company(){
		System.out.println("in company constr");
	}
}
class Employee extends Company{
		Employee(){
			System.out.println("in Employee constr");
		}
}