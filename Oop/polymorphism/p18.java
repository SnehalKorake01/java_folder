class Demo{
	public static void main(String[]args){
		Parent p=new Child();
		p.fun();
		Child c=new Child();
		c.fun();
	}
}
class Parent{
	static void fun(){
		System.out.println("in parent fun");
	}
}
class Child extends Parent{
	static void fun(){
		System.out.println("in child fun");
	}
}
