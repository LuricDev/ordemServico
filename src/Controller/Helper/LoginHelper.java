package Controller.Helper;

import Model.Usuario;
import View.Login;

public class LoginHelper {
    
    private final Login view;
    
    public LoginHelper(Login view){
        this.view = view;
    }
    
    public Usuario obterModelo(){
        //Pegar os dados digitados pelo usuário 
        String login = view.getTxtLogin().getText();
        String senha = String.valueOf(view.getTxtSenha().getPassword());
        Usuario modelo = new Usuario(0, login, senha);
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String login = modelo.getLogin();
        String senha = modelo.getSenha();
        
        view.getTxtLogin().setText(login);
        view.getTxtSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getTxtLogin().setText("");
        view.getTxtSenha().setText("");
    }
    
}
