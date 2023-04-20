
package practico5_arreglo;

public class Practico5_Arreglo {

   
    public static void main(String[] args) {
        
        int[] arreglo = {2,4,6,8,10,12,14};
        Arreglo.sumarLista(arreglo);
        
        int[][] bidimensional = {{5,7,10,15,35,4},{3,9,20}};
        Arreglo.buscarMayor(bidimensional);
            
        String cadena = "contamos todas las vocales";
        Arreglo.cuentaVocales(cadena);
        
        
    }
    
}
