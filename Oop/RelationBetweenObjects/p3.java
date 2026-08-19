class PetrolEngine{
	void start(){
		System.out.println("petrolEngine");
	}
}
class DiselEngine{
	void start(){
		System.out.println("diselEngine");
	}
}
class Car{
	int price;
	String model;
	PetrolEngine p;
	Car(int price,String model){
		this.price=price;
		this.model=model;
		p=new PetrolEngine();
	}
	void startEngine(){
		p.start();
	}
}
class Demo{
	public static void main(String[]args){
		Car c1=new Car(70000,"Thar");
		c1.startEngine();
	}
}
		
		