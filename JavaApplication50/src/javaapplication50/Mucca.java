/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

/**
 *
 * @author Windows
 */
public class Mucca implements Animale {

    @Override
    public void verso() {
        System.out.println("Muu");
    }

    @Override
    public String getNome() {
        return "Carolina"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void numeroZampe() {
        System.out.println("4"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attacca(Persona p) {
        System.out.println("attacca "+p.getNome()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
