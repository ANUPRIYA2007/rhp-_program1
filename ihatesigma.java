/*import java.util.*;
class Main{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
     int pre[] = new int[n];

     for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
     }
     int sum =0;
     int last=0;
     for(int i=n-1;i>=0;i--){
        last-=pre[arr[i]];
        last+=(pre[arr[i]]=n-i);
        sum+=last;


     }
     System.out.println(sum);

}
}*/
import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int pre[]=new int[n+1];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum =0;
		int last=0;
		for(int i=n-1;i>=0;i--){
			last-=pre[arr[i]];
			last+=(pre[arr[i]]=n-i);
			sum+=last;
			
		}
		System.out.println(sum);
	}
}


