/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmgui.Clases;

import java.util.Random;

public class GeneradorID {
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int LONGITUD_ID = 10;

    public String generarID() {
        Random random = new Random();
        StringBuilder id = new StringBuilder();

        for (int i = 0; i < LONGITUD_ID; i++) {
            int indice = random.nextInt(CARACTERES.length());
            char caracterAleatorio = CARACTERES.charAt(indice);
            id.append(caracterAleatorio);
        }

        return id.toString();
    }
}