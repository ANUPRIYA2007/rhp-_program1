import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
			int n=sc.nextInt();
			int arr[]=new int[n];
			int oc=0;
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				oc+=arr[i];
				
			}
			int zc=n-oc;
			if(zc<2){
				System.out.println("-1");
				 continue;
			}
			int ans=0;
			if(arr[0]==1){
				ans++;
			}
			if(arr[n-1]==1){
				ans++;
			}
			System.out.println(ans);
		}
	}
}