package generale_algorthem;

public class NumberReverse {
    public static void main(String[] args) {
        int num=134890443;
        System.out.println(numberReverse(num));
        System.out.println(numberreverse(num));
    }
    public static int numberReverse(int numb){
        int reversedNumber=0;
        while (numb !=0){
        reversedNumber= (reversedNumber*10)+(numb%10);
        numb=numb/10;}
      return reversedNumber;
    }
//    this method will work tel the 9th number
    public static int numberreverse(int numb){
       StringBuffer sb=new StringBuffer(Integer.toString(numb));
       String str=sb.reverse().toString();
       return Integer.parseInt(str);
    }
}
