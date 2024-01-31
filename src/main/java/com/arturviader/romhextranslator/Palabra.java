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
    private int inicial;
    private String hex;
    private String texto;
    private boolean encontrada;
    private boolean usada;
  
    public Palabra(String hex, String texto)
    {
        this.hex = hex;
        this.texto = texto;
        inicial = -1;
        encontrada = false;
        usada = false;
    }
    
     public Palabra(String hex, String texto,Boolean encontrada, int inicial)
    {
        this.hex = hex;
        this.texto = texto;
        this.inicial = inicial;
        this.encontrada = encontrada;
        usada = false;
    }
    
    public boolean getUsada()
    {
        return usada;
    }
    
    public void setUsada(boolean usada)
    {
        this.usada = usada;
    }
    
    public int getInicial()
    {
        return inicial;
    }
    
    public void setInicial(int inicial)
    {
        this.inicial = inicial;
    }
    
    public void setEncontrada(boolean encontrada)
    {
        this.encontrada = encontrada;
    }
    
    public boolean getEncontrada()
    {
        return encontrada;
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
