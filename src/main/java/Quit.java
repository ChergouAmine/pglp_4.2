
public class Quit implements Interpreteur{
  private final Calcul calcul;

  public Quit(Calcul c) {
      calcul = c;
  }

  public void execute() {
      calcul.arreter();
  }
 
  public String execute(String s)throws ErreurException {
      throw new ErreurException();
  }
   
  public void operation(char c) throws ErreurException {
    throw new ErreurException();
  }
  
  public void operandes(double d) throws ErreurException {
      throw new ErreurException();
  }
  
  public int getInt() throws ErreurException {
      throw new ErreurException();
  }
}
