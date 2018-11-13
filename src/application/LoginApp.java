package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		AnchorPane pane = new AnchorPane(); // cria o painel onde estará os componentes
		pane.setPrefSize(400, 300); // tamanho do painel

		// cria os campos
		TextField txLogin = new TextField();
		txLogin.setPromptText("USUÁRIO");
		PasswordField txSenha = new PasswordField();
		txSenha.setPromptText("SENHA");
		Button btEntrar = new Button("Entrar");
		Button btSair = new Button("Sair");

		// adiciona os campos no painel
		pane.getChildren().addAll(txLogin, txSenha, btEntrar, btSair);
		pane.setStyle("-fx-background-color:	" + "linear-gradient("
				+ "from	0%	0%	to	100%	100%,	blue	0%,	silver	100%);");

		Scene scene = new Scene(pane); // cria a cena, passando o painel
		stage.setScene(scene); // indica ql cena será usado no stage
		stage.show(); // exibe o stage

		txLogin.setLayoutX((pane.getWidth() - txLogin.getWidth()) / 2);
		txLogin.setLayoutY(50);
		txSenha.setLayoutX((pane.getWidth() - txSenha.getWidth()) / 2);
		txSenha.setLayoutY(100);
		btEntrar.setLayoutX((pane.getWidth() - btEntrar.getWidth()) / 2);
		btEntrar.setLayoutY(150);
		btSair.setLayoutX((pane.getWidth() - btSair.getWidth()) / 2);
		btSair.setLayoutY(200);

	}

	public static void main(String[] args) {
		launch(args);
	}

}