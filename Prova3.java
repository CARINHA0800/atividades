import java.util.Scanner;

public class Prova3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

       System.out.print("informe um número: ");
        char v[]= sc.nextLine().toCharArray();
        
        System.out.print("Original: ");
        System.out.println(v);
        for(int i=0; i < v.length; i++){
              
            for(int j = i+1; j < v.length; j++){
                if(v[i] < v[j]){ 
                    char aux = v[i]; 
                    v[i] = v[j]; 
                    v[j] = aux;
                }
            }
        }
        System.out.print("Resultado: ");
        for(char x: v){
            System.out.print(x);
        }
        System.out.println();
        sc.close();
    }
}

