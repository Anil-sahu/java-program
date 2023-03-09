class arrary {
    public static void main(String arg[]){
        int n = 10;
        int arr[]={48, 40, 76, 44, 68, 52, 64, 56, 72, 80};
        int res[]=new int[10];
        int arr1[];
        int arr2[];
        int mising;
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int min =i;
                if(arr[i]>arr[j])min=j;
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }

          for(int i =0;i<10;i++){
              if(i<9){
                if(arr[i]-arr[i+1]!=4){
                    arr1= Arrays.copyOfRange(arr, 0, i)
                   mising=arr[i]+4
                    arr2= Arrays.copyOfRange(array, i+1, arr.length-1)
                    break;
                    
                }else{
                    res[i]=arr[i]+4;
                }

                if(i==9){

                }
              }
            }
            
             int count = 0;
      
      for(int i = 0; i < arr1.length; i++) { 
         res[i] = arr1[i];
         count++;
      } 
      res[count]=mising;
      
      for(int j = 0; j < arr2.length;j++) { 
        res[count++] = arr2[j];
      } 

              System.out.println(res);
    }
}