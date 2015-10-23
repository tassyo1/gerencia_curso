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
    private Estudante conjunto_alunos[];
    private Disciplina disciplina;
    
    public Turma(int numero, Professor professor_responsavel, Estudante alunos[], Disciplina disciplina){
        this.numero = numero;
        this.professor_responsavel = professor_responsavel;
        this.conjunto_alunos = alunos;
        this.disciplina = disciplina;
    }
    
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
    
    public Disciplina getDisciplina(){
        return disciplina;
    }
    
    public void setDisciplina(Disciplina disciplina ){
        this.disciplina = disciplina;
    }
    
    public Estudante[] getConjuntoAlunos(){
        return conjunto_alunos;
    }
    
    public void setConjuntoAlunos(Estudante[] conjunto_alunos){
        this.conjunto_alunos = conjunto_alunos;
    }
}
