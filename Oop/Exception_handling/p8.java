class Demo{
	public static void  main(String[]args){
		try{
			throw new ArithmeticException();
		}
		catch(ArithmeticException e){
			System.out.println("ganit shika");
		}
	}
}