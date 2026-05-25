class Parent{
	void property(){
		System.out.println("2 acr");
	}
}
class Child extends Parent{
	void childProperty(){
		System.out.println("flat....");
	}
}
class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.property();
		c.childProperty();
	}
}
