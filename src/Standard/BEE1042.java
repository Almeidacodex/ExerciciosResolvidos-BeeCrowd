package Standard;
/*


Leia 3 valores inteiros e ordene-os em ordem crescente.
No final, mostre os valores em ordem crescente, uma linha em branco e em seguida,
os valores na sequência como foram lidos.
Entrada

A entrada contem três números inteiros.
Saída

Imprima a saída conforme foi especificado.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BEE1042 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int a,b,c;
        int menor,maior,meio;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();


        menor = Math.min(a,Math.min(b,c));
        maior = Math.max(a,Math.max(b,c));
        meio = a + b +c - menor - maior;

        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        System.out.println();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);




        teclado.close();



    }
}
