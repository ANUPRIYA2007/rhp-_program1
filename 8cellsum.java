import java.util.Scanner;
class cell{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("value");
        int r=sc.nextInt();
        int c= sc.nextInt();
        System.out.println("matrix");
        int arr[][]=new int[r][c];
        for(int row=0;row<r;row++){
            for(int col=0;col<c;col++){
                arr[row][col]=sc.nextInt();
            }
        }
            System.out.println("target");
            int tarrow=sc.nextInt();
            int tarcol=sc.nextInt();
            int diff[][] ={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
            int sum=0;
            for(int i=0;i<8;i++){
                int adjRow=tarrow+diff[i][0];
                int adjCol=tarcol+diff[i][1];

                if(adjRow>=0 && adjRow<r && adjCol>=0 && adjCol<c){
                sum+=arr[adjRow][adjCol];
            }
            }
            
            System.out.println(sum);
        }
    }
 