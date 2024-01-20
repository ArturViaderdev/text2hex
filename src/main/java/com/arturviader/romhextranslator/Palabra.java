/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arturviader.romhextranslator;

/**
 *
 * @author msi
 */
public class Palabra {
    private String hex;
    private String texto;
    
    public Palabra(String hex, String texto)
    {
        this.hex = hex;
        this.texto = texto;
    }
    
    public String gethex()
    {
        return hex;
    }
    
    public String gettexto()
    {
        return texto;
    }
}
