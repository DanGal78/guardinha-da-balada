package exceptions;

public class ForbidenAccessException  extends  Exception{

    private int codeError = 203;

    public ForbidenAccessException(){
        super("Voce nao esta autorizado a passar sequer na porta");
    }

    public  int getCodeError(){
        return codeError;
    }
}
