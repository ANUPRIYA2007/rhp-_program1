import java.util.*;
class main
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int shari[]=new int[n];
        int neta[]=new int[m];
        for(int i=0;i<n;i++){
            shari[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            neta[i]=sc.nextInt();
        }
        Arrays.sort(shari);
        Arrays.sort(neta);
        int i=0;
        int j=0;
        int count =0;

        while(i<n &&j<m){
            if(neta[j]<=2*shari[i]){
                count++;
                i++;
                j++;
            }
            else{
                i++;
            }

        }
        System.out.println("count is ="+count);
    }
}