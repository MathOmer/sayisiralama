import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        a = input.nextInt();

        System.out.print("b sayısını giriniz: ");
        b = input.nextInt();

        System.out.print("c sayısını giriniz: ");
        c = input.nextInt();

        if (a < b){
            if (b < c){
                System.out.println("a < b < c");
            }else {
                System.out.println("a < c < b");
            }
        }
        else if (b < a){
            if (a < c){
                System.out.println("b < a < c");
            }else {
                    System.out.println("b < c < a");
            }

        }else if (c < a){
            if (a < b){
                System.out.println("c < a < b");
            }else{
                    System.out.println("c < b < a");
                }

        }


















    }
}
