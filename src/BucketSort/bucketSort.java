/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BucketSort;
import java.util.*;
import java.util.Collections;
/**
 *
 * @author Noena
 */
public class bucketSort {
    // programa Java para ordenar una matriz
     // usando la ordenación de cubos
     // Función para ordenar arr[] de tamaño (n)
     // creamos un metodo donde  usemos la ordenación de cubos
    static void bucketSort(float arr[], int n)
    {
        if (n <= 0)
            return;
  
        // 1) Crear n cubos vacías
        Vector<Float>[] buckets = new Vector[n];
  
        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();
        }
  
        // 2) Poner los elementos de la matriz en diferentes cubos
        for (int i = 0; i < n; i++) {
            float cubos = arr[i] * n;
            buckets[(int)cubos].add(arr[i]);
        }
  
        // 3) Ordenar cubos individuales
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
  
        // 4) Concatenar todos los cubos en arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }
  
    // llamamos a los metodos 
    public static void main(String args[]){
        //creacion del arreglo con datos float
        float arr[] = { (float)0.897, (float)0.565,
                        (float)0.656, (float)0.1234,
                        (float)0.665, (float)0.3434 };
    
        //agregamos una variable n que es igual al tamaño del arreglo
        int n = arr.length;
        bucketSort(arr, n);
  
        //mandamos a imprimir el arreglo
        System.out.println("La ordenacion es: ");
        for (float el : arr) {
            System.out.print(el + " ,");
        }
    }
}
