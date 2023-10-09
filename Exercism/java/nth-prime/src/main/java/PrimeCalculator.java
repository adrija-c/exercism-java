class PrimeCalculator {

    int nth(int n) {
      if(n<=0) {
          throw new IllegalArgumentException("n should be greater than 0");
      }
      else if(n == 1) {
          return 2;
      }
      else {
    	  int count=1, i=1;
    	  while(count != n) { 
    		  i += 2;
    		  if(isPrime(i)) 
    			  count++;     			     		  
    	  }
    	  return i;    	  
      }

    }

	private boolean isPrime(int num) {
		
		for(int i=2; i<=Math.sqrt(num) ; i++)
			if(num % i == 0) {
                return false;
            }			
		return true;
	}

}
