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
public class Turma {
    private int numero;
    private Professor professor_responsavel;
    private int conta;
    private Estudante conjunto_alunos[]= new Estudante[conta];
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public Professor getProfessorResponsavel(){
        return professor_responsavel;
    }
    
    public void setNumero(Professor professor){
        this.professor_responsavel = professor;
    }
}
