package modelos;

import enums.Genero;

public class Usuario  extends  Pessoa{

    private int anoNascimento;

    public Usuario(String nome, Genero genero, int anoNascimento){
        super(nome, 2023 - anoNascimento, genero);

        this.anoNascimento = anoNascimento;
    }

    public String getGeneroString() {
        if (this.getGenero() == Genero.MASCULINO) {
            return "Homem ";
        }
            if (this.getGenero() == Genero.FEMININO) {
                return "Mulhuer ";
            }
            return "Nao Informado ";
        }

        public String getPronome(){
            if (this.getGenero() == Genero.MASCULINO) {
                return "Um ";
            }
            return "Uma ";
        }
    }

