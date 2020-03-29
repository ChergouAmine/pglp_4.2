
public class ErreurException extends Exception{
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public ErreurException() {
    super("Cette action n'est pas supportée ou bien cette opération est invalide");
  }
}
