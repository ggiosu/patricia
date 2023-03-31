/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

/**
 *
 * @author veron
 */
public class Gallo implements Animale{

    @Override
    public void verso() {
        System.out.println("chicchirichi");
    }

    @Override
    public void numeroZampe() {
        System.out.println("2");
    }

    @Override
    public String getNome() {
        return "Cocca";
    }

    @Override
    public void attacca(Persona p) {
        System.out.println("attaccato"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
