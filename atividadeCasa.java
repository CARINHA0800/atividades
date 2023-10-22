import java.util.Scanner;

public class atividadeCasa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("-----------------------------");

            System.out.println("[1] = Somar");
            System.out.println("[2] = Subtrair");
            System.out.println("[3] = Multipicar");
            System.out.println("[4] = Dividir");
            System.out.println("[!=] = Sair");
            System.out.println("-----------------------------");
            System.out.println("Digite um numero da OPERAÇÃO desejada: ");
             num = sc.nextInt();
           

            int a, b, soma;

            switch (num) {
                case 1:
                    System.out.println("Parabens você escolheu SOMAR");    
                    System.out.println("Digite n1: ");
                    a = sc.nextInt();
                    System.out.println("Digite n2: ");
                    b = sc.nextInt();
                    soma = a + b;
                    System.out.println("a soma é igual a: " + soma);
                    break;
                case 2:
                    System.out.println("Parabens você escolheu SUBTRAÇÃO");
                    System.out.println("Digite n1: ");
                    a = sc.nextInt();
                    System.out.println("Digite n2: ");
                    b = sc.nextInt();
                    soma = a - b;
                    System.out.println("O resultado é igual a: " + soma);
                    break;
                case 3:
                    System.out.println("Parabens você escolheu MULTIPLICAR");    
                    System.out.println("Digite n1: ");
                    a = sc.nextInt();
                    System.out.println("Digite n2: ");
                    b = sc.nextInt();
                    soma = a * b;
                    System.out.println("O resultado é igual a: " + soma);
                    break;
                case 4:
                    System.out.println("Parabens você escolheu DIVIDIR");
                    System.out.println("Digite n1: ");
                    a = sc.nextInt();
                    System.out.println("Digite n2: ");
                    b = sc.nextInt();
                    soma = a / b;
                    System.out.println("O resultado é igual a: " + soma);
                    break;
                default:
                    System.out.println("Você escolheu a opção sair,ate logo");
                    System.exit(5);

            }
        } while (num != 5);

      sc.close();
    }

}
