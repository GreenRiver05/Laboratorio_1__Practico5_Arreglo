package practico5_arreglo;

public class Arreglo {

    public static void sumarLista(int[] arreglo) {
        int suma = 0;
        int promedio = 0;
        for (int i = 1; i < arreglo.length; i++)
        {
            suma += arreglo[i];
            promedio = suma / arreglo.length;
        }
        System.out.println("La suma de los numeros es > " + suma + " y el promedio es > " + promedio);
    }

    
}
