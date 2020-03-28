
public class AfficherOperande implements Interpreteur{
  private final Calcul calcul;
  
  public AfficherOperande(Calcul c) {
      calcul = c;
  }

  public void execute() throws PileVideException {
      calcul.afficherOperande();
      
  }
  
  public String execute(String s)throws ErreurException {
      throw new ErreurException();
  } 
  
  public void operandes(double d) throws ErreurException {
      throw new ErreurException();
  }
  
  public int getInt()throws ErreurException {
      throw new ErreurException();
  }
  
}
