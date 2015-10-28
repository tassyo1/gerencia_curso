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
public class Estudante extends ReusoNome {
    private int matricula;
    
    
    public int getMatricula(){
        return matricula;
    }
  
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public Estudante( String nome, int matricula){
        super(nome);
        this.matricula = matricula;
        
    }
}
