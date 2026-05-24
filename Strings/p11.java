class Demo{
	public static void  main(String[]args){
		String s="disha";
		System.out.println(System.identityHashCode(s));
		s="innovation";
		System.out.println(System.identityHashCode(s));
	}
}