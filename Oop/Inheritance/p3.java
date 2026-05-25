class Parent{
	int paise=1000;
	void property(){
		System.out.println("2 acr");
	}
}
class Child extends Parent{
	void education(){
		System.out.println("BTech:"+paise);
	}
	void shopping(){
		System.out.println("shopping:"+paise);
	}
	void childProp(){
		System.out.println("flat...");
	}
}
class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.education();
		c.shopping();
		c.childProp();
	}
}