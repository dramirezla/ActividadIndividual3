/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example7comparar;

/**
 *
 * @author David R.L
 */
public class Comparacion {
    public static String Comparar(double A,double B){
        if(A>B){
            return (A+" es mayor que "+B);
        }
        else if(A<B){
            return (A+" es menor que "+B);
        }
        else{
            return (A+" es igual que "+B);
        }
    }
}
