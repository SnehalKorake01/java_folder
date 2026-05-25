class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.education();
		c.marry();

	}
}
abstract class Parent{
	void marry(){
		System.out.println("disha patni");
	}
	abstract void education();
}
class Child extends Parent{
	void education(){
		System.out.println("BTech");
	}
}