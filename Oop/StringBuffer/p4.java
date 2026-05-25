class Demo{
	public static void main(String[]args){
		StringBuffer s=new StringBuffer("snehal");
		System.out.println(System.identityHashCode(s));
		s.append("korake");
		System.out.println(System.identityHashCode(s));
	}
}
