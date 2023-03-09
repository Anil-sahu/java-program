
/* Online Java Compiler and Editor */
//1. write a program to print string from given 3rd 'a'
//2. replace a with 'B'
import java.util.*;
public class PrintString{

     public static void main(String []args){
        String str = "This is a beautiful string";
        int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='s'){
                count++;
            }
            if(count<3){
                System.out.print(str.charAt(i));
            }
        }
        
     }
}