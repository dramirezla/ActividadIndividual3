/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeom;

/**
 *
 * @author David R.L
 */
public class TrianguloRectangulo {
    int base; // Atributo que define la base de un triángulo rectángulo
    int altura; // Atributo que define la altura de un triángulo rectángulo
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
}

    double calcularArea() {
        return (base * altura / 2);
}

    double calcularPerímetro() {
        return (base + altura + calcularHipotenusa()); 
}
    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
}

String determinarTipoTriángulo() {
    
    if ((base == altura) && (base == calcularHipotenusa()) && (altura== calcularHipotenusa())){
        return "Es un triángulo equilátero";}
    else if ((base != altura) && (base != calcularHipotenusa()) &&(altura != calcularHipotenusa())){
        return "Es un triángulo escaleno"; }
    else{
        return "Es un triángulo isósceles";
    }
}
}
