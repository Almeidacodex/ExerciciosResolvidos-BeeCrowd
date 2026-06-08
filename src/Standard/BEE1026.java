package Standard;

import java.util.Scanner;

public class BEE1026 {

    public static void main(String[] args) {

        double A,B,C;
        double x1,x2,delta;


        Scanner teclado = new Scanner(System.in);

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        delta = Math.pow(B,2) - (4 * A * C);

        if (A==0 || delta < 0){
            System.out.println("Impossivel calcular");
        }else{
            x1 = (-B + Math.sqrt(delta)) / (2 * A);

            x2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f%n",x1);
            System.out.printf("R2 = %.5f%n",x2);
        }









    }
}
