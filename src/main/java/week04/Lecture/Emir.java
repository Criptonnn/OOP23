package week04.Lecture;

public class Emir extends Person {

   private int weight;

   public Emir(int age, int weight) {
       super("Emir", age); // u ovaj super ubacimo argumente sto bi stavili kad bi pozvali Person constructor
       this.weight = weight;
   }

}
