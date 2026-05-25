class Demo{
	public static void main(String[]args){
		Codex c1=new Codex();
		c1.add(10,20);
		c1.add(10,20,30);
	}
}
class Codex{
	void add(int a,int b){
		System.out.println("add of two:"+(a+b));
	}
	void add(int a,int b,int c){
		System.out.println("add of three:"+(a+b+c));
	}
}