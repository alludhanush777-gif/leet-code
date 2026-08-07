class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int sum=0;
        int rem=0;
        while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if(sum== x){
            return true ;
        }
        else{
             return false ;
        }
    }
   
}