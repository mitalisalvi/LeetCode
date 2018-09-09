package com;

public class Guess_Number_Higher_or_Lower {
	
	public int guess(int n )
	{
//		@return -1 if my number is lower, 1 if my number is higher, otherwise return 0
		return 0;
	}

	public int guessNumber(int n) {
	    int i = 1, j = n;
	    while(i < j) {
	        int mid = i + (j - i) / 2;
	        if(guess(mid) == 0) {
	            return mid;
	        } else if(guess(mid) == 1) {
	            i = mid + 1;
	        } else {
	            j = mid;
	        }
	    }
	    return i;
	}

}
