
/**
 * 
 * @author chergou
 * Classe Addition
 *
 */
public class Addition implements Commande{

    MoteurRPN moteur;
    
    /**
     * @param m : le moteur
     */
    public Addition(MoteurRPN m) {
      moteur = m;
    }

    public void execute() throws ManqueOperandeException {
      moteur.addition();
    }


}
