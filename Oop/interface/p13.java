interface A{
	default void fun(){
		System.out.println("in interface fun");
	}
}
interface B{
	default void gun(){
		System.out.println("in B interface gun");
	}
}
class Child implements A,B{
}
class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.fun();
		c.gun();
	}
}