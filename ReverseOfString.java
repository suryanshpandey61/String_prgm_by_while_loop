import java.util.Scanner;
class ReverseOfString{
  public static void getReverse(String s1){
    int i=s1.length()-1;
    String rev="";
    while(i>=0){
      rev=rev+s1.charAt(i);
      i--;
    }
    System.out.println("The reverse of string "+s1+ " is "+rev); 
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter any string valu:==");
    String s1=sc.nextLine();
    getReverse(s1);
  }

}