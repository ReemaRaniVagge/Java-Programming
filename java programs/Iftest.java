class Iftest{
     public static void main(String args[])
      {
       int x,y;
       x=10;y=20;
       if (x<y) System.out.println("x is less than y");
       x=x*2;
       if (x==y) System.out.println("x and y are equal");
       x=x*2;
       if(x>y)  System.out.println("x is bigger than y");
       if(x==y) System.out.println("this will not be printed");
      }
  }