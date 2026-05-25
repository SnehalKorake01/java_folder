class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.fun();
		Parent p=new Child();
		p.fun();
	}
}
class Parent{
	void fun(){
		System.out.println("in parent fun");
	}
}
class Child extends Parent{
	final void fun(){
		System.out.println("in child fun");
	}
}