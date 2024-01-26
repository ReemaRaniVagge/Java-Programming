class Conversion{
public static void main(String args[]){
byte b;
int i=257;
double d=323.142;
System.out.println("result:");
b=(byte) i;
System.out.println("result1:"+i+" "+b);
System.out.println("result2:");
i=(int) d;
System.out.println("result3:"+d+" "+i);
System.out.println("result4:");
b=(byte) d;
System.out.println("result5:"+d+" "+b);
}
}