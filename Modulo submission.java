import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=0;
		for(int i=0;i<n;i++){
			int curr=sc.nextInt();
			int m=curr-1;
			f+=m;
			
		}
		System.out.println(f);
	}
}