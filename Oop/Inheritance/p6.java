class Parent{
	int paise=10;
}
class Child extends Parent{
	int paise=1000;
	void education(){
		System.out.println("Engin:"+this.paise);
	}
}
class Demo{
	public static void main(String[]args){
		Child c=new Child();
		c.education();
	}
}