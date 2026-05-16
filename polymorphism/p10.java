class Parent{
	void prop(){
		System.out.println("30 acr");
	}
}
class Child extends Parent{
	void education(){
		System.out.println("BTech");
	}
	int prop(){
		System.out.println("30 acr and 40 acr");
	}
}
class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.education();
		c.prop();
	}
}