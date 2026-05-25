class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.fun();
	}
}
class Parent{
	final void fun(){
		System.out.println("in parent fun");
	}
}
class Child extends Parent{
	void fun(){
		System.out.println("in child fun");
	}
}