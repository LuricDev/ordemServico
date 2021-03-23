package Model;

public class Tecnico extends Modelo {

    public Tecnico(int id, String nome, String login, String senha, String setor, String nivelAcesso) {
        super(id, nome, login, senha, setor, nivelAcesso);
    }

    public Tecnico(int id, String nome) {
        super(id, nome);
    }

    public Tecnico(int id, String nome, String login, String senha) {
        super(id, nome, login, senha);
    }

}
