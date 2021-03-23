package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;

public class LoginController {

    private final Login view;
    private LoginHelper helper; //Serve como auxiliar do Controller
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view); //Auxilia para pegar os dados da view Login
    }
    
    public void logar(){
        //Pega o usuário que foi digitado na view Login
        Usuario usuario = helper.obterModelo(); 
    }
    
    
}
