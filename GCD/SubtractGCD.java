public class SubtractGCD
{
    /**
    * function gcd(a, b)
    *     while (a != b)
    *         if (a > b) a := a - b;
    *         else       b := b - a;
    *     return a;
    */
    public static int gcdSub(int p, int q)
    {
        if (p == q) return p;
        if (p > q)  return gcdSub(p - q, q);
        else        return gcdSub(p, q - p);
    }

    public static int gcd(int p, int q)
    {
        if (q == 0) return p;
        return gcd(q, p % q);
    }

    public static void main(String[] args)
    {
        int P = Integer.parseInt(args[0]);
        int Q = Integer.parseInt(args[1]);
        System.out.println(gcdSub(P, Q));
        System.out.println(gcd(P, Q));
    }
}
