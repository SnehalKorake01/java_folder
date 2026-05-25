interface A{
	default void fun(){
		System.out.println("in A interface fun");
	}
}
interface B{
	default void fun(){
		System.out.println("in B interface fun");
	}
}
class Child implements A,B{
}
class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.fun();
	}
}