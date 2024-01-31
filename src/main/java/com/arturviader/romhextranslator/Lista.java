/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arturviader.romhextranslator;

/**
 *
 * @author msiub
 */
public class Lista {
    private String texto;
    private boolean traducir;
    
    public Lista(String texto, boolean traducir)
    {
        this.texto = texto;
        this.traducir = traducir;
    }
    
    public String getTexto()
    {
        return texto;
    }
    
    public boolean getTraducir()
    {
        return traducir;
    }
}
