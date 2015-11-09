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
        System.out.println("4- Listagem");
        int esc = Integer.parseInt(leitor.nextLine());
        return esc;
    }
    
    public static void main(String[] args) throws IOException  {
        ArrayList<Disciplina> d = new ArrayList<>();
        ArrayList<Turma> t = new ArrayList();
        ArrayList<Estudante> e = new ArrayList();
        ArrayList<Professor> p = new ArrayList();
        
        //inserção de matérias
        d.add( new Disciplina("Matemática","Trigonometria, algebrar, aritmética, equação do segundo grau",40.5f));
        d.add( new Disciplina("Português","classe gramatical, interpretação de texto, regência",30.6f));
        d.add( new Disciplina("Química","Tabela periódica, metaís, gazes nobres",25.5f));
        d.add( new Disciplina("Geografia","Planaltos, planícies, erosão",50.5f));
        d.add( new Disciplina("Inglês","verbo to be, genitive case, verbo to have",30.0f));
        
        //inserção de professores
        p.add( new Professor("Carlos Sampaio",45578,"csampaio@uniescola.edu.br"));
        p.add( new Professor("Marisa Mendes",22334,"marisa_mendes@uniescola.edu.br"));
        p.add( new Professor("Almir Ferreira",99757,"almirf@uniescola.edu.br"));
        p.add( new Professor("José Raed",79858,"joser@uniescola.edu.br"));
        p.add( new Professor("Milena Popovic",65453,"mp@uniescola.edu.br"));
        p.add( new Professor("Olavo de Carvalho",32456,"oC@uniescola.edu.br"));
        p.add( new Professor("Eloi Veit",43235,"eloiV@uniescola.edu.br"));
        p.add( new Professor("Paulo Ricardo",42568,"pauloricardo@uniescola.edu.br"));
        p.add( new Professor("Luis Gonzaga de Carvalho",32456,"luisgonzada@uniescola.edu.br"));
        p.add( new Professor("Cida Campos",12345,"cida_campos@uniescola.edu.br"));
        
        // inserção de alunos
        e.add(new Estudante("Eduarda Sacon",2015001)); 
        e.add(new Estudante("Andressa Gebert",2015002));
        e.add(new Estudante("Jéssica Taynara Amorim",2015003)); 
        
        e.add(new Estudante("Lucas Zancan",2015004));
        e.add(new Estudante("Vivian Camille Pires",2015005)); 
        e.add(new Estudante("Flávia Tormes Tossatti",2015006));
        
        e.add(new Estudante("Moisés Fernando Basso Moreira",2015007)); 
        e.add(new Estudante("Isabela Cristina S. Vergani",2015008));
        e.add(new Estudante("Maria Luiza Ben Benetti ",2015009));
        
        e.add(new Estudante("Julio César Lopes",2015010));
        e.add(new Estudante("Guilherme Gabriel Wessler",2015011)); 
        e.add(new Estudante("Fernando da Rosa",2015012));
        
        e.add(new Estudante("Moisés Grassi",2015013)); 
        e.add(new Estudante("Ricieri Eloir Saretto Preis",2015014));
        e.add(new Estudante("Victor Ferreira",2015015)); 
        
        e.add(new Estudante("Gabrielly V. Gimenes",2015016));
        e.add(new Estudante("Maria Clara M. Guth",2015017)); 
        e.add(new Estudante("Paulo Ricardo S. Ribeiro",2015018));
        
        e.add(new Estudante("Miryan B. S. Da Rosa",2015019)); 
        e.add(new Estudante("Eduarda Dückel",2015020));
        e.add(new Estudante("Edimar Gabriel Klaus Herckert",2015021)); 
        
        e.add(new Estudante("Maria Claudia Teixeira",2015022));
        e.add(new Estudante("Kaua Zeiser Dias",2015023)); 
        e.add(new Estudante("Mauricio Loewenstein",2015024));
        
        e.add(new Estudante("Natália K. Wessler",2015025));          
        e.add(new Estudante("Guilherme A. Beckert",2015026));
        e.add(new Estudante("Maria Fernanda S. Vian",2015027));
        
        e.add(new Estudante("Clara Eloísa Sehn",2015028));
        e.add(new Estudante("Leonardo H. Rech Simonetti",2015029)); 
        e.add(new Estudante("Bianca Beling",2015030));
        
        ///
        /// inserção de turma
        
        t.add(new Turma(801,p.get(0), new ArrayList(e.subList(0, 3)), d.get(0)));
        t.add(new Turma(823,p.get(1), new ArrayList(e.subList(3, 6)), d.get(1)));
        t.add(new Turma(854,p.get(2), new ArrayList(e.subList(6, 9)), d.get(2)));
        t.add(new Turma(876,p.get(3), new ArrayList(e.subList(9, 12)), d.get(3)));
        t.add(new Turma(887,p.get(4), new ArrayList(e.subList(12, 15)), d.get(4)));
        t.add(new Turma(898,p.get(5), new ArrayList(e.subList(15, 18)), d.get(0)));
        t.add(new Turma(457,p.get(6), new ArrayList(e.subList(18, 21)), d.get(1)));
        t.add(new Turma(856,p.get(7), new ArrayList(e.subList(21, 24)), d.get(2)));
        t.add(new Turma(456,p.get(8), new ArrayList(e.subList(24, 27)), d.get(3)));
        t.add(new Turma(752,p.get(9), new ArrayList(e.subList(27, 30)), d.get(4)));
 
       
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
                                  int indice = Integer.parseInt(leitor.nextLine().trim());
                                  d.remove(indice);
                                  
                                  System.out.println(" ");
                                  System.out.println("Disciplina deletada!");
                                  
                                  //pesquisar
                           }else if (escolha == 3){
                                   System.out.println("Digite o nome da Disciplina que deseja visualizar");
                                   String nome = leitor.nextLine().trim();
                                   
                                   for (int i = 0; i < d.size(); i++) {
                                       if( d.get(i).getNome().equals(nome)){
                                           System.out.println(" ");
                                           System.out.println(">Disciplina: "+ d.get(i).getNome()+"\n"+
                                                   "Ementa: "+d.get(i).getEmenta()+"\n"+
                                                   "Carga Horária: "+d.get(i).getCargaHoraria().toString());
                                           System.out.println(" ");
                                           break;
                                       }
                                       if (i == (d.size() -1) ){
                                           System.out.println(" ");
                                           System.out.println("Disciplina não encontrada !");
                                       }
                               }   
                            //Listagem       
                           }else if (escolha == 4){
                              for (int i = 0; i < d.size(); i++) {
                               System.out.println(d.get(i).getNome());
                              }
                           }
                           System.out.println(" ");
                           System.out.println("Digite qualquer tecla para voltar ao menu");
                           
                           System.in.read(); // espera uma tecla a ser digitada
                           break;
                             
                             
                         case "T":
                           escolha = segundoMenuEscolha();  
                           // criar
                           if ( escolha == 1){
                               String escolha_insert;
                               ArrayList<Estudante> eArray = new ArrayList<>();
                               Professor professor_add = null ;
                               
                               System.out.println("Digite o número da turma ");
                               int nr = Integer.parseInt(leitor.nextLine());
                               
                               System.out.println("Lista de Professores:");
                               for (int i = 0; i < p.size(); i++) {
                                   System.out.println(p.get(i).getNumero()+"<-- "+p.get(i).getNome());
                               }
                               System.out.println("");
                               System.out.println("Digite o número do Professor desejado");
                               int nr_prof = Integer.parseInt(leitor.nextLine());
                               
                               for (int i = 0; i < p.size(); i++) {
                                   if(p.get(i).getNumero() == nr_prof){
                                       professor_add = p.get(i);
                                       break;
                                   }   
                               }
                               
                               
                               do{
                                    System.out.println("Lista de Alunos:");
                                    for(int i = 0; i < e.size(); i++){
                                        System.out.println(e.get(i).getMatricula()+"<- "+e.get(i).getNome());
                                    }
                                    System.out.println("");
                                    System.out.println("Digite a matrícula do aluno que você deseja inserir nessa turma");

                                    int nr_matricula = Integer.parseInt(leitor.nextLine());

                                    for (int i = 0; i < e.size(); i++) {
                                        boolean critica = true;
                                        for (int j = 0; j < eArray.size(); j++) {
                                            if(eArray.get(j).getMatricula() == nr_matricula){
                                             System.out.println(" ");
                                             System.out.println("Esse aluno já foi adicionado nessa turma"); // critica
                                             critica = false;
                                            }
                                            break;
                                        }

                                        if (critica){ 
                                             if(e.get(i).getMatricula() == nr_matricula){
                                                 eArray.add(e.get(i));
                                                 break;
                                             }
                                             if(i == (e.size() -1)){
                                             System.out.println(" ");
                                             System.out.println("Matrícula não encontrada.");
                                             critica =false;
                                             break;
                                         }
                                        }else{
                                            break;
                                        }
                                    }                              
                                    System.out.println("Deseja inserir outro aluno? S/N");
                                    escolha_insert =leitor.nextLine().trim().toUpperCase(); 
                               }while(!escolha_insert.equals("N"));
                               
                              
                               System.out.println("Lista de Disciplinas:");
                               for (int i = 0; i < d.size(); i++) {
                                   System.out.println(i+"<--"+d.get(i).getNome());
                               }
                               System.out.println(" ");
                               System.out.println("Digite o número da respectiva disciplina");
                               
                               System.out.println(" ");
                               int nr_disci = Integer.parseInt(leitor.nextLine());
                               
                               
                               t.add(new Turma(nr,professor_add,eArray,d.get(nr_disci)));
                               System.out.println(" ");
                               System.out.println("Turma criada!");
                           
                           

                            //exclusao
                           }else if(escolha == 2){
                               for (int i = 0; i < t.size(); i++) {
                                   System.out.println("Turma: "+ t.get(i).getNumero());
                               }
                               System.out.println("");
                               System.out.println("Digite o número da turma que deseja excluir");
                                  int indice = Integer.parseInt(leitor.nextLine().trim());
                                  
                                  for (int i = 0; i < t.size(); i++) {
                                      if (t.get(i).getNumero() == indice){                                      
                                        t.remove(i);
                                        System.out.println("Turma deletada!");
                                        break;
                                      }
                                  }
                                  
                                  
                                                          
                           //pesquisar
                           }else if (escolha == 3){
                              System.out.println("Digite o número da Turma que deseja visualizar");
                              int nr = Integer.parseInt(leitor.nextLine().trim());
                              
                               for (int i = 0; i < t.size(); i++) {
                                   if(t.get(i).getNumero() == nr){
                                       String alunos_concat="";
                                       for (int j = 0; j < t.get(i).getConjuntoAlunos().size(); j++) {
                                           alunos_concat +=t.get(i).getConjuntoAlunos().get(j).getNome()+" Matrícula: "+ t.get(i).getConjuntoAlunos().get(j).getMatricula()+ "\n";
                                       }
                                        System.out.println("Turma: "+ t.get(i).getNumero()+"\n"+
                                                "Professor: "+t.get(i).getProfessorResponsavel().getNome()+"\n"+
                                                "Alunos: \n"+alunos_concat+
                                                "Disciplina: "+t.get(i).getDisciplina().getNome());
                                        break;
                                   }
                                   if (i == (t.size() -1) ){
                                           System.out.println(" ");
                                           System.out.println("Turma não encontrada !");
                                   }   
                               }
                                   
                           
                               
                               //listagem
                           }else if (escolha == 4){
                               System.out.println(" ");
                               System.out.println("Listagem das turmas");
                               for (int i = 0; i < t.size(); i++) {
                                   System.out.println("Turma: "+ t.get(i).getNumero());
                               }  
                           }

                           
                           System.out.println(" ");
                           System.out.println("Digite qualquer tecla para voltar ao menu");
                           
                           System.in.read(); // espera uma tecla a ser digitada
                           
                           break;
                         case "A":
                           escolha = segundoMenuEscolha();
                           
                           //criar
                           if (escolha == 1){
                               System.out.println("Digite o nome do Aluno");
                               String n = leitor.nextLine().trim();
                               
                               System.out.println("Digite a matrícula do Aluno");
                               int nr_mat = Integer.parseInt(leitor.nextLine().trim());
                               
                               e.add(new Estudante(n, nr_mat));
                               
                               System.out.println(" ");
                               System.out.println("Aluno cadastrado!");
                               
                               
                           //exclusao    
                           }else if(escolha == 2){
                               for (int i = 0; i < e.size(); i++) {
                                   System.out.println("Matricula: "+e.get(i).getMatricula()+" Aluno: "+e.get(i).getNome());
                               }
                               
                               System.out.println("");
                               System.out.println("Digite o número da matricula do Aluno "
                                           + "que deseja excluir");
                                  int e_mat = Integer.parseInt(leitor.nextLine().trim());
                                  
                                  for (int i = 0; i < e.size(); i++) {
                                      if(e.get(i).getMatricula() == e_mat){
                                          e.remove(i);
                                          
                                          System.out.println(" ");
                                          System.out.println("Aluno deletado!");
                                          break;
                                      }
                                  }
                                                                  
                                  
                               
                               // pesquisar
                           }else if(escolha == 3){
                               System.out.println("Digite a matricula do aluno que voce deseja pesquisar");
                               int mat = Integer.parseInt(leitor.nextLine().trim());
                               
                               for (int i = 0; i < e.size(); i++) {
                                   if (e.get(i).getMatricula() == mat){
                                       System.out.println("Aluno: "+ e.get(i).getNome()+"\n"+
                                                            "Matricula: "+ e.get(i).getMatricula());
                                       break;
                                   }
                               }
                               
                               //listagem
                           }else if(escolha == 4){
                               for (int i = 0; i < e.size(); i++) {
                                       System.out.println("Aluno: "+ e.get(i).getNome()+" "+
                                                            "Matricula: "+ e.get(i).getMatricula());
                                   
                               }
                           }

                           System.out.println(" ");
                           System.out.println("Digite qualquer tecla para voltar ao menu");
                           
                           System.in.read(); // espera uma tecla a ser digitada
                           break;

                         case "P":
                           escolha = segundoMenuEscolha();
                           
                           //criar
                           if(escolha ==1){
                               System.out.println("Digite o nome do Professor");
                               String nom_p = leitor.nextLine().trim();
                               System.out.println("Digite o número de cadastro do Professor");
                               int nr_p = Integer.parseInt(leitor.nextLine().trim());
                               System.out.println("Digite o e-mail do Professor");
                               String e_p = leitor.nextLine().trim();
                               
                               p.add(new Professor(nom_p,nr_p,e_p));
                               
                               System.out.println(" ");
                               System.out.println("Professor cadastrado!");
                               
                            //exclusao   
                           }else if(escolha == 2){
                               for (int i = 0; i < p.size(); i++) {
                                   System.out.println("Número: "+p.get(i).getNumero()+" Professor: "+p.get(i).getNome());
                               }
                            System.out.println(" ");   
                            System.out.println("Digite o número de cadastro Professor");
                            int nr_p = Integer.parseInt(leitor.nextLine().trim());
                            
                               for (int i = 0; i < p.size(); i++) {
                                   if( p.get(i).getNumero() == nr_p){
                                       p.remove(i);
                                       
                                       System.out.println(" ");
                                       System.out.println("Professor deletado!");
                                       break;
                                   }
                               }
                               //pesquisar
                           }else if(escolha == 3){
                              System.out.println("Digite o número do Professor que voce deseja pesquisar");
                               int nr_p = Integer.parseInt(leitor.nextLine().trim());
                               
                               for (int i = 0; i < p.size(); i++) {
                                   if (p.get(i).getNumero() == nr_p){
                                       System.out.println("Nome: "+ p.get(i).getNome()+"\n"+
                                                            "Número: "+ p.get(i).getNumero()+"\n "+
                                                            "E-mail: "+p.get(i).getEmail());
                                       break;
                                   }
                               } 
                               //listagem
                           }else if(escolha == 4){
                               System.out.println(" ");
                               System.out.println("Listagem de Professor");
                               for (int i = 0; i < p.size(); i++) {
                                   System.out.println(p.get(i).getNome()+ " Número: "+ p.get(i).getNumero()+" E-mail: "+p.get(i).getEmail());
                               } 
                           }
                           
                           System.out.println(" ");
                           System.out.println("Digite qualquer tecla para voltar ao menu");
                           
                           System.in.read(); // espera uma tecla a ser digitada
                           break;
                         
               }
        }while(!pescolha.equals("S"));
           
 }
    
}
