/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12.ejercicio1;

public class Ave implements Volador, Cantante {
    @Override
    public void volar() {
        System.out.println("El ave está volando alto.");
    }

    @Override
    public void cantar() {
        System.out.println("El ave canta una melodía.");
    }
}