/*
 Ejercicio 1 Java.- Array con 30 ventas del mes, y que diga cuáles y cuántas son mayores que $2000.
 */
package ejerciciouno;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
         int []ventas = new int [3];
        System.out.println("Ingresa los datos el array");
                
        for (int i=0;i<ventas.length;i++){
            System.out.println("Ingresa la venta numero"+(1+i));
            ventas[i]=sc.nextInt();
        }
             
        /*
        for (int i=0;i<ventas.length;i++){
            System.out.println("Venta numero "+(1+i)+ ventas[i]); 
        } */   
        
        for (int i=0;i<ventas.length;i++){
            if(ventas[i]>2000){
                System.out.println("La ventas mayores a 2000 son la venta "+ (i+1)+" "+ +ventas[i]);
            }
        }          
                
    }
    
}
