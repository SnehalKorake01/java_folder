interface Demo{
	public static void main(String[]args){
		Child c=new Child();
		
	}
}
interface Parent{
	int a=10;
}
class Child implements Parent{
	
	void fun(){
	a=20;
	System.out.println(a);
	}
}
