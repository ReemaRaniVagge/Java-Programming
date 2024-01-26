package Mypack;
class Balance{
String name;
double bal;
Balance(String n,double b){
name=n;
bal=b;
}
void show() {
if (bal<0)
System.out.println("-->");
System.out.println(name+":$"+bal);
}
}
class AccountBalance{
public static void main(String args[]){
Balance current[]=new Balance[3];
for (int i=0;i<3;i++) current [i].show();
}
}
