import java.util.*;

public class Main {
public static void main(String[] args) {

int arr[] = {1,0,1,1,1,0,0,0,0,0,1,1};

HashMap<Integer,Integer> map = new HashMap<>();    

int sum = 0;    
int maxLen = 0;    

map.put(0,-1);    

for(int i=0;i<arr.length;i++) {    

    if(arr[i] == 0)    
        sum += -1;    
    else    
        sum += 1;    

    if(map.containsKey(sum)) {    

        int len = i - map.get(sum);    
        maxLen = Math.max(maxLen, len);    

    } else {    

        map.put(sum, i);    

    }    
}    

System.out.println(maxLen);

}

}