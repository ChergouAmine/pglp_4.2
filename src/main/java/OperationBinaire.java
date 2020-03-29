
public class OperationBinaire implements Interpreteur {
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

  public void operandes(char c) throws ErreurException {
    throw new ErreurException(); 
  }
  
  public int getInt() throws ErreurException {
      throw new ErreurException();
  }

  public void operation(char c)
      throws DivByZeroException, PileVideException, ErreurException, PilePleineException {
    calcul.appliquerOperation(c);  
    
  }

  public void operandes(double d)
      throws PilePleineException, DivByZeroException, PileVideException, ErreurException {
    // TODO Auto-generated method stub
    
  }
}
