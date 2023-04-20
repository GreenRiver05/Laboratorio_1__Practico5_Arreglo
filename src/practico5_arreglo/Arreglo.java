package practico5_arreglo;

public class Arreglo {

    static void sumarLista(int[] arreglo) {
        int suma = 0;
        int promedio = 0;
        for (int i = 1; i < arreglo.length; i++) {

            suma += arreglo[i];
            promedio = suma / arreglo.length;
        }
        System.out.println("La suma de los numeros es > " + suma + " y el promedio es > " + promedio);
    }

    static void buscarMayor(int[][] bidimensional){
        int mayor=0;
        
//         for (int i = 0; i <bidimensional.length; i++) {
//         for (int j = 0; j <bidimensional[i].length; j++) {
        for (int[] bidimensional1 : bidimensional) {
            for (int j = 0; j < bidimensional1.length; j++) {
                if (bidimensional1[j] > mayor) {
                    mayor = bidimensional1[j];
                }
            }
        }
         System.out.println("El numero mayor es >" + mayor);
    }
    
    
    static void cuentaVocales(String cadena){
        int vocales=0;
        for (int i = 0; i<cadena.length(); i++) {
    
             if(cadena.equalsIgnoreCase("a")){
                 vocales++;
             }
        } 
        System.out.println(vocales);
    }
            
}
