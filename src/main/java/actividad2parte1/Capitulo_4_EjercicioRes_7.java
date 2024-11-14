package actividad2parte1;

                //////////

import java.util.Scanner;

                //////////

public class Capitulo_4_EjercicioRes_7 {
    public static void main(String[] args) {
        
        
        //Crea la instancia Scanner
        Scanner scanner = new Scanner(System.in);


        //Entrada de los datos requeridos
        System.out.println("Ingrese el numero A: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese el numero B: ");
        int b = scanner.nextInt();


        //Verifica los numeros
        if (a > b)      {
            System.out.println("A es mayor que B");
        }

        else if (a == b)    {
            System.out.println("A es igual que B");
        }

        else    {
            System.out.println("A es menor que B");
        }


    }


}