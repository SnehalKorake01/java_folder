class Company{
	String compName;
	String dept;
	Company(String compName,String dept){
		this.compName=compName;
		this.dept=dept;
	}
	String getCompName(){
		return compName;
	}
	String getDept(){
		return dept;
	}
}
class Employee{
	String name;
	int sal;
	Company company;
	Employee(String name,int sal,Company company){
		this.name=name;
		this.sal=sal;
		this.company=company;
	}
	String getName(){
		return name;
	}
	int getSal(){
		return sal;
	}
	Company getCompany(){
		return company;
	}
}
class Demo{
	public static void main(String[]args){
		Company c1=new Company("tcs","sde");
		Employee e1=new Employee("snehal",50000,c1);
		System.out.println("Name is:"+e1.getName()+"Sal is:"+e1.getSal()+" Comapny is:"+e1.getCompany().getCompName());
	}
}
		