
public class Multiplication implements Commande{
  MoteurRPN moteur;
  
  /**
   *
   */
  public Multiplication(MoteurRPN m) {
    moteur = m;
  }

  public void execute() throws ManqueOperandeException, DivByZeroException {
    moteur.multiplication();
  }
}
