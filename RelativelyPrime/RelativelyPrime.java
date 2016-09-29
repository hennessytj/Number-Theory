public class RelativelyPrime
{
    public static void main(String[] args)
    {
	int N = Integer.parseInt(args[0]);
	for (int i = 0; i < N; i++)
	{
	    System.out.print(i + "   ");
	    for (int j = 1; j < N; j++)
	    {
		if (i == 0) System.out.print(j + "   ");
		else
		{
		    if (isRelativelyPrime(i, j)) System.out.print("*" + "   ");
		    else		   System.out.print("    ");
		}
	    }
	    System.out.println();
	}
    }

    public static boolean isRelativelyPrime(int x, int y)
    {
	if (gcd(x, y) == 1) return true;
	else 		    return false;
    }
    public static int gcd(int x, int y)
    {
	if (y == 0) return x;
	else        return gcd(y, x % y);
    }
}
