class Solution {
    int maxpoints=0;
    int []bobMax=new int[12];
    public int[] maximumBobPoints(int numArrows, int[] aliceArrows) {
        int bob[]=new int[12];
        
        calpoints(numArrows, aliceArrows,bob,11,0);
        return bobMax;
    
    }
    
       public void calpoints(int numArrows, int[] aliceArrows , int bob[],int index,int points){
            if(index<0 ||  numArrows<=0){
                if(numArrows>0)
                    bob[0] +=numArrows;
                if(points>maxpoints){
                    maxpoints=points;
                    bobMax = bob.clone();
                }
                return ;
                
            }
            
            if(numArrows >= (aliceArrows[index]+1)){
                bob[index]=aliceArrows[index]+1;
                calpoints(numArrows-(aliceArrows[index]+1),aliceArrows,bob,index-1,index+points);
                bob[index]=0;
            }
            calpoints(numArrows ,aliceArrows,bob,index-1,points);
            bob[index]=0;


       }    
}