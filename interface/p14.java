interface A{
	default void fun(){
		System.out.println("in A interface fun");
	}
}
interface B{
	default void fun(){
		System.out.println("in B interface gun");
	}
}
class Child implements A,B{
	public void fun(){
		A.super.fun();
		B.super.fun();
	}
}
class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.fun();
	}
}