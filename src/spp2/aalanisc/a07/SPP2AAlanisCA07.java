/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aalanisc.a07;
import java.util.Scanner ;
/**
 *
 * @author anamartha
 */
public class SPP2AAlanisCA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long[]numeros = new long[10];
    int posicion;
    Scanner T = new Scanner(System.in);
    for(int i=0;i<numeros.length;i++){
        System.out.println("Introduce el numero de la posicion " +i);
        numeros[i]=T.nextLong();
    }
        System.out.println("Introduzca la posicion del numero que desea conocer");
        posicion = T.nextInt();
        if(posicion>9){
            System.out.println("Fuera de rango");
        }else{
        System.out.println("La posicion "+posicion+ "contiene el numero "
                +numeros[posicion]);

        }
        
        
    }
    
}
