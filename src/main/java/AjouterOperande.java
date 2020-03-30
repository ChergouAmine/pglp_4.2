
public class AjouterOperande implements Commande{

  MoteurRPN moteur;
  Double operande;


  public AjouterOperande(MoteurRPN m, Double o) {
    moteur = m;
    operande=o;
  }

  public void execute() throws ManqueOperandeException, DivByZeroException {
    moteur.empiler(operande);
  }
}
