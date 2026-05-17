interface A{
	static void fun(){
		System.out.println("in interface fun");
	}
}
class Child implements A{
}
class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.fun();
	}
}
