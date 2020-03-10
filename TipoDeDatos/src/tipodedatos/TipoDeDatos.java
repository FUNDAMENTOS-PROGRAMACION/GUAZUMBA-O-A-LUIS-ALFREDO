/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodedatos;

/**
 *
 * @author USERPC
 */
public class TipoDeDatos {

    /**
     * @param args the command line arguments
     */
    
    //Enteros 
    int numeroEntero = 5; 
    double numeroDouble = 3.14;
    char letra = 'A';
    String caderna = "Hola Mundo";
    boolean valorBool = false;
   //valorBool = true;
    
    public static void main(String[] args) {
        
        imprimirNombre();
        sumar2Numeros(3,2);
        System.out.println(sumar2Numeros(3,2));
        
        // TODO code application logic here
    }
 
    public static void imprimirNombre(){
        System.out.println("Luis Alfredo Guazumba Oña");
    }
    
    public static int sumar2Numeros(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
}
