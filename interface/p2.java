interface Parent{
	int a=10;
}
class Child implements Parent{
	void fun(){
		System.out.println(a);
	}
}
class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.fun();
	}
}