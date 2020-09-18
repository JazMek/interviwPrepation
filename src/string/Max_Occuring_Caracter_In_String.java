package string;

public class Max_Occuring_Caracter_In_String {

    /*
    Find the maximum occuring charcter in a given string .
     Return null if no unique maximum character is found.
     Input : abcdcd
     Expected Result : c
     Input : aabcdc
     Expected Result : a
     Input : aaaa
     Expected Result : a
     Input : b
     Expected Result : b
     Input : bbaacdd  ===> I have to work on it !!!!!!
     Expected Result : b
     Input : ""
     Expected Result : null
     Input : "abcdefg"
     Expected Result : null


 */
    public static void main(String[] args) {
        String str="abcdefg";
        System.out.println(maximum_occuring_caracter (str));
    }
    public static Character maximum_occuring_caracter (String str){
        int maxchar=0;
        char charmax=' ';
        char [] strchar=str.toCharArray();
        int [] charcount = new int [str.length()];
        for(int i=0;i<strchar.length;i++){
            for(int j=0;j<strchar.length ;j++){
                if(strchar[j]==strchar[i]){
                    charcount[i]++;
                }
            }
            if(charcount[i]>maxchar ||strchar.length==1 ){maxchar =charcount[i];  charmax=strchar[i];}
        }
        if ((maxchar==1 && str.length()!=1)||str.length()==0){ return null;}
        else return charmax;
    }
}
