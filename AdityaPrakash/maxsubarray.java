import java.util.Scanner;

public class maxsubarray {

    public int maxsubarr(int n, int num[])
    {
        int sum=0, max=Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {   
            sum=0;
            for(int j=i; j<n; j++)
            {
                sum+=num[j];
                max=Math.max(sum, max);
            }
        }
        return max;
    }

    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int a;
        maxsubarray m=new maxsubarray();
        
        a=m.maxsubarr(n, arr);
        System.out.println(a);    

        sc.close();
    }
}
