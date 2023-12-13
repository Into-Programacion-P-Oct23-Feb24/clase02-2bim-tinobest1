/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        //int[] arreglo1 = new int[5];
        int[] arreglo1 = {1000, 1, 2, 2000, 300};
        String acomulador = "";
        int suma = 0;
        // System.out.println(arreglo1.length);
        arreglo1[2] = 1000;
        for (int i = 0; i < arreglo1.length; i++) {//(PALABRA LENGTH)el numero 
            //de elementos que el arreglo que este asociado
            suma = suma + arreglo1[i];
            acomulador = String.format("Subíndice o Índice %d,"
                    + " con valor %d\n", acomulador, suma,
                    i, arreglo1[i]);
            

        }
        acomulador = String.format("%s la suma total es: %d\n",
                acomulador,
                suma);
        System.out.printf("%s\n", acomulador, suma);
        System.out.println(acomulador.toUpperCase());
        

    }

}
