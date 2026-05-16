class Parent{
	void prop(){
		System.out.println("30 gunthe");
	}
}
class Child extends Parent{
	void prop(int a){
		System.out.println("4 acr");
	}
}
class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.prop();
		c.prop(10);
	}
}