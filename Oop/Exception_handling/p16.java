class MyException extends RuntimeException{
	MyException(String msg){
		super(msg);
	}
}
class Demo{
	public static void main(String[]args){
		int phno=100;
		try{
			if(phno>3){
				throw new MyException ("number is smaller in digits");
			}
			else{
				System.out.println("valid no");
			}
		}
		catch(MyException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}