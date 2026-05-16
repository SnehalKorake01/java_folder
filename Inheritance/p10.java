class Demo{
	public static void main(String[]args){
		Employee e=new Employee();
		e.fun();
}
class Company{
	int paise=1000;
}
class Employee extends Company{
	void fun(){
		System.out.println(this);
		System.out.println(super);
	}
}