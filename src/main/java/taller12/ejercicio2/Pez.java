/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12.ejercicio2;

public class Pez implements Nadador, Respirador {
    @Override
    public void nadar() {
        System.out.println("El pez se desliza ágilmente en el agua.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez absorbe oxígeno a través de sus branquias.");
    }
}