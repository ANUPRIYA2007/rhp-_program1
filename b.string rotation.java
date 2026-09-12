import java.util.*;
public class Main{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String t=sc.nextLine();
	String dt=t+t;
	if(dt.contains(s)){
		System.out.println("Yes");
	}
	else{
		System.out.println("No");
	}
}
}