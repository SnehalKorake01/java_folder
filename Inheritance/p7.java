class Parent{
	int paise=10;
}
class Child extends Parent{
	int paise=1000;
}
class Demo{
	public static void main(String[]args){
		Child c=new Child();
		System.out.println(c.paise);
		Parent p=new Parent();
		System.out.println(p.paise);
	}
}