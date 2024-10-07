import java.util.Scanner;
class CountConsonant{

  public static void countConsonants(String s1){
    int i=0;
    int count=0;
    while(i<s1.length()){
    char k1=s1.charAt(i);
     if(!(k1=='a'||k1=='e'||k1=='i'||k1=='o'||k1=='u'||k1=='A'||k1=='E'||k1=='I'||k1=='O'||k1=='U')){
        count++;
     }
    i++;
    }
   System.out.println("Total no of consonants in "+s1+" is "+count);
  }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any string:==");
    String s1=sc.nextLine();
    countConsonants(s1);
  }

}