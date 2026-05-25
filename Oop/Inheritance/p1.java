class Parent{
	int paise=1000;
}
class Child{
	void display(){
		Parent p=new Parent();
		System.out.println(p.paise);
	}
}
class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.display();
	}
}