import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered elements are:");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
