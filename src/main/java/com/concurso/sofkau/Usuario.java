/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.concurso.sofkau;

/**
 *
 * @author DIDIER JAVIER
 */
public class Usuario {
    private String nombre;
    private static int puntos;
    
    public Usuario(String nombre) {
        this.nombre = nombre;
        Usuario.puntos = 1;
    }

    public static int getPuntos() {
        return puntos;
    }

    public static void setPuntos(int puntos) {
        Usuario.puntos = puntos;
    }

    public String getName() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}


