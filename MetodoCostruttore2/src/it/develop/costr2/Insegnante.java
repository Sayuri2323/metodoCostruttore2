package it.develop.costr2;

public class Insegnante {
    public String teacherName;


 public Insegnante(){
     this.teacherName="Severus Piton";
     System.out.println(("Creato un insegnante: "+ teacherName));

 }
public void assignGrade(String alumn, int finalGrade) {

    System.out.println(("lo studente: "+alumn+" ha preso: "+finalGrade));

}

}
