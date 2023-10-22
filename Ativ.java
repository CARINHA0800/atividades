
public class Ativ{
public static void main(String[] args) {
    int[] vetor = {1, 6, 3, 2, 7};
    for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
    }
    System.out.println();
    bubbleSort(vetor);
   
    for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
    }
}

public static void bubbleSort(int[] vetor) {
    int n = vetor.length;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (vetor[j] > vetor[j + 1]) {
                int temp = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = temp;
            }
        }
    }
}
}