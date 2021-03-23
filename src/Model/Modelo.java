package Model;

abstract public class Modelo {
    protected int id;
    protected String nome;
    protected String login;
    protected String senha;
    protected String setor;
    protected String nivelAcesso;

    public Modelo(int id, String nome, String login, String senha, String setor, String nivelAcesso) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.setor = setor;
        this.nivelAcesso = nivelAcesso;
    }

    public Modelo(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Modelo(int id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
    }

    public Modelo(int id, String nome, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    
}
