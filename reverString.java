// reverse string without using built in function word by word
import java.util.*;
public class reverString {

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String Here");
        String str = scan.nextLine();

        String revString = "";
        for(int i= str.length()-1; i>=0; i--) {
            revString+=str.charAt(i);

        }

        System.out.println(revString);


    }
}
