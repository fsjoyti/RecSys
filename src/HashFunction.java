
public class HashFunction {
	private int a;
	private int b;
	private int p;

	
	/**
	 * Picks the first (positive) prime integer whose value is at least range,
	 * and sets the value of p to that prime integer. Then picks two random integers x and y from
	 * {0, 1, · · · , p − 1} and sets a as x and b as y.
	 */
	
	public HashFunction(int range){
	  range = setinitialp(range);
	  p = range;
	  a = (int)(Math.random() * range);
	  b = (int)(Math.random() * range);
		
	}
	
	/**
	 * Private helper method to find the smallest prime > range
	 */

	private int setinitialp(int range) {
		while (!isPrime(range)){
			  range ++;
		  }
		return range;
	}
	
	/**
	 * Returns the value of the hash function on x;
	 * i.e, returns (ax + b)%p.
	 */
	public int hash(int x){
		//int value = (a * x + b) % p;
		int value = (a*x +b);
		int hash = mod(value,p);
		
		return hash;
	}
	
	
	public int getA(){
		return a;
	}
	
	public void setA(int x){
		//a = x % p;
		a = mod(x,p);
		
	}
	
	
	public int getB(){
		return b;
	}
	
	public void setB(int y){
		//b = y % p;
		b = mod(y,p);
	}
	
	
	public int getP(){
		return p;
	}
	
	public void setP(int x){
		x = setinitialp(x);
		p = x;
		a = (int)(Math.random() * p);
		b = (int)(Math.random() * p);
		
	}
	
	/**
	 * Private helper method to check if a number is prime
	 */
	
	private boolean isPrime(int num){
		

    	if (num ==0||num==1)
    		return false;
        
    	for (int i = 2;i*i<=num;i++){
    		if (num%i==0){
    			
    			return false;
    			
    		}
    		
    	}
    	
		return true; 
		
	}
	
	private int mod(int x, int y)
	{
	    int result = x % y;
	    if (result < 0)
	    {
	        result += y;
	    }
	    return result;
	}
	
	
	
}