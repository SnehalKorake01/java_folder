class Demo{
	public static void main(String[]args){
		Codex c=new Codex();
		c.fun(20);
	}
}
class Codex{
	void fun(int b){
		System.out.println("in fun");
	}
	void fun(int a){
		System.out.println("in fun with para:"+a);
	}
}