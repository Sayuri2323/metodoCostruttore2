package it.develop.costr2;
 //definire una classe chiamata 'Studente' che abbia:
  //              * una variabile di istanza stringa 'name'
  //              * una variabile di istanza int 'grade'
       //         * un metodo costruttore che
     //           * informa l'utente sulla creazione dell'oggetto
         //       * prende un parametro 'studentName' e lo assegna alla variabile di istanza dell'oggetto
   //             * un metodo 'getStudentDetails()' che stampa un 'nome' e un 'voto' dello studente


public class Studente {
    public String nome;
    public int grado;


    public Studente(String studentName){
       this.nome=studentName;
        System.out.println("Creato studente");

    }
    public void getStudentDetails(){
        System.out.println("nome: "+nome+ " ha la media del: "+grado);

    }

       }

