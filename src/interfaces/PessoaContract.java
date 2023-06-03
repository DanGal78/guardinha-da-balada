package interfaces;

import enums.Genero;

public interface PessoaContract {

    String getNome();

    void setNome(String nome);

    int getIdade();

    void setIdade(int idade);

    void  setGenero(Genero genero);

    Genero getGenero();
}
