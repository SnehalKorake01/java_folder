class Demo{
	public static void main(String[]args){
		Codex c1=new Codex();
		System.out.println(c1.a);
		c1.a=20;
		System.out.println(c1.a);
	}
}
class Codex{
	int a;
	void fun(){
		System.out.println("in fun:"+a);
	}
}