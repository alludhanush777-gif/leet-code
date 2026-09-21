class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        int n=intervals.length;
        int[][] en=new int[2*n][2];
        int id=0;
        for(int i=0;i<n;i++){
            en[id][0]=intervals[i][0];
            en[id][1]=0;
            id++;
            en[id][0]=intervals[i][1];
            en[id][1]=1;
            id++;
        }
        Arrays.sort(en,(a,b)->{
            if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });
        long inter=0;
        int act=0;
        for(int[] e:en){
            if(e[1]==0){
                inter+=act;
                act++;
            }else{
                act--;
            }
        }
        return inter;
    }
}