/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerencia_faculdade;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tassyo1
 */
public class Gerencia_faculdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Disciplina> d = new ArrayList();
        ArrayList<Turma> t = new ArrayList();
        ArrayList<Estudante> e = new ArrayList();
        ArrayList<Professor> p = new ArrayList();
        
        for (int i = 0; i < 5; i++) {
            d.add( new Disciplina("Disciplina "+i, "Ementa da Disciplina "+i,
                                    30.6f));
        }
        
        for (int i = 0; i < 10; i++) {
            p.add( new Professor("Professor "+i));
        }
        
        int conta_aluno =0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 30; j++) {
            e.add(new Estudante("Aluno "+conta_aluno,conta_aluno));
            conta_aluno++;
        } 
            t.add(new Turma(i,p.get(i),e,d.get(0)));
        }
       
        
        
        //System.out.println(estudantes[0].getNome());
        for (int i = 0; i < e.size(); i++) {
           //d System.out.println(e.get(i).getNome());
        }
        
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite algo");
        String algo =leitor.nextLine();// texto
        
    }
    
}
