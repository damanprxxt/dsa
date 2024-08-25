public class towerOfHanoiRecursive {

     static void TOH(int n, int a, int b, int c)
     {
         if(n==0)
         {
             return;
         }
         TOH(n-1,a,c,b);
         System.out.println("Move from tower" + a +"to tower "+c +" using tower"+ c);
         TOH(n-1,b,a,c);

     }


    public static void main(String args[])
    {
        TOH(20,1,2,3);
    }
}
