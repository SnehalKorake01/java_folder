class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.fun();
	}
}
class Parent{
	private void fun(){
		System.out.println("in parent fun");
	}
}
class Child extends Parent{
	private void fun(){
		System.out.println("in child fun");
	}
}