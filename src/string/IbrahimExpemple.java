package string;

public class IbrahimExpemple {

    // How to find the maximum occurring character in given String :ex ("aabcfcba"àprints: a)

    public static void main(String[] args) {

        String str="aabcfcba";
        System.out.println(maximum_occurring_character(str));
    }
    public static final int CAS_SIZE=250;
    public static char maximum_occurring_character(String str){

        char [] strlist =str.toCharArray();
        int leng=str.length();
        int [] charcount=new int[CAS_SIZE];
        for(int i=0;i<leng ; i++){
            charcount[str.charAt(i)]++;
        }
        int max= -1;
        char result=' ';
        for(int i=0;i<leng;i++){
            if(max<charcount[str.charAt(i)]){
                max=charcount[str.charAt(i)];
                result=str.charAt(i);
            }
        }
        return result;
    }
}