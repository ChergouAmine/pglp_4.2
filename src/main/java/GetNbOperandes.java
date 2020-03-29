
public class GetNbOperandes implements Interpreteur{
  private final Calcul calcul; 
  
  public GetNbOperandes(Calcul c) {
    calcul = c;
  }

  public void execute() throws ErreurException {
      throw new ErreurException();
  }
  
  public String execute(String s) throws ErreurException {
      throw new ErreurException();
  }
  
  public void operation(char c) throws ErreurException {
    throw new ErreurException();
  }
  
  public void operandes(double d) throws ErreurException {
      throw new ErreurException();
  }
  
  public int getInt() throws PileVideException {
      return calcul.getNbOperande();
  }
}
