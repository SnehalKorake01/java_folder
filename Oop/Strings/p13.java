class Demo{
	public static void main(String[]args){
		String s="disha";
		System.out.println(System.identityHashCode(s));
		String s1="ics";
		s=s+s1;
		System.out.println(System.identityHashCode(s));
		s="dishaics";
		System.out.println(System.identityHashCode(s));
	}
}