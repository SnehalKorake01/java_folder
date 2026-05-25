class Demo{
	public static void main(String[]args){
		Child c=new Parent();
		c.fun();
	}
}
class Parent{
	Parent(){
		System.out.println("in parent constr");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("in child constr");
	}
	void fun(){
		System.out.println("in fun");
	}
}