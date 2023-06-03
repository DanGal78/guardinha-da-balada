package modelos;

import exceptions.ForbidenAccessException;

public class Guarda extends Pessoa{

    public Guarda(String nome){
        super(nome);
    }

    public  boolean podeEntrar(Usuario usuario) throws ForbidenAccessException {
        if(usuario.getIdade() < 18){
           throw new ForbidenAccessException();
        }
        return false;
    }
}
