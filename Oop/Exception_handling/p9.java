class Demo{
	public static void main(String[]args){
		try{
			throw new ArithmeticException("ganit shika");
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("ganit shika"+e.getMessage());
		}
	}
}