/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerencia_faculdade;

/**
 *
 * @author tassyo1
 */
public class Professor extends ReusoNome {
    private int numero;
    private String email;
    
    public Professor(String nome, int numero, String email){
        super(nome);
        this.numero = numero;
        this.email = email;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public String getEmail(){
        return this.email;
    }
}
