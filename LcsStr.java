class LcsStr{
    public static void main(String args[]){
            String s1="level";
            String s2="evening";
            int max = 0;
            int index=0;
            int dp[][]=new int[s1.length()+1][s2.length()+1];
            for(int i=1;i<=s1.length();i++){
                for(int j=1;j<=s2.length();j++){
                    if(s1.charAt(i-1)==s2.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1]+1;
                        if(dp[i][j]>max){
                            max=dp[i][j];
                            index=i;
                        }
                    }
                    else{
                        dp[i][j]=0;
                    }
                }
            }
            System.out.println("Length ="+max);
            String sub=s1.substring(index-max,index);
            System.out.println(sub);
    }
}