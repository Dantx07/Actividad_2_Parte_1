package actividad2parte1;

                //////////

import java.util.Scanner;

                //////////

public class Capitulo_3_EjercicioProp_19 {
    public static void main(String[] args){


        //Crea la instancia Scanner
        Scanner scanner = new Scanner(System.in);


        //Entrada de los datos con los que trabajaremos
        System.out.println("Ingrese la medida del lado del triangulo: ");
        var lado = scanner.nextInt();


        //Formulas necesarias e impresion de datos
        var perimetro = lado*3;
        System.out.println("El perimetro es: " + perimetro);
        var altura = ((lado*Math.sqrt(3))/2);
        System.out.println("La altura es: " + altura);
        var area = ((lado*altura)/2);
        System.out.println("El area es: " + area);


    }


}