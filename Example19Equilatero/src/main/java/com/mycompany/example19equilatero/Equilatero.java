/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example19equilatero;

/**
 *
 * @author David R.L
 */
public class Equilatero {
    public static double CalPerimetro(double lado){
        return lado*3;
    }
    public static double CalAltura(double lado){
        double altura;
        altura=(lado/2)*1.732;
        return altura;
    }
    public static double CalArea(double lado){
        double altura;
        double area;
        altura=(lado/2)*1.732;
        area=(altura*lado)/2;
        return area;
    }
}
