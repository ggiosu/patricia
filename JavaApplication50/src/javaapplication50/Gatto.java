/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

/**
 *
 * @author Emanuele Cardinale
 */
public class Gatto implements Animale {
    private String nome;

    @Override
    public void verso() {
        System.out.println("miao");
    }

    public Gatto(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    
}
