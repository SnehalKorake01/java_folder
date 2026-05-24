class Demo{
	public static void main(String[]args){
		String s="snehal";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		String s1="korake";
		s.concat(s1);
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
	}
}
