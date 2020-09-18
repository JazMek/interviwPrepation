package string;

public class find_all_substrings_of_a_String {
    public static void main(String[] args) {

        String str="abbc";
        Find_all_substrings_of_a_String(str);
    }
    public static void Find_all_substrings_of_a_String(String string){
        for(int i =0;i<string.length();i++){
            for( int j=i+1;j<=string.length();j++){
            string.substring(i,j);
            System.out.print(string.substring(i,j)+" , ");}
        }
    }
}
