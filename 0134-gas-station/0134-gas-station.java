class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int station =0 ,sum=0,total =0;
        for(int i=0;i<cost.length;i++){
            sum +=gas[i]-cost[i];
            if(sum <0){
                total +=sum;
                sum=0;
                station =i+1;
            }
        }
        total +=sum;
        return total>=0?station:-1;
    }
}