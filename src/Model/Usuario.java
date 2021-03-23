package Model;

public class Usuario extends Modelo{
    private int telefone;
    private int cpf;

    public Usuario(int telefone, int cpf, int id, String nome, String login, String senha, String setor, String nivelAcesso) {
        super(id, nome, login, senha, setor, nivelAcesso);
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public Usuario(int id, String nome, int cpf, int telefone) {
        super(id, nome);
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Usuario(int id, String login, String senha) {
        super(id, login, senha);
    }

    public Usuario(int id, String nome, String login, String senha, int cpf, int telefone) {
        super(id, nome, login, senha);
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
}
