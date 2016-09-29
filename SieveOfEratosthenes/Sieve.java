/*
 This program takes a command-line argument N and computes 
 the number of primes less than or equal to N. To do so, 
 it computes an array of boolean values with isPrime[i] set 
 to true if i is prime, and to false otherwise. First, it 
 sets to true all array elements in order to indicate that 
 no numbers are initially known to be nonprime. Then it sets 
 to false array elements corresponding to indices that are 
 known to be nonprime (multiples of known primes). If a[i] is 
 still true after all multiples of smaller primes have been 
 set to false, then we know i to be prime. The termination 
 test in the second for loop is i <= N/i instead of the 
 naive i <= N because any number with no factor less than N/i 
 has no factor greater than N/i, so we do not have to look 
 for such factors. This improvement makes it possible to run 
 the program for large N.
*/
public class Sieve
{
    public static void main(String[] args)
    {
	int N = Integer.parseInt(args[0]);
	boolean[] isPrime = new boolean[N+1];
	for (int i = 2; i <= N; i++)
	    isPrime[i] = true;
	
	for (int i = 2; i <= N/i; i++)
	{   // Mark multiples of i false, not prime
	    if (isPrime[i])
	    {
		for (int j = i; j <= N/i; j++)
		    isPrime[i*j] = false;
	    }
	}

	int primes = 0;
	for (int i = 2; i <= N; i++)
	    if (isPrime[i]) primes++;
	System.out.println(primes);
    }
}

