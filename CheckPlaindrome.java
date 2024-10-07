import java.util.Scanner;
class CheckPlaindrome{
  public static void checkPlaindrome(String s1){
    int i=s1.length()-1;
    String rev="";
    while(i>=0){
      rev=rev+s1.charAt(i);
      i--;
    }

    if(s1.equals(rev)){
      System.out.println("The reverse of "+s1+" is " +rev);
      System.out.println("Yes it is palindrome string");
    }
    else{
      System.out.println("No it is not palindrome");
    }

  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any string :=");
    String s1=sc.nextLine();
    checkPlaindrome(s1);
  }

}