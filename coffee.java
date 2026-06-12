import java.util.*;
public class main{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int q=sc.nextInt();
        int max=2000;
        int diff[]=new int[max+2];
        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            diff[l]++;
            diff[r+1]--;
            
        }
        int admissible[] =new int[max+1];
        int count=0;
        for(int i=1;i<=max;i++){
            count=count+diff[i];
            if(count>=k){
                admissible[i]=1;
            }
        }
        int prefix[]=new int[max+1];
         for(int i=1;i<=max;i++){
            prefix[i]=prefix[i-1]+admissible[i];
         }
         while(q-- >0){
            int a= sc.nextInt();
            int b=sc.nextInt();
            System.out.println(prefix[b]-prefix[a-1]);
         }
    }
}