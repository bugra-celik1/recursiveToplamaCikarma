import java.util.Scanner;
public class Main {
    static int minus(int number,int temp1){
        if(number <= 0){
            return sum(number,temp1);
        }
        System.out.print(number + " ");
        return  minus(number - 5,temp1) ;

    }
    static int sum(int number1,int temp){
       if(number1 == temp){
           return number1;
       }
        System.out.print(number1 + " ");
       return sum(number1 + 5,temp);
    }
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        int number = scan.nextInt();
        int temp = number ;
        System.out.println(minus(number,temp));










    }
}