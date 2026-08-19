interface Services{
	void sendNotification();
}
class Email implements Services{
	public void sendNotification(){
		System.out.println("email sent");
	}
}
class SMS implements Services{
	public void sendNotification(){
		System.out.println("sms sent");
	}
}
class Employee{
	String name;
	int age;
	Services s;
	Employee(String name,int age,Services s){
		this.name=name;
		this.age=age;
		this.s=s;
	}
	void register(){
		System.out.println("registered");
		s.sendNotification();
	}
}
class Demo{
	public static void main(String[]args){
		Email e=new Email();
		Employee e1=new Employee("snehal",23,e);
		e1.register();
		SMS s1=new SMS();
		Employee e2=new Employee("sakshi",20,s1);
		e2.register();
	}
}