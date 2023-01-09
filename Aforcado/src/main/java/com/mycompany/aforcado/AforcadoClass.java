/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aforcado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author a22anxoll
 */
public class AforcadoClass {

    
    private String palabra;
    private int erros;
    ArrayList<Character> letras = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //Constructor
    public void Aforcado(int erros) {
    }

    /**
     * pide a palabra que deberá ser adiviñada
     */
    private void pedirPalabra() {
        System.out.println("Introduce unha palabra");
        palabra = sc.nextLine();
    }

    /**
     * crea o array sustituindo as letras da palabra dada en pedirPalabra por _
     */
    private void crearArray() {
        for (int i = 0; i < palabra.length(); i++) {
            letras.add('_');
        }
    }

    /**
     * amosa o array cada vez que se pide unha letra
     */
    private void amosarArray() {
        System.out.println(letras);
    }

    /**
     * pide as letras e sustitue as _ pola letra que foi dada
     */
    private void pedirLetra() {
        char letra;
        
        
    }
    

    

    /**
     * chama a todos os metodos para xogar
     */
    public void xogar() {
        
        pedirPalabra();
        crearArray();
        amosarArray();
        pedirLetra();
        
        
    }

}

