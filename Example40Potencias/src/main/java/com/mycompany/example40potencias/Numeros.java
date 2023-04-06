/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example40potencias;

/**
 *
 * @author David R.L
 */


public class Numeros {
    public static String obtenerRaiz(String str) {
    String[] valores = str.split(",");
    double[] raices = new double[valores.length];
  
    for (int i = 0; i < valores.length; i++) {
        int valor = Integer.parseInt(valores[i]);
        raices[i] = Math.sqrt(valor);
    }
      StringBuilder sb = new StringBuilder();
        for (int i = 0; i < raices.length; i++) {
            sb.append(raices[i]);
        if (i != raices.length - 1) {
            sb.append(",");
        }
    }

    return sb.toString();
  
    }
    public static String obtenerCuadrado(String str) {
    String[] valores = str.split(",");
    int[] cuadrados = new int[valores.length];
  
    for (int i = 0; i < valores.length; i++) {
        int valor = Integer.parseInt(valores[i]);
        cuadrados[i] =valor * valor;
    }
      StringBuilder sb = new StringBuilder();
  for (int i = 0; i < cuadrados.length; i++) {
    sb.append(cuadrados[i]);
    if (i != cuadrados.length - 1) {
      sb.append(",");
    }
  }

  return sb.toString();
  
    
    }
    public static String obtenerCubo(String str) {
        String[] valores = str.split(",");
        int[] cubos = new int[valores.length];
  
        for (int i = 0; i < valores.length; i++) {
            int valor = Integer.parseInt(valores[i]);
            cubos[i] =valor * valor * valor;
        }
          StringBuilder sb = new StringBuilder();
  for (int i = 0; i < cubos.length; i++) {
    sb.append(cubos[i]);
    if (i != cubos.length - 1) {
      sb.append(",");
    }
  }

  return sb.toString();
        
        }
}
