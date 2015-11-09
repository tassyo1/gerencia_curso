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
                                  int indice = Integer.parseInt(leitor.next().trim());
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
                               
                               System.out.println("Digite o número da turma ");
                               int nr = Integer.parseInt(leitor.nextLine());
                               
                               for (int i = 0; i < p.size(); i++) {
                                   System.out.println(p.get(i).getNumero()+"<-- "+p.get(i).getNome());
                               }
                               System.out.println("");
                               System.out.println("Digite o número do Professor desejado");
                               int nr_prof = Integer.parseInt(leitor.nextLine());
                               
                               do{
                               System.out.println("Digite a matrícula do aluno que você deseja inserir nessa turma");
                               for(int i = 0; i < e.size(); i++){
                                   System.out.println(e.get(i).getMatricula()+"<- "+e.get(i).getNome());
                               }
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
                                            break;
                                        }
                                   }else{
                                       break;
                                   }
                               }                              
                               System.out.println("Deseja inserir outro aluno? S/N");
                               escolha_insert =leitor.nextLine().trim().toUpperCase(); 
                               }while(escolha_insert != "N");
                               
                               
                               System.out.println(" ");
                               System.out.println("Digite o número da respectiva disciplina");
                               for (int i = 0; i < d.size(); i++) {
                                   System.out.println(i+"<--"+d.get(i).getNome());
                               }
                               
                               System.out.println(" ");
                               int nr_disci = Integer.parseInt(leitor.nextLine());
                               
                               
                               t.add(new Turma(nr,p.get(nr_prof),eArray,d.get(nr_disci)));
                               System.out.println(" ");
                               System.out.println("Disciplina criada!");
                           }
                           
                           System.out.println(" ");
                           System.out.println("Digite qualquer tecla para voltar ao menu");
                           
                           System.in.read(); // espera uma tecla a ser digitada
                           
                           break;
                         case "A":
                           segundoMenuEscolha();
                           
                           System.out.println(" ");
                           System.out.println("Digite qualquer tecla para voltar ao menu");
                           
                           System.in.read(); // espera uma tecla a ser digitada
                           break;

                         case "P":
                           segundoMenuEscolha();
                           
                           System.out.println(" ");
                           System.out.println("Digite qualquer tecla para voltar ao menu");
                           
                           System.in.read(); // espera uma tecla a ser digitada
                           break;
                         
               }
        }while(!pescolha.equals("S"));
           
 }
    
}
