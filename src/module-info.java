module exercicios.javafx {
	
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires org.controlsfx.controls;
	
	opens basico;
	opens troca;
	opens layout;
	opens fxml;
}