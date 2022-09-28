public class Bubble {
    public static void main(String[] args) {

        int a[][] = { { 1, 3, 4, 2, 2 }, { 3, 2, 6, 2, 1 }, { 8, 3, 5, 2, 7 }, { 5, 3, 2, 3, 4 }, { 2, 4, 5, 5, 5 } };

        int i, j, aux;
        boolean troca;

        System.out.println("\nOriginal matrix: ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }

        // bubble sort
        for (int k = 0; k < 5; k++) {
            j = 5 - 1;

            do {
                troca = false;
                for (i = 0; i < j; i++) {
                    if (a[i][k] > a[i + 1][k]) {
                        aux = a[i][k];
                        a[i][k] = a[i + 1][k];
                        a[i + 1][k] = aux;
                        troca = true;
                    }
                }
                j--;
            } while (troca);
        }
        //Print out the ordered vector
        System.out.println("\nOrdered matrix: ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
    }

}
