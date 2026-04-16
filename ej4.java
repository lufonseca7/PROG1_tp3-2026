/* 
Hacer un método que dado un número entero con valor inicial 1,
haga una iteración incrementando el número de a uno hasta un
valor MAX = 4 (constante). Mientras itera deberá imprimir el
número. Luego invocarlo desde el programa principal y cuando
termina, imprimir por pantalla “terminó”
*/

public class ej4 {

    static final int MAX = 4;
    public static void main(String[] args) {
        numeroIncrementado();
        System.out.println("Termino");
    }

    public static void numeroIncrementado(){
        for (int i = 1; i<=MAX; i++){
            System.out.println("El numero en este momento es: " + i);
        }
    }
}
