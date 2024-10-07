import java.util.Scanner;
class PrintCharacterOneByOne
{
  public static void printCharacter(String s1){
    int i=0;
    while(i<s1.length()){
       char k1=s1.charAt(i);
       System.out.println(k1);
       i++;

    }
  }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any String ");
    String s1=sc.nextLine();
    printCharacter(s1);
   
  
  }
 
}