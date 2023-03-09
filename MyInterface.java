import java.util.*;

interface Animal{
    public  void animalSound();
    public void eat();

}
class Pig implements Animal{
    public void animalSound(){
        System.out.println("I am aound like pig");
    }

    public void eat(){
        System.out.println("I am eat....");
    }
}
public class MyInterface {
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your lname");
        String name = scan.nextLine();
        System.out.println("Your name is : "+name);
       Pig pig = new Pig();
       pig.animalSound();
       pig.eat();
        

    }
}