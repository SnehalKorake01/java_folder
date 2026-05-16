class Demo{
	public static void main(String[]args){
		Parent p=new Child();
		p.fun();
	}
}
class Parent{
	void fun(){
		System.out.println("in parent constr");
	}
}
class Child extends Parent{
	void fun(){
		System.out.println("in child fun");
	}
}