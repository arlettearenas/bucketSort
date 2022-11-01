package shakersort;

/**
 * @author arlet
 */
public class ShakerSort {
    
    public static int izquierda, derecha, ultimo; //variables para ordenamiento

    public static void main(String[] args) {
    int arreglo[] = {25, 2, 11, 6, 7};
    System.out.println("DESORDENADO");   
    for (int i = 0; i < arreglo.length; i++){
        
        System.out.print(arreglo[i]+ " ");
    }
        System.out.println(" ");
        izquierda = 1;
        derecha = arreglo.length;
        ultimo = arreglo.length - 1;
        
        do {
            for (int i = arreglo.length - 1; i > 0; i--){
                //Burbuja hacia la izquierda, los valores menores van a la izquierda
           if (arreglo[i-1] > arreglo[1]){
               int aux = arreglo[i];//Variable auxiliar para poder hacer intercambios
               arreglo[i] = arreglo[i-1];
               arreglo[i-1] = aux;
               ultimo = i;
               
           }
               
           }
            izquierda = ultimo - 1;
            for (int j = 1; j < arreglo.length; j++){
                if (arreglo[j - 1]>arreglo[j]){
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j - 1];
                    arreglo[j - 1] = aux;
                    ultimo = j;
                }
            }
            derecha = ultimo - 1;
            } while (derecha >= izquierda);
        System.out.println("ORDENADO");
        for (int i = 0; i< arreglo.length; i++){
         
            System.out.print(arreglo[i] + " ");
        }
        }
    
        }
