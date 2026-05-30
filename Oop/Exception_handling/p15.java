interface Demo{
	static void main(String[]args){
		int phno=1000;
		if(phno<3){
			throw new MyException ("no is smaller in digits");
		}
		else{
			System.out.println("valid no");
		}
	}
}
class MyException extends RuntimeException{
		MyException(String msg){
			super(msg);
		}
}