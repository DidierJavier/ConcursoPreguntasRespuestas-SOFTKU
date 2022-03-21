/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.concurso.sofkau;

/**
 *
 * @author DIDIER JAVIER
 */
public class Respuesta {
    private final String respuesta;
    private final String caracter;
    private final Boolean acierto;

    public Respuesta(String respuesta, String caracter, Boolean acierto) {
        this.respuesta = respuesta;
        this.caracter = caracter;
        this.acierto = acierto;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public String getCaracter() {
        return caracter;
    }

    public Boolean getAcierto() {
        return acierto;
    }   
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //sb.append("");
        sb.append("\n").append(caracter);
        sb.append(". ").append(respuesta);
        //sb.append(", acierto=").append(acierto);
        //sb.append('}');
        return sb.toString();
    }
    
    
}
