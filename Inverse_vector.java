//Inverse of the vector
public class Exerc1 {

    public static void main(String[] args) {
        int i, j, aux;
        int vet[] = { 1, 2, 3, 4, 5 };

        System.out.println(" Vetor original: ");
        for (i = 0; i < 5; i++) {
            System.out.println(vet[i]);
        }


        j = 5 - 1;
        i = 0;

        while (i < j) {
            aux = vet[i];
            vet[i] = vet[j];
            vet[j] = aux;
            j--;
            i++;
        }

        System.out.println("\n Vetor invertido: ");
        for (i = 0; i < 5; i++) {
            System.out.println(vet[i]);
        }
    }
}
