class Demo{
	public static void main(String[]args){
		Codex c1=new Codex();
		c1.display();
	}
}
class Codex{
	int age;
	String name;
	boolean ans;
	double marks;
	float avg;
	void display(){
		System.out.println("Name is:"+name+" Age is:"+age+" Marks is:"+marks+" Avg is:"+avg+" Ans is:"+ans);
	}
}