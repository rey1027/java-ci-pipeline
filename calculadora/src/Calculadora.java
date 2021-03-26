
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int seleccion_de_operacion = 0;
        int num1 = 0 ;
        int num2 = 0 ;
        double resultado = 0.0;


        do {
            System.out.println("\n");
            System.out.println("SELECCIONE LA OPERACION QUE DESEA REALIZAR: ");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");



            seleccion_de_operacion= leer.nextInt();
            if (seleccion_de_operacion !=5) {
                System.out.print("Ingrese el primer número: ");
                num1 = leer.nextInt();
                System.out.print("Ingrese el segundo número: ");
                num2 = leer.nextInt();


            }
            switch(seleccion_de_operacion) {

                case 1:
                    seleccion_de_operacion = 1;
                    resultado = num1 + num2 ;
                    System.out.println("El resultado de la suma es " + resultado );
                    break ;
                case 2:
                    seleccion_de_operacion = 2;
                    resultado = num1 - num2 ;
                    System.out.println("El resultado de la resta es " + resultado );
                    break ;

                case 3:
                    seleccion_de_operacion = 3;
                    resultado = num1 * num2 ;
                    System.out.println("El resultado de la multiplicacion es " + resultado );
                    break ;


                case 4:
                    seleccion_de_operacion = 4;
                    resultado = num1 / num2 ;
                    System.out.println("El resultado de la division es " + resultado );
                    break ;
            }


        } while(seleccion_de_operacion!=5);
        System.out.println("HA ELEGIDO SALIR DE LA CALCULADORA");



    }

}

