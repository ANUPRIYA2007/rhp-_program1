import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int start =1;
		int end =10;
		for(int i=1;i<=n;i++){
			int curr=sc.nextInt();
			if (!(curr >= start && curr <= end)){
				System.out.println("NO");
				return;
			}
			if(i%10==0){
				start+=10;
				end+=10;
			}
		}
		System.out.println("YES");
		
	}
}