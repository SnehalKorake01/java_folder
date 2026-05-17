class A{
	int a=10;
}
class B{
	int a=40;
}
class Child extends A,B{
	void fun(){
		System.out.println(a);
	}
}