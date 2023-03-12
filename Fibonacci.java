class Fibonacci{
    public static void main(String arg[]){
        int n=10;
     
        int arr[]=new int[10];
        for(int i =0;i<10;i++){
            if(i==0||i==1){
              arr[i]=i;
            }else{
                arr[i]=arr[i-1]+arr[i-2];
            }
            
        }
        for(int i :arr)
        System.out.println(i);
    }
}