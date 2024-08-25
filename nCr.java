public class nCr {
    public static int calculatenCr(int n , int r)
    {
        if(n==r || r==0 )
        {return 1;}

        int ans =calculatenCr(n-1,r)+calculatenCr(n-1,r-1);
        return ans;
    }
    public static void main(String []args)
    {
        System.out.print(calculatenCr(5,2));
    }
}
