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
public class Disciplina {
    private String nome;
    private String ementa;
    private Float carga_horaria;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEmenta(){
        return ementa;
    }
    
    public void setEmenta(String ementa){
        this.ementa =ementa;
    }
    
    public Float getCargaHoraria(){
        return carga_horaria;
    }
    
    public void setCargaHoraria(Float carga_horaria){
       this.carga_horaria = carga_horaria;
    }
    
}
