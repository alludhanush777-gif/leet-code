class Solution {
    public boolean isHappy(int n) {
        int slow=square(n);
        int fast=square(square(n));
        while(slow!=fast){
            slow=square(slow);
            fast=square(square(fast));
            if(slow==1||fast==1){
                return true;
            }
        }
        return slow==1;
    }
    public int square(int num){
      int total=0;
      int x;
          while(num>0){
                x=num%10;
                total+=x*x;
                num=num/10;
          } 
          return total;
    }
}