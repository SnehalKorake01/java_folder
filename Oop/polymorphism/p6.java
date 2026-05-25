class Demo{
	public static void main(String[]args){
		Codex c=new Codex();
		c.fun();
	}
}
class Codex{
	int fun(){
		System.out.println("in fun");
	}
	void fun(){
		System.out.println("in void fun");
	}
}