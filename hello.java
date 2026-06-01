import java.util.Scanner;
public class hello{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String s = sc.nextLine();
      int lowercase=0;
      int uppercase=0;
      for(char ch:s.toCharArray()){
        if(ch>='a'&&ch<='z'){
          lowercase |= (1<<(ch-'a'));
        }
        if(ch>='A'&&ch<='Z'){
          uppercase |= (1<<(ch-'A'));
        }
      }
        int all =(1<<26)-1;
        if(lowercase == all && uppercase ==all){
          System.out.println("All contain");
        }
        else{
          System.out.println("Not contain");
        }




    }



      }      
     
    



