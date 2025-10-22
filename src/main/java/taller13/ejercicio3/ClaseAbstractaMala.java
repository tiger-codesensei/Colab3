/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Archivo: taller13/ejercicio3/ClaseAbstractaMala.java
package taller13.ejercicio3;

// Este código compila, pero la discusión se centra en la sintaxis.
public abstract class ClaseAbstractaMala {
    
    // NO ES POSIBLE: Las clases abstractas no usan la palabra clave 'default' para métodos concretos.
    // El método concreto se define directamente así:
    public void metodoConcreto() {
        System.out.println("Este es un método concreto normal de una clase abstracta.");
    }
    
    public abstract void metodoAbstracto();

    // Si intentaras:
     default void metodoPredeterminado() {} 
    // Esto produciría un ERROR DE COMPILACIÓN.
}