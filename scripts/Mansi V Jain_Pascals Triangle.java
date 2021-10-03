import java.util.*;
class PascalsTriangle
{
    int a1[]={1};
    int a2[]={1,1};

    int[] set(int a[],int b[])
    {
        b[0]=1;
        b[b.length-1]=1;

        for(int i=1;i<a.length;i++)
        {
            b[i]=a[i-1]+a[i];
        }

        return b;
    }

    void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    void send(int n)
    {
        print(a1);
        print(a2);

        for(int i=3;i<=n;i++)
        {
            restructure(a1,a2);
            a2= set(a1,a2);
            print(a2);
        }
        
    }

    void restructure(int a[],int b[])
    {
        int temp[]=new int[b.length];
        int temp1[]=new int[b.length+1];
        for(int i=0;i<temp.length;i++)
        {
            temp[i]=a2[i];
        }

        a1=temp;
        a2=temp1;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows to be generated");
        int n=sc.nextInt();
        PascalsTriangle obj=new PascalsTriangle();
        obj.send(n);
    }
}

