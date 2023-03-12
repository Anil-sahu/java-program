class PrimeNumber{

public static void main(String arg[]){
    int num =19;
    int count=0;
    for(int i=1;i<=num;i++){
       if(num%i==0)count=count+1;
       
    }
    if(count==2){
        System.out.print("Prime");
    }else{
        System.out.print("Not a prime");
    }
}
}