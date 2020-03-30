
public class Division implements Commande{

  MoteurRPN moteur;
  
  /**
   * @param m: le moteur
   * 
   */
  public Division(MoteurRPN m) {
    moteur = m;
  }

  public void execute() throws ManqueOperandeException, DivByZeroException {
    moteur.division();
  }
  
}
