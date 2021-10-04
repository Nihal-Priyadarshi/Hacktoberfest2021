import java.io.*;
import java.util.*;

class KadaneAlgo
{
	static int kadane(int a[])
	{
		int size = a.length;
		int ans = Integer.MIN_VALUE;
        int current = 0;

		for (int i = 0; i < size; i++)
		{
			current = current + a[i];
			if (ans < current)
				ans = current;
			if (current < 0)
				current = 0;
		}
		return ans;
	}

    public static void main (String[] args)
	{
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(kadane(a));
	}
}