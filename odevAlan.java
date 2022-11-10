import java.util.Scanner;
public class odevAlan {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        double a , b , c , x , ALAN ;

        System.out.print("a kenarını giriniz:");
        a=input.nextDouble();
        System.out.print("b kenarını giriniz:");
        b=input.nextDouble();
        System.out.print("c kenarını giriniz:");
        c=input.nextDouble();

        x=(a+b+c)/2;
        ALAN=x*(x-a)*(x-b)*(x-c);

        System.out.print("üçgenin alanı:");
        System.out.print(Math.sqrt(ALAN));




    }
}
