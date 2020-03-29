
public class CalculatriceRPN {

  public static void main(String[] args) throws PileVideException,DivByZeroException, SaisieVideException, ErreurSaisieException, 
  PilePleineException,  ErreurException {
      
      SaisieRPN saisie = new SaisieRPN();
      
      saisie.Saisie();
      saisie.empiler();
      saisie.Calculer();
  }
  
}
