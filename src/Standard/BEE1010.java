package Standard;

/*


Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
o valor unitário de cada peça 1, o código de uma peça 2,
 número de peças 2 e o valor unitário de cada peça 2.
 Após, calcule e mostre o valor a ser pago.
Entrada

O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
respectivamente dois inteiros e um valor com 2 casas decimais.
Saída

A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor
 */

import java.util.Scanner;

public class BEE1010 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int cod1,qtdP1,cod2,qtdP2;
        double valU1,valU2;
        double soma;

        cod1 = teclado.nextInt();
        qtdP1 = teclado.nextInt();
        valU1 = teclado.nextDouble();



        cod2 = teclado.nextInt();
        qtdP2 = teclado.nextInt();
        valU2 = teclado.nextDouble();


        soma = (qtdP1 * valU1) + (qtdP2 * valU2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",soma);










        teclado.close();

    }
}
