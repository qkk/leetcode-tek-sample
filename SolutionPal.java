package com.sample.tek;

class SolutionPal {
    public String longestPalindrome(String s) {
        String msg="";
        int max=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                String test=s.substring(i,j);
                if(ispal(test) && test.length()>max){
                    msg=s.substring(i,j);
                    max=Math.max(max,msg.length());
                }
            }
        }
        return msg;

    }

    public boolean ispal(String str){
        int len=str.length();
        for(int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                return false;
            }
        }

        return true;
    }
}