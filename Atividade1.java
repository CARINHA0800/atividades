import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        char pl[] = sc.nextLine().toCharArray();
    
            for (int i = 0; i < pl.length; i++) {
                int valor_ascii = (int) pl[i];
               valor_ascii=valor_ascii+1; 
               System.out.print((char)valor_ascii);
            }
            System.out.println();
        sc.close();
    }
}
