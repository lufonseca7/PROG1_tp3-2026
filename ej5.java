/* 
Implemente los siguientes métodos e invóquelos desde el main,
en donde se debe mostrar el dato solicitado. En todos los casos,
debe continuar solicitando el dato solicitado hasta que el usuario
lo ingrese correctamente:

    a. Un método que permita leer desde teclado una letra
minúscula. Dicho método debe utilizar internamente la
función Utils.leerChar().

    b. Un método que permita leer desde teclado un número
natural (número entero mayor a 0). Dicho método debe
utilizar internamente la función Utils.leerInt().

    c. Un método que permita leer desde teclado un número entero
dentro de un rango determinado por dos valores: min y max.
Dicho método debe utilizar internamente la función
Utils.leerInt().

    d. Un método que permita leer desde teclado un carácter
dentro de un rango determinado por dos valores:
caracter_min y caracter_max. Dicho método debe utilizar
internamente la función Utils.leerChar().

    e. Un método que permita leer desde teclado una vocal. Dicho
método debe utilizar internamente la función Utils.leerChar().

    f. Un método que permita leer desde teclado números enteros
múltiplos de un determinado valor numérico. Dicho método
debe utilizar internamente la función Utils.leerInt().
*/

public class ej5 {

    static final int MIN = 2;
    static final int MAX = 9;
    static final char caracter_min = 'a';
    static final char caracter_max = 'k';

    public static void main(String[] args) {
        char letraMinuscula = obtenerLetraM(); //A.
            System.out.println("La letra minuscula ingresada fue: " + letraMinuscula);
        
        int numeroNatural = obtenerNumeroN(); //B.
            System.out.println("El numero natural ingresado fue el: " + numeroNatural);

        int numeroEntero = obtenerNumeroE(); //C.
            System.out.println("El numero entero dentro del rango pactado fue el: "+ numeroEntero);

        char letraRango = obtenerLetraRango(); //D.
            System.out.println("La letra ingresada dentro del rango pactado fue la: " + letraRango);

        char letraVocal = obtenerVocal(); //E.
            System.out.println("La letra ingresada fue una vocal y era: " + letraVocal);

        boolean multiplo = verificarMultiplo(); //F.
            if (multiplo == true){
                System.out.println("El numero ingresado era multiplo del numero pactado");
            }
            else{
                 System.out.println("el numero ingresado no era multiplo del numero pactado");
            }
            
            


    }


    public static char obtenerLetraM(){
        char letraM = 'R'; 
        
        while (!(letraM >= 'a' && letraM <= 'z')){
            System.out.println("Ingrese una letra minuscula");
            letraM = utils.leerChar();

            if (!(letraM >= 'a' && letraM <= 'z')){
                System.out.println("No ingreso una letra minuscula, intentelo de nuevo");
            }
        }

        return letraM;
    }

    public static int obtenerNumeroN(){
        int numero = 0;

        while (numero<=0){
            System.out.println("Ingrese un numero natural");
            numero = utils.leerInt();

            if (numero<=0){
                System.out.println("No ingreso un numero natural, intentelo de nuevo");
            }
        }
    
        return numero;
    }

    public static int obtenerNumeroE(){
        int numeroEntero = 1;

        while (!(numeroEntero>=MIN && numeroEntero<=MAX)){
            System.out.println("Ingrese un numero entre 2 y 9");
            numeroEntero = utils.leerInt();

            if (!(numeroEntero>=MIN && numeroEntero<=MAX)) {
                System.out.println("No ingreso un numero entre el rango mencionado, intentelo de nuevo");
            }
        }

        return numeroEntero;
    }

    public static char obtenerLetraRango(){
        char letra = 'o';

        while (!(letra>=caracter_min && letra<=caracter_max)){
            System.out.println("Ingrese una letra minuscula entre 'a' y 'k'");
            letra = utils.leerChar();
        
            if (!(letra>=caracter_min && letra<=caracter_max)){
                System.out.println("No ingreso una letra en el rango mencionado, intentelo de nuevo");
            }
        }

        return letra;
    }

    public static char obtenerVocal(){
        char letraVocal = 's';

        while ((letraVocal>='a'&& letraVocal<='z')||(letraVocal>='A'&&letraVocal<='Z')){
            System.out.println("Ingrese una letra para corroborar si es vocal");
            letraVocal = utils.leerChar();

            switch (letraVocal) {
                case 'a', 'A':
                    System.out.println("Su letra es vocal");
                    break;
                case 'e', 'E':
                    System.out.println("Su letra es vocal");
                    break;    
                case 'i', 'I':
                    System.out.println("Su letra es vocal");
                    break;
                case 'o', 'O':
                    System.out.println("Su letra es vocal");
                    break;
                case 'u', 'U':
                    System.out.println("Su letra es vocal");
                    break;
                default:
                    System.out.println("Ingreso una letra pero no es vocal, continue ingresando letras");
                    break;  
            }
        
        }
       

        return letraVocal;
    }

    public static boolean verificarMultiplo(){
    int numero;
    int multiplo = 4;

    System.out.println("Ingrese un numero entero");
    numero = utils.leerInt();

    while (numero % multiplo != 0){
        System.out.println("No es multiplo de " + multiplo + ", intente de nuevo");
        numero = utils.leerInt();
    }

    return true;
}
}

