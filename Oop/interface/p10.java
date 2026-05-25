interface A{
	default void fun(){
		System.out.println("in interface fun");
	}
}
class Child implements A{
	public void fun(){
		System.out.println("in child fun");
	}
}
class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.fun();
	}
}