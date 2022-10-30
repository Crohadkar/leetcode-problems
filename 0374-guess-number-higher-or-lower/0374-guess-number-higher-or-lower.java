/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int low = 0 ; 
        int high = n ;
        int pick =0;
        
        while(low<=high){
            int mid = low + (high - low) / 2;
            pick = guess(mid);
            if(pick==1)
                 low = mid+1 ;   
            else if(pick==-1) 
                high = mid-1 ;
            else if(pick==0)
                return mid ;    
        }
        return -1 ;
    }
    
}