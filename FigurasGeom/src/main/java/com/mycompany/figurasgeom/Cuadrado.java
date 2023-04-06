/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeom;

/**
 *
 * @author David R.L
 */
public class Cuadrado {
    int lado; // Atributo que define el lado de un cuadrado

    public Cuadrado(int lado) {
        this.lado = lado;
}

    double calcularArea() {
        return lado*lado;
}

    double calcularPerímetro() {
        return (4*lado);
}
}
