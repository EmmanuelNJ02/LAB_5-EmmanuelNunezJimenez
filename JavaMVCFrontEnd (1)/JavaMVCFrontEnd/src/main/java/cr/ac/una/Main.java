package cr.ac.una;

import Presentation.Controllers.LoginController;
import Presentation.Views.LoginView;
import Services.AuthService;

public class Main {
    public static void main(String[] args){

        LoginView loginView = new LoginView();
        AuthService authService = new AuthService("localhost", 7070);
        LoginController loginController = new LoginController(loginView, authService);
        loginController.addObserver(loginView);

        loginView.setVisible(true);
    }
}

// Emmanuel Núñez Jiménez.