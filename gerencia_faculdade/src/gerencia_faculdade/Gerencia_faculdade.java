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
    public static Scanner leitor = new Scanner(System.in);
    
    public static String primeiroMenuEscolha(ArrayList<Disciplina> d, ArrayList<Turma> t,ArrayList<Estudante> e,ArrayList<Professor> p){
        System.out.println("..:Sistema de gestão de Faculdade:..");
        System.out.println("Digite a respectiva letra");
        System.out.println("(D)isciplinas        Total cadastrado: "+d.size());
        System.out.println("(T)turmas            Total cadastrado: "+t.size());
        System.out.println("(A)Alunos            Total cadastrado: "+e.size());
        System.out.println("(P)rofessores        Total cadastrado: "+p.size());
        
        String escolha =leitor.nextLine();// texto
        return escolha;
    }
    public static int segundoMenuEscolha(){
        System.out.println("Digite o respectivo número");
        System.out.println("1- Criar");
        System.out.println("2- Excluir");
        System.out.println("3- Pesquisar");
        int esc = leitor.nextInt();
        return esc;
    }
    
    public static void main(String[] args)  {
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
        //for (int i = 0; i < e.size(); i++) {
           // System.out.println(e.get(i).getNome());
        //}
        switch(primeiroMenuEscolha(d,t,e,p).toUpperCase()){
                  case "D":
                    if (segundoMenuEscolha() == 1){
                        System.out.println("Digite o nome da Disciplina ");
                        String n = leitor.next();
                        
                        System.out.println("Digite a ementa");
                        String eme = leitor.next();
                        System.out.println("Digite a carga horária ");
                        Float ch = leitor.nextFloat();                        
                        d.add(new Disciplina(n,eme,ch));
                        primeiroMenuEscolha(d,t,e,p);
                    }else if (segundoMenuEscolha() == 2){
                        
                    }else if (segundoMenuEscolha() == 3){
                    
                    }
                    break;
                  case "T":
                    segundoMenuEscolha();
                      
                    break;
                  case "A":
                    segundoMenuEscolha();
                    break;
                    
                  case "P":
                    segundoMenuEscolha();
                    break;
        }
           
    }
    
}
