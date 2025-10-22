/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13.ejercicio1;

public class TestEjercicio1 {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 1: Clases Abstractas ---");
        
        Rectangulo rect = new Rectangulo(5.0, 4.0);
        Triangulo tri = new Triangulo(6.0, 3.0);

        System.out.printf("Área del Rectángulo: %.2f%n", rect.calcularArea());
        
        System.out.printf("Área del Triángulo: %.2f%n", tri.calcularArea());
    }
}