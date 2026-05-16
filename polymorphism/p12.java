class Demo{
	public static void main(String[]args){
		Parent p=new Child();
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
}
