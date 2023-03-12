// How to findout digit from a string and sum that.

class ProgramStr{
    public static void main(String str[]){
        String name = "1A2n3i4l5";
        int res=0;
        for(int i = 0;i<name.length();i++){
            if(Character.isDigit(name.charAt(i))){
                res+=Integer.parseInt(String.valueOf(name.charAt(i))) ;
           
            }
        }
        System.out.print(res);
    }
}