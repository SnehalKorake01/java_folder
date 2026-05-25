class Demo{
	public static void main(String[]args){
		Codex c1=new Codex();
		c1.display();
		c1.name="snehal";
		c1.age=23;
		c1.display();
	}
}
class Codex{
	int age;
	String name;
	void display(){
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
	}
}
	