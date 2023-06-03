public class ConsultaRetorno {

    private  boolean encontrado;

    private int index;

    ConsultaRetorno(boolean encontrado, int index){
        this.encontrado = encontrado;
        this.index = index;
    }
    public  boolean isEncontrado(){
        return encontrado;
    }
    public  int getIndex(){
        return index;
    }
}
