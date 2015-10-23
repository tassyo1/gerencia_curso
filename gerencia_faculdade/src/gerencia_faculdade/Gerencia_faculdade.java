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
public class Gerencia_faculdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Disciplina d[] = new Disciplina[5];
        Turma t [] = new Turma[10];
        Estudante e[] = new Estudante[30];
        Professor p[] = new Professor[10];
        
        for (int i = 0; i < 5; i++) {
            d[i]= new Disciplina("Disciplina "+i, "Ementa da Disciplina "+i,
                                    30.6f);
        }
        
        Estudante estudantes[] ={ new Estudante("Carlos",200912112)};
        //System.out.println(estudantes[0].getNome());
        
    }
    
}
