class Swap{
    public static void main(String arg[]){
        int a= 20;
        int b = 30;
        a=a+b;
        b =a-b;
        a=a-b;
        System.out.print("a: "+a+", b: "+b);
    }
}