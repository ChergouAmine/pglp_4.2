
public class ErreurSaisieException extends Exception {
    /**
   * 
   */
  private static final long serialVersionUID = 1L;

    public ErreurSaisieException() {
        super("VOus ne pouvez saisir que des opérandes entre [0-9] et les opérations [+,-,*,/]");
    }
}