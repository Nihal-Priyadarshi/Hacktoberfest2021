/*
* Smith Number is a composite number whose sum of digits equals the sum of digits of its prime factors
* For example, 58 = 2 x 29 (5 + 8 = 12) (2+ 2 + 9 = 12)
*/
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to be checked");
        int n = in.nextInt();
        int sumPrime = 0, sum_n;
        sum_n = sumDigits(n);
        ArrayList<Integer> primeF = Pfactors(n);
        if(prime(n)!=true)
        {
            for(int i=0; i<primeF.size(); i++)
            {
                sumPrime += sumDigits(primeF.get(i));
            }
            
            if(sum_n==sumPrime)
            System.out.println("Smith");
            else
            System.out.println("Not Smith");
        }
        else
        System.out.println("Prime number");
        
        in.close();
    }
    static boolean prime(int x)
    {
        if(x<=1) return false;
        for(int i=2; i < x; i++)
        {
            if(x%i == 0)
                return false;
        }
        return true;
    }
    static int sumDigits(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum += (n%10);
            n/= 10;
        }
        return sum;
    }
    static ArrayList<Integer> Pfactors(int n)
    {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        // Print the number of 2s that divide n
        while (n%2==0)
        {
            factors.add(2);
            n /= 2;
        }
 
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                factors.add(i);
                n /= i;
            }
        }
 
        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2)
            factors.add(n);
            
        return factors;
    }
}
