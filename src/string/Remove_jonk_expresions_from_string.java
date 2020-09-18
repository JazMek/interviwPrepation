package string;

public class Remove_jonk_expresions_from_string {
//    remove a jonck expression from a string using a regular expression


    public static void main(String[] args) {
        String s="@@##&&***___!!@#2347streOPAKCOlololllo+++++)(*#&$^%@!!!><<?????";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);

    }
}
