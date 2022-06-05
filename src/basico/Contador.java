package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
				
		Label labelTitulo = new Label("Contador");
		Label labelNumero = new Label("0");
		
		Button botaoDecremento = new Button("-");
		Button botaoIncremento = new Button("+");
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		VBox boxPrincial = new VBox();
		boxPrincial.setAlignment(Pos.CENTER);
		boxPrincial.setSpacing(10);
		
		boxPrincial.getChildren().add(labelTitulo);
		boxPrincial.getChildren().add(labelNumero);
		boxPrincial.getChildren().add(boxBotoes);
		
		Scene cenaPrinciapal = new Scene(boxPrincial, 400, 400);
		
		primaryStage.setScene(cenaPrinciapal);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}

}
