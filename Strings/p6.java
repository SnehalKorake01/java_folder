class Demo{
	public static void main(String[]args){
		String s="snehal";
		System.out.println(System.identityHashCode(s));
		String s1=new String("snehal");
		System.out.println(System.identityHashCode(s1));
	}
}