/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example23ecuacion;

/**
 *
 * @author David R.L
 */
public class Ecuacion {
    public static String CalcularSoluciones(double a, double b, double c){
        double d=b*b-4*a*c;
        if(d<0){
            return "La ecuacion no tiene Soluciones reales";
        }
        else if(d==0){
            double x=-b/(2*a);
            return "La ecuacion tiene una solucion real que es: "+String.valueOf(x);
        }
        else{
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            return "La ecuacion tiene 2 soluciones reales que son: "+String.valueOf(x1)+" y "+String.valueOf(x2);
        }
    }
}
            

