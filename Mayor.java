/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example41mayor;

/**
 *
 * @author David R.L
 */
public class Mayor {
    public static int encontrarMaximo(String str) {
    String[] valores = str.split(",");
    int maximo = Integer.parseInt(valores[0]);
    
    for (int i = 1; i < valores.length; i++) {
      int valor = Integer.parseInt(valores[i]);
      if (valor > maximo) {
        maximo = valor;
      }
    }
    
    return maximo;
  }
}