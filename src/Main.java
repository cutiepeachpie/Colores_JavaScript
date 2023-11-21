import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lista de colores");
        System.out.println("¿Cuanto colores quieres introducir?");
        int numColores = input.nextInt();

        ArrayList<String> colores = new ArrayList<String>();

        for (int i = 0; i < numColores; i++){
            System.out.print("Introduce el color nª" + i + ":");
            String color = input.next();
            colores.add(color);

        }

        System.out.println("Has introducido los siguientes colores:");

        for (int i = 0; i < colores.size(); i++) {
            System.out. printf("\t"+ colores.get(i));
        }

        System.out.println("\n" +colores.toString());

    input.close();



// printn es salto de linea














        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}

