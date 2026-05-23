class Demo{
	public static void main(String[]args){
		Codex c1=new Codex();
		c1.fun();
	}
}
class Codex{
	int a=10;
	void fun(){
		System.out.println("in fun:"+a);
	}
}