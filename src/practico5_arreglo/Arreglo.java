package practico5_arreglo;

public class Arreglo {

    public static final String nada = "\u001B[0m";               // se utilizo ANSI escape code, color caractares
    public static final String verde = "\u001B[32m";           // se utilizo ANSI escape code, color caractares
    public static final String amarillo = "\u001B[33m";         // se utilizo ANSI escape code, color caractares
    public static final String celeste = "\u001B[36m";          // se utilizo ANSI escape code, color caractares

    static void sumarLista(int[] arreglo) {
        int suma = 0;
        int promedio = 0;
        for (int i = 1; i < arreglo.length; i++) {

            suma += arreglo[i];
            promedio = suma / arreglo.length;
            System.out.print(arreglo[i] + amarillo + " | " + nada);
        }
        System.out.println(amarillo + "\n\n↑ " + nada + " La suma de los numeros es  " + amarillo + suma + nada + " y el promedio es " + amarillo + promedio);
    }

    static void buscarMayor(int[][] bidimensional) {
        int mayor = 0;

//         for (int i = 0; i <bidimensional.length; i++) {
//         for (int j = 0; j <bidimensional[i].length; j++) {
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                if (bidimensional[i][j] > mayor) {
                    mayor = bidimensional[i][j];
                }
                System.out.print(bidimensional[i][j] + celeste  + " | " + nada);
            }
            System.out.println("\n");
        }
        System.out.println(celeste + "↑ " + nada + "El numero mayor es "+ celeste + mayor);
    }

    static void cuentaVocales(String cadena) {
        int vocales = 0;
        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                vocales++;
            }
        }
        System.out.println("La Cantidad de vocales que tiene la cadena " + verde + "''" + nada 
                + "contamos todas las vocales" + verde + "''" + nada + " es " + verde + vocales);
    }

    static int cuentaCaracter(String cadena, char caracter) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == caracter || Character.toUpperCase(c) == Character.toUpperCase(caracter) || Character.toLowerCase(c) == Character.toLowerCase(caracter)) {
                contador++;
            }
        }

        return contador;
    }
}
