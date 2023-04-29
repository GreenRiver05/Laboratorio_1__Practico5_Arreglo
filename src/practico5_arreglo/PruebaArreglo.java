package practico5_arreglo;

//              GRUPO 9
//INTEGRANTES : Pablo Nicolas Peñaloza
//              Alex Gustavo Astudillo Duran
//              Gabriel Ezequiel Becerra Diaz

public class PruebaArreglo {
    public static final String nada = "\u001B[0m";               // se utilizo ANSI escape code, color caractares
    public static final String rojo = "\u001B[31m";             // se utilizo ANSI escape code, color caractares
    public static final String verde = "\u001B[32m";           // se utilizo ANSI escape code, color caractares
    public static final String amarillo = "\u001B[33m";         // se utilizo ANSI escape code, color caractares
    public static final String celeste = "\u001B[36m";          // se utilizo ANSI escape code, color caractares
  
    public static void main(String[] args) {

        System.out.println(amarillo + "A) Método sumarLista:" + nada + " recibe por parámetro un arreglo unidimensional de\n"
                + "enteros y muestre por pantalla la suma y promedio de los mismos.\n");

        int[] arreglo = {2, 4, 6, 8, 10, 12, 14};
        Arreglo.sumarLista(arreglo);
        
        System.out.println("\n\n____________________________________________________________________________________________________\n\n");

        System.out.println(celeste + "B) Método buscarMayor:" + nada + " recibe por parámetro un arreglo bidimensional e\n"
                + "irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.\n");

        int[][] bidimensional = {{5, 7, 10, 15, 35, 4}, {3, 9, 20}};
        Arreglo.buscarMayor(bidimensional);
        
         System.out.println("\n\n____________________________________________________________________________________________________\n\n");

        System.out.println(verde + "C) Método cuentaVocales: " + nada + "recibe por parámetro un String y retorne la cantidad\n"
                + "de vocales que tiene la cadena.\n");

        String cadena = "contamos todas las vocales";
        Arreglo.cuentaVocales(cadena);
        
        
         System.out.println("\n\n____________________________________________________________________________________________________\n\n");

        System.out.println(rojo + "D) Método cuentaCaracter:" + nada + "recibe por parámetro un String y un caracter, luego\n"
                + "retorne la cantidad de veces que se repite en la cadena el carácter recibido.\n");
        
        String cadena2 = "Usando GitHub Desktop";
        char caracter = 'u';
        int contadorCaracter = Arreglo.cuentaCaracter(cadena2, caracter);
        System.out.println("La cantidad de veces que se repite el caracter " + rojo + "'" + caracter + "'"
        + nada + " en la cadena" + rojo + " ''" + nada + cadena2 + rojo + "''" + nada + " es: " + rojo + contadorCaracter + "\n\n");
    }

}
