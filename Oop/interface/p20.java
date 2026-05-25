interface Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.education();
		System.out.println(c.a);
		System.out.println(Parent.a);
	}
}
interface Parent{
	int a=10;
	void education();
}
class Child implements Parent{
	public void education(){
		System.out.println("BTech:"+a);
	}
}