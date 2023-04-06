/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeom;

/**
 *
 * @author David R.L
 */
public class Circulo {
    int radio; // Atributo que define el radio de un círculo

    Circulo(int radio) {
        this.radio = radio;
}

    double calcularArea() {
        return Math.PI*Math.pow(radio,2);
}

    double calcularPerímetro() {
        return 2*Math.PI*radio;
}
}
