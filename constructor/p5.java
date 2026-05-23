class Demo{
	public static void main(String[]args){
		Codex c1=new Codex();
		System.out.println(c1);
		Codex c2=new Codex();
		System.out.println(c2);
	}
}
class Codex{
	int a=10;
	void fun(){
		System.out.println("in fun:"+a);
	}
}