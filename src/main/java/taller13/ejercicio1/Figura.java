/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13.ejercicio1;

// Clase Abstracta
public abstract class Figura {
    
    // Método abstracto (debe ser implementado por las subclases)
    public abstract double calcularArea();

    // Método concreto (código base compartido)
    public void mostrarMensaje() {
        System.out.println("Cálculo de área de una figura geométrica.");
    }
}