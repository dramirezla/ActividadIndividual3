/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example10matricula;

/**
 *
 * @author David R.L
 */
public class CalculoMatricula {
    public static double ValorMatricula(int numinscripcion,double patrimonio,double estrato,String nombres){
        if(patrimonio>2000000 && estrato>3){
            return 50000+(patrimonio*0.03);
        }
        else{
            return 50000;
        }
    }
    
    
}
