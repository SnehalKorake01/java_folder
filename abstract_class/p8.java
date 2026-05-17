class Demo{
	public static void main(String[]args){
		Parent p=new Child();
		p.education();
		p.marry();
		p.startup();

	}
}
abstract class Parent{
	void marry(){
		System.out.println("disha patni:");
	}
	abstract void education();
}
class Child extends Parent{
	void education(){
		System.out.println("BTech");
	}
	void marry(){
		System.out.println("X");
	}
	void startup(){
		System.out.println("chaha tapri");
	}
}