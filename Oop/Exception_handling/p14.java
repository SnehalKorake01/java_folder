class Demo{
	public static void main(String[]args){
		try{
			String s=null;
			s.length();
			System.out.println(10/0);
		}
		catch(NullPointerException e){
			System.out.println("null pointer stored");
		}
		catch(Exception e){
			System.out.println("/by zero");
		}
	}
}