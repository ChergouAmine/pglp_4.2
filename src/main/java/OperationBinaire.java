
public class OperationBinaire {
  private final Calcul calcul;
  
  public OperationBinaire(Calcul c) {
      calcul = c;
  }
  
  public void execute() throws ErreurException {
      throw new ErreurException();
  }
  
  public String execute(String s) throws ErreurException {
      throw new ErreurException();
  }

  public void operandes(char c) throws DivByZeroException, PileVideException, PilePleineException {
      calcul.appliquerOperation(c);  
  }
  
  public int getInt() throws ErreurException {
      throw new ErreurException();
  }
}
