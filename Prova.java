//PROVA VALENDO 9
import java.util.Scanner;

public class Prova{
    
   public static void  metodo1(char v[],String x){
        for (int i = 0; i < x.length(); i++) {
            v[i] = x.charAt(i);
        }
       
    }
    public static void metodo2(char v[],String y,String x){
      metodo1(v, x);
      
      for (int i = x.length(); i < v.length; i++) {
            for (int j = 0; j < y.length(); j++) {
           v[i] = y.charAt(j);
           //System.out.println(j);
        }
    }
       
      
    }
    public static void metodo3(char v[],String y,String x){
        metodo2(v, y, x);
       //deu certoo
        for (int i = 0; i < x.length(); i++) {
            System.out.print(v[i]);
            System.out.print(" ");
            int j=x.length();
            j++;
            System.out.print(v[j]);
            System.out.print(" ");
        }
        System.out.println();
        // for(int i=0, j=0, t=0; t < v.length; t++){ 
        //     if(x.length() > i && y.length() > j){
        //         v[t] = x.charAt(i);
        //         t++;
        //         v[t] = y.charAt(j);
        //         i++;
        //         j++;
        //     }else{
        //         if(x.length() > i){
        //             v[t] = x.charAt(i);
        //             i++;
        //         }else{
        //             v[t] = y.charAt(j);
        //             j++;
        //         }
        //     }
        // }
       
    }

    public static void main(String[] args) {
        String x = "AAAAAAAA";
        String y = "BBBBBBBB";
        char v[] = new char[x.length()+y.length()];   
      
        String menu = "1 - Colocar todos os caracteres da Strinx x em um vetor\n"+ //não pode usar métodos prontos, como o split 
                      "2 - Incrementar os vetor produzido pelo Método1 com os caracteres de y.\n"+ 
                      "3 - Imprimir o vetor produzido pelo Método2, intercalando os caracteres produzidos por x e y\n"+
                      "4 - Sair\n"+
                      "Opção: ";
        int op;
        Scanner dd = new Scanner(System.in);
        while(true){
            System.out.print(menu);
            op = dd.nextInt();

            switch(op){
                case 1:
                    //metodo1  (método de classe)
                  
                    metodo1(v, x);
                  for (int j = 0; j < v.length; j++) {
                    System.out.print(v[j]);    
                    System.out.print(" ");  
                }
                System.out.println();
                    break;
                case 2:
                    //metodo2 (método de classe)
                    metodo2(v, y, x);
                    for (int j = 0; j < v.length; j++) {
                        System.out.print(v[j]);
                        System.out.print(" ");      
                    }
                    System.out.println();
                    break;
                case 3:
                    //metodo3 (método de classe)
                    metodo3(v, y, x);
                  
                    break;
                case 4:
                    return;
            }
         
        }
        
    }

}
/*
 * REGRAS:
 * - Metodo1 ou Método2 não podem usar métodos prontos para produzir o resultado
 * - O método2 tem que usar como base o vetor produzido por método1, não pode usar mais a String x
 *  - O método3 tem que usar como base o vetor produzido por método2, não pode criar um novo vetor usando as strings x e y
 * - TODOS OS MÉTODOS DEVEM MANIPULAR O MESMO VETOR
 * 
 * OBS: O PROGRAMA DEVE FUNCIONAR INDEPENDENTEMENTE DO TAMANHO DA VARIÁVEL X E Y
 * A DECLARAÇÃO DO VETOR DE V E AS VARIÁVEIS X E Y NÃO PODEM SER MUDADAS DE LUGAR
 * O tamanho das variáveis x e y sempre serão iguais
 */