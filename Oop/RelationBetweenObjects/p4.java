interface Engine{
	void start();
}
class PetrolEngine implements Engine{
	public void start(){
		System.out.println("petrol");
	}
}
class DiselEngine implements Engine{
	public void start(){
		System.out.println("Disel");
	}
}
class Electric implements Engine{
	public void start(){
		System.out.println("electric");
	}
}
class Car{
	int price;
	String model;
	Engine e;
	Car(int price,String model,Engine e){
		this.price=price;
		this.model=model;
		this.e=e;
	}
	void startEngine(){
		e.start();
	}
}
class Demo{
	public static void main(String[]args){
		PetrolEngine p1=new PetrolEngine();
		Car c1=new Car(70000,"thar",p1);
		c1.startEngine();
		DiselEngine d1=new DiselEngine();
		Car c2=new Car(8000000,"BMW",d1);
		c2.startEngine();
		Electric e1=new Electric();
		Car c3=new Car(1000000,"fortuner",e1);
		c3.startEngine();
	}
}
		