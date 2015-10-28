/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerencia_faculdade;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
        System.out.println("(D)Disciplinas        Total cadastrado: "+d.size());
        System.out.println("(T)Turmas            Total cadastrado: "+t.size());
        System.out.println("(A)Alunos            Total cadastrado: "+e.size());
        System.out.println("(P)Professores        Total cadastrado: "+p.size());
        System.out.println("(S)-SAIR");
        
        String escolha =leitor.nextLine();// texto
        return escolha;
    }
    public static int segundoMenuEscolha(){
        System.out.println("Digite o respectivo número");
        System.out.println("1- Criar");
        System.out.println("2- Excluir");
        System.out.println("3- Pesquisar");
        int esc = Integer.parseInt(leitor.nextLine());
        return esc;
    }
    
    public static void main(String[] args) throws IOException  {
        ArrayList<Disciplina> d = new ArrayList<>();
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
        String pescolha ="";
        do{
                pescolha = primeiroMenuEscolha(d,t,e,p).toUpperCase().trim();

               switch(pescolha){
                         case "D":
                           int escolha = segundoMenuEscolha();

                           // criar
                           if (escolha == 1){
                               System.out.println("Digite o nome da Disciplina");
                               String n = leitor.nextLine().trim();
                               
                               System.out.println("Digite a ementa");
                               String eme = leitor.nextLine().trim();
                                                              
                               System.out.println("Digite a carga horária ");
                               Float ch = Float.parseFloat(leitor.nextLine().trim());                        
                               d.add(new Disciplina(n,eme,ch));
                               System.out.println(" ");
                               
                               System.out.println("Disciplina criada!");
                               
                               //exclusao
                           }else if (escolha == 2){ 
                               for (int i = 0; i < d.size(); i++) {
                                   System.out.println(i+"<-- "+d.get(i).getNome());
                               }
                                System.out.println("");
                               System.out.println("Digite o número da disciplina "
                                           + "que deseja excluir");
                                  int indice = Integer.parseInt(leitor.next().trim());
                                  d.remove(indice);
                                  System.out.println(" ");
                                  System.out.println("Disciplina deletada!");
                                  
                                  //pesquisar
                           }else if (escolha == 3){
                                   System.out.println("Digite o nome da Disciplina que deseja visualizar");
                                   String nome = leitor.nextLine().trim();
                                   
                                   for (int i = 0; i < d.size(); i++) {
                                       if( d.get(i).getNome().contains(nome)){
                                           System.out.println(" ");
                                           System.out.println(">Disciplina: "+ d.get(i).getNome()+"\n"+
                                                   "Ementa: "+d.get(i).getEmenta()+"\n"+
                                                   "Carga Horária: "+d.get(i).getCargaHoraria().toString());
                                           System.out.println(" ");
                                           break;
                                       }
                               }
                               
                               
                           }
                           System.out.println(" ");
                           System.out.println("Digite qualquer tecla para voltar ao menu");
                           System.in.read();
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
        }while(!pescolha.equals("S"));
           
 }
    
}
