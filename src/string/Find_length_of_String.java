package string;

public class Find_length_of_String {

    public static void main(String[] args) {
        String string="karimMekdoud";
        System.out.println("The length of the String "+ string +" is: "+find_length_of_String(string));
        System.out.println("The length of the String "+ string +" using string_lenghth method is: "+string_lenghth(string));
    }
//    Find length of String using char array
    public static int find_length_of_String(String string){
       char[]str= string.toCharArray();
       int count=0;
       for(char c:str){
           count++;
       }return count;
    }
    //    Find length of String using try catch exception

    public static int  string_lenghth(String string){
        int i=0;
        try{
            for( i=0;;i++)
                string.charAt(i);
        } catch (Exception e) {
        }
        return i;
    }
}
