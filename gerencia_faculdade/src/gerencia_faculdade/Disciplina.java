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
public class Disciplina extends ReusoNome {
   
    private String ementa;
    private Float carga_horaria;
    
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
    
    public Disciplina(String nome, String ementa, Float carga_horaria){
        this.setNome(nome);
        this.ementa = ementa;
        this.carga_horaria =carga_horaria;
    }
}
