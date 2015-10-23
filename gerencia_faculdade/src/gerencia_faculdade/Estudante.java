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
public class Estudante {
    private String nome;
    private int matricula;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
}
