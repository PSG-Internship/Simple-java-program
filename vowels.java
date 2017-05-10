import java.util.Scanner;
 public class vowels{
 
 public static void main(String[] args) {
  
System.out.println("Please enter a String");
Scanner in = new Scanner(System.in);                  
 String input = in.nextLine();
 
     char[] Chararray = input.toCharArray();
 int a=0,e=0,i=0,o=0,u=0,a1=0,e1=0,i1=0,o1=0,u1=0;
 for (char ch : Chararray) {
      switch (ch) {
             case 'a':a++;break;
             case 'e':e++;break;
             case 'i':i++;break;
             case 'o':o++;break;
             case 'u':u++;break;
             case 'A':a1++;break;
             case 'E':e1++;break;
             case 'I':i1++;break;
             case 'O':o1++;break;
             case 'U':u1++;break;
             default:
             break;
        }
 }
     System.out.println("a="+a);
       System.out.println("e="+e);
       System.out.println("i="+i);
       System.out.println("o="+o);
       System.out.println("u="+u);
       System.out.println("A="+a1);
       System.out.println("E="+e1);
       System.out.println("I="+i1);
       System.out.println("O="+o1);
       System.out.println("U="+u1);
}

}