/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example18empleado;

/**
 *
 * @author David R.L
 */
public class Salario {
    public static double calcularSalarioBruto(double horas, double valor){
        double bruto;
        bruto=valor*horas;
        return bruto;
    }
    public static double calcularSalarioNeto(double horas, double valor, double porcen){
        double bruto;
        double neto;
        bruto=valor*horas;
        neto=bruto*(1-(porcen/100));
        return neto;
    }
}
