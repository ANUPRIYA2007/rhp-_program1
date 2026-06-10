class LcsSec{
    public static void main (String args[]){
        String s1="abcdefg";
        String s2="macifg";
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }  
            }
        }
        System.out.println("length="+dp[s1.length()][s2.length()]);
        String lcs ="";
        int i = s1.length();
        int j = s2.length();
        while(i>0 && j>0){
             if(s1.charAt(i-1)==s2.charAt(j-1)){
                lcs=s1.charAt(i-1)+lcs;
                i--;
                j--;
        }
        else if(dp[i-1][j]>dp[i][j-1]){
            i--;

        }
        else{
            j--;
        }
    }
    System.out.println("LCS="+lcs);
}
}