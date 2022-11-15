package it.develop.costr2;

public class Start {
    public static void main(String[] args) {

        Studente s1=new Studente("Harry Potter");
        s1.grado=6;
        s1.getStudentDetails();

        Studente s2=new Studente("Hermione Granger");
        s2.grado=10;
        s2.getStudentDetails();


        Insegnante i1= new Insegnante();

        i1.assignGrade(s1.nome,  5);
        i1.assignGrade(s2.nome, 9);
    }

}
