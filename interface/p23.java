interface Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.fun();
	}
}
interface Parent{
	default void fun(){
		System.out.println("in A interface fun");
	}
}
class Child implements Parent{
	public void fun(){
		System.out.println("in Child class");
	}
}