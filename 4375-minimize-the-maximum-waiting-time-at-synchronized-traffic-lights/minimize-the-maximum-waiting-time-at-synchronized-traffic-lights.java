class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int max=0;
        for(int i:lights){
            max=Math.max(max,i);
        }
        int mpen=0;
        for(int j:arrivalTime){
            int r=j%period;
            if(r>=max){
                int wt=period-r;
                mpen=Math.max(mpen,wt);
            }
        }
        return mpen;
    }
}