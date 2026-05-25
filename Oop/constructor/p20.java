class Demo{
	public static void main(String[]args){
		Codex c1=new Codex("snehal",23);
		Codex c2=new Codex("sakshi",20,97);
		Codex c3=new Codex();
		Codex c4=new Codex("jwala");
	}
}
class Codex{
	Codex(){
		System.out.println("in no para constr");
	}
	Codex(String name,int age){
		System.out.println("in two para constr");
	}
	Codex(String name,int age,int marks){
		System.out.println("in three para constr");
	}
	Codex(String name){
		System.out.println("in one para constr");
	}
}