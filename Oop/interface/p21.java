interface Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.education();
	}
}
interface Parent{
	int a=10;
}
class Child implements Parent{
	void education(){
		System.out.println(Parent.a);
	}
}