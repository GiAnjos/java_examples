import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        int vet[] = { 2, 4, 7, 8, 9 };
        int d;
        int pos = -1;

        Scanner ler = new Scanner(System.in);

        System.out.println("Type a value: ");
        d = ler.nextInt();

        pos = linear(vet, d);

        if (pos == -1) {
            System.out.println("Value not found!");
        } else {
            System.out.println("The value is in the position " + pos);
        }
    }

    public static int linear(int vet[], int g) {

        int pos = -1;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == g) {
                pos = i;
                return pos;
            }
        }
        return pos;
    }
}
