
/**
 * 
 * @author chergou
 * class Soustraction
 *
 */
public class Soustraction implements Commande{

  MoteurRPN moteur;
  
  /**
   * 
   */
  public Soustraction(MoteurRPN m) {
    moteur = m;
  }

  public void execute() throws ManqueOperandeException {
    moteur.soustraction();
  }

}