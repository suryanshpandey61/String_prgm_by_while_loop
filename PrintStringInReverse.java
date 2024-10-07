import java.util.Scanner;
class PrintStringInReverse{
   public static void printReverseOneByOne(String s1){
       int i=s1.length()-1;
       while(i>=0){
         char k=s1.charAt(i);
         System.out.println(k);
         i--;

       }
   }

   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter any string:=");
     String s1=sc.nextLine();
     printReverseOneByOne(s1);
   
   }
}