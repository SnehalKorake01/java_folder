class Parent{
	int paise=1000;
}
class Child extends Parent{
	void education(){
		System.out.println("BTech:"+paise);
	}
	void shopping(){
		System.out.println("Shopping:"+paise);
	}
}
class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.education();
		c.shopping();
	}
}