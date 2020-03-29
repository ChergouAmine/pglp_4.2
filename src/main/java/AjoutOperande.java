
public class AjoutOperande implements Interpreteur{
  
  private final Calcul calcul;
  
  public  AjoutOperande(Calcul c) {
      calcul = c;
  }
  
  public void operation(char c) throws ErreurException {
    throw new ErreurException();
  }

  public void operandes(double d) throws PilePleineException {
      calcul.ajoutOperande(d);      
  }

  public void execute() throws ErreurException {
      throw new ErreurException();
  }

  public String execute(String s) throws ErreurException {
      throw new ErreurException();
  }

  public int getInt() throws ErreurException {
      throw new ErreurException();
  }
}
