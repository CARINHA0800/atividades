
/*
 * Faça um programa no qual o usuário digite dois números e o programa java deve apresentar um menu, para que o usuário escolha uma das
 * seguintes opções:
 * Menu:
 * 1 - Somar
 * 2 - Subtrair
 * 3 - Multiplicar
 * 4 - Dividir
 * 
 * O programa deverá apresentar o resultado da operação solicitada.
 * Se o usuário digitar como opção um número diferente de 1 a 4 o programa deverá informar que a opção é inválida e o programa será encerrado.
 */
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        float n1, n2;
        Scanner dd = new Scanner(System.in);
        int op;
       do{
        System.out.print("Primeiro número: ");
        n1 = dd.nextFloat();
        System.out.print("Segundo número: ");
        n2 = dd.nextFloat();

        System.out.print("Menu:\n"+
        "1 - Somar n1 + n2\n"+
        "2 - Subtrair n1 - n2\n"+
        "3 - Multiplicar n1 x n2\n"+
        "4 - Dividir n1\\n2\n"+
        "Opção: ");
         op = dd.nextInt();
        if(op < 1 || op > 4){
            System.out.println("Opção inválida.");
        }else{
            if (op == 1)
                System.out.println("Resultado da soma de " +n1 + " + " + n2 +" = "+(n1+n2));
            else 
                if (op == 2)
                    System.out.println("Resultado da subração de " + n1 + " - " + n2 +" = "+(n1-n2));
                else 
                    if (op == 3)
                        System.out.println("Resultado da multiplicação de " + n1 + " x " + n2 +" = "+(n1*n2));
                    else 
                        if (op == 4){
                            System.out.printf("Resultado da divisão de %.1f // %.1f = %.1f\n", n1,n2, n1/n2);
                        }

            }            
        }while(op!=5);
    dd.close();
    }
}