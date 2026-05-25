class Demo{
	public static void main(String[]args){
		Codex c1=new Codex();
		c1.fun();
		c1.fun(10);
	}
}
class Codex{
	void fun(){
		System.out.println("in fun");
	}
	void fun(int a){
		System.out.println("in para constr:"+a);
	}
}