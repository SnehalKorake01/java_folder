class Demo{
	public static void main(String[]args){
		Codex c=new Codex();
		c.fun();
		c.fun(10);
	}
}
class Codex{
	void fun(){
		System.out.println("in fun no para");
	}
	int fun(int a){
		System.out.println("in fun with para:"+a);
		return a;
	}
}