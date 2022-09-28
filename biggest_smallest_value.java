
//  Ready 3 number and find which is the biggest and which is the smallest
import java.util.Scanner;

public class Alo 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int x, y, z, maior, menor;

        System.out.println("Type the first number: ");
        x = input.nextInt();

        System.out.println("Type the second number: ");
        y = input.nextInt();

        System.out.println("Type the third number: ");
        z = input.nextInt();
    }

    if((x>y)&&(x>z))
    {
        maior = x;
    }
    else
    {
        if (y > z) {
            maior = y;
        } else {
            maior = z;
        }
    }
    System.out.println("The number with the biggest value is: "+maior);

    if((x<y)&&(x<z))
    {
        menor = x;
    }
    else
    {
        if (y < z) 
        {
            menor = y;
        } 
        else 
        {
            menor = z;
        }
    }
    System.out.println("The number with the smallest value is: "+menor);
}
