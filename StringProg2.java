// Print given string upto 3rd "o";

class StringProg2{
    public static void main(String arg[]){
        String str ="The quick brown fox jump over the lazy dog.";
        String res="";
        int count =0;

        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='o'){
                count++;
            }
            if(count<3){
                res+=str.charAt(i);
            }
            if(count==3){
                res+=str.charAt(i);
                break;
            }
        }
System.out.println(res);
    }
}