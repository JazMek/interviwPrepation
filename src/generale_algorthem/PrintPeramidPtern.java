package generale_algorthem;

public class PrintPeramidPtern {
    public static void main(String[] args) {
        printPeramid( 7);
    }
    public static void printHalfPeramid(int n){
        for(int i =1;i<n;i++){
            for(int j=1;j<i;j++){
            System.out.print("*");
                System.out.print(" ");}
            System.out.println();
        }
    }

    public static void printPeramid(int n){
        for(int i =1;i<n;i++){
            System.out.print("       ");
            for(int j=1;j<i;j++){
                System.out.print("*");
                System.out.print(" "); }
            System.out.println();
        }
      }

}
