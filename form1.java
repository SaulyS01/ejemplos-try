import java.util.Scanner;
import java.math.BigInteger;

class form1 {
    static Scanner input= new Scanner(System.in);

    public static void calcularFactorialNNum() {
        BigInteger factorial = BigInteger.valueOf(1);
        int numero;
        System.out.print("Ingrese el factorial de un  número: ");
        numero=input.nextInt();
        while(numero!= 0) {
            factorial=factorial.multiply(BigInteger.valueOf(numero));
            numero--;
        }
        System.out.println("El factorial es: "+ factorial);
    }
    public static void calcularMediaGeoArit() {
        int cantNumeros;
        double mediaArit=0, mediaGeo=1;
        System.out.print("Ingrese la cantidad de números para tal operación: ");
        cantNumeros=input.nextInt();
        for(int contador=1;contador<=cantNumeros;contador++){
            System.out.print("Ingrese el valor de la posicion "+contador+": ");
            double numeroLeido=input.nextDouble();
            mediaGeo *= numeroLeido;
            mediaArit += numeroLeido;
        }
            mediaGeo=Math.sqrt(mediaGeo);
            mediaArit=mediaArit/cantNumeros;
        if(mediaGeo<mediaArit) {
            System.out.println("El valor Geométrico es Menor con el valor de:"+mediaGeo+": ");
        }
        else {
            System.out.println("El valor Aritmético es Menor con el valor de:"+mediaArit+": ");
        }
    }

    public static void promePondera() {
        int numero;
        System.out.println("Ingrese el número: ");
        numero = input.nextInt();
        while (numero >= 0) {
            int cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El cuadrado del número es: "+ cuadrado + "\n");
            System.out.println("Ingrese otro número: ");
            numero = input.nextInt();
        }
    }

    public static void ejemplo4() {
        int num;
        System.out.println("Ingrese un número: ");
        num = input.nextInt();
        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("El número es par");
            }
            else {
                System.out.println("El número es impar \n");
            }
            System.out.println("Ingrese otro número: ");
            num = input.nextInt();
        }
    }

    public static void ejemplo5() {
        int num;
        System.out.println("Ingresar un número: ");
        num = input.nextInt();
        while (num > 0 || num < 0 || num == 0) {
            if (num == 0) {
                System.out.println("El número es neutro\n");
            }
            else if (num > 0) {
                System.out.println("El número es positivo\n");
            }
            else {
                System.out.println("El número es negativo\n");
            }
            System.out.println("Ingresar un número: ");
            num = input.nextInt();
        }
    }
    public static void ejemplo6() {
        int num;
        int contador = 0;
        do {
            System.out.println("Ingrese un número: ");
            num = input.nextInt();
            contador++;
        } while (num >= 0);
        System.out.println("Has introducido "+ contador +" números");
    }
    public static void ejemplo7() {
        int total = 0, num;
        do {
            System.out.println("Digite un número: ");
            num = input.nextInt();
            total += num;
        } while (num > 0);
        System.out.println("La suma de los números ingresados son: "+ total +"\n");
    }
    public static void ejemplo8() {
        int num;
        System.out.println("Ingresa la cantidad de números: ");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("El número es: "+ i);
        }
    }
    public  static void ejemplo9() {
        for (int i = 100; i >= 0; i -= 7) {
            System.out.println(i);
        }
    }
    public static void ejemplo10() {
        int num;
        double total = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingresa un número: ");
            num = input.nextInt();
            total += num;
        }
        System.out.println("La suma de los números son: "+ total);
    }
    public static void ejemplo11() {
        int total = 1;
        for(int i = 1; i < 20; i += 2) {
            total *= i;
        }
        System.out.println("El total del producto: "+ total);
    }
    public static void ejemplo12() {
        int num, factorial = 1;
        System.out.println("Ingresa el número: ");
        num = input.nextInt();
        for (int i = num; i != 0; i--) {
            factorial *= num;
            num--;
        }
        System.out.println("El factorial es: "+ factorial);
    }
    public static void ejemplo13() {
        int n, valor, contador = 0, contador2 = 0, contador3 = 0;
        System.out.println("Ingresar la cantidad de números: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingresa el número: ");
            valor = input.nextInt();
            if (valor == 0) {
                contador++;
            }
            if (valor > 0) {
                contador2++;
            }
            if (valor < 0) {
                contador3++;
            }
        }
        System.out.println("Los ceros son: "+ contador);
        System.out.println("Mayores a cero son: "+ contador2);
        System.out.println("Menores a cero: "+ contador3);
    }
    public static void main (String[] args) {
        System.out.println("Probar Algoritmos: ");
        String opcion;
        int numAlg;
        do{
            System.out.println("Ingrese el Algoritmo que desea probar: ");
            numAlg=input.nextInt();
            switch(numAlg){
                case 1: calcularFactorialNNum();
                    break;
                case 2: calcularMediaGeoArit();
                    break;
                case 3: promePondera();
                    break;
                case 4: ejemplo4();
                    break;
                case 5: ejemplo5();
                    break;
                case 6: ejemplo6();
                    break;
                case 7: ejemplo7();
                    break;
                case 8: ejemplo8();
                    break;
                case 9: ejemplo9();
                    break;
                case 10: ejemplo10();
                    break;
                case 11: ejemplo11();
                    break;
                case 12: ejemplo12();
                    break;
                case 13: ejemplo13();
                    break;
                default: System.out.println("El valor que ingresó no existe");
                    break;
            }
            System.out.println("Desea probar mas algoritmos? SI/NO");
            opcion=input.next();

        } while(opcion.equals("SI") || (opcion.equals("si")));

    }

}


