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
public class Cane implements Animale{

   private String pelo="biondo", nome;
   private int codice=9;

    public Cane() {

    }

    public Cane(String nome) {
        this.nome = nome;
        }

   @Override
   public void attacca(Persona p){
       System.out.println("Moccicato "+p.getNome() );
   }
   
    
    
    
   @Override
    public void verso(){
        System.out.println("bau");
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void numeroZampe() {
        System.out.println("4");
    }
    
}
