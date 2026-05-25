class Demo{
	public static void main(String[]args){
		System.out.println("in main");
		Codex c1=new Codex();
		c1.fun();
		
	}
}
class Codex{
	static{
		System.out.println("in static block 1");
	}
	static{
		System.out.println("in static block 2");
	}
	static void fun(){
		System.out.println("in static void fun");
	}
}
