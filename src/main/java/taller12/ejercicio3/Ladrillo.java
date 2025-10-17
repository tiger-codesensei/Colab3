/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12.ejercicio3;

import taller12.ejercicio1.Cantante; // Reusa la interfaz Cantante

// Mala práctica: Un Ladrillo no tiene lógica para "cantar".
public class Ladrillo implements Cantante {
    
    @Override
    public void cantar() {
        // Implementación forzada sin sentido:
        System.out.println("El ladrillo emite un sonido sordo al caer. (¡Esto no es cantar!)");
    }

    public void caer() {
        System.out.println("El ladrillo está cayendo.");
    }
}