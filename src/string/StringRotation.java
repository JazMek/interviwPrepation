package string;

public class StringRotation {
    public static void main(String[] args) {
        String str="Karimmekdoud";
        String rotation="MekdoudKarim";

        System.out.println(str +" and "+rotation+" are rotation of each other : "+stringRotation(str,rotation));
    }

    public static boolean stringRotation(String str,String rotation){
//        KarimMekdoudKarimMekdoud
        String str1=str.toLowerCase();
        String srt3=rotation.toLowerCase();
        String str2=str1+str1;
        System.out.println(str2);
        if(str2.contains(srt3)){
            return true;
        }
        return false;
    }
}
