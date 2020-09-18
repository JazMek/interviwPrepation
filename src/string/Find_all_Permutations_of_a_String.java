package string;

public class Find_all_Permutations_of_a_String {
    public static void main(String[] args) {
        find_all_Permutations("karim");
    }

    public static void find_all_Permutations(String str){
        String str1="";
        StringBuilder sb=new StringBuilder(str);
        char[]strArray=str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                System.out.println(str1);
            }
        }
    }
}
