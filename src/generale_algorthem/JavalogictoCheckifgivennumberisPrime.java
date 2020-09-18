package generale_algorthem;

public class JavalogictoCheckifgivennumberisPrime {
//    Java logic to Check if given number is Prime
      public static void main(String[] args) {

               System.out.println(primeNumberRahul(2));
    }

    public static String primeNumberRahul(int num){
        boolean flag=false;
        String result="";
        for (int i=2;i<=num/2;i++){
            if(num % i ==0){
                flag=true;
//                break;
            }
        }if(flag){
              result="The number is not a prime number";
        }else result="The number is a prime number";
        return result;
    }
}
