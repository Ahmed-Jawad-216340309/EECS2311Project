package venn;

import javafx.application.Application;
import javafx.beans.binding.DoubleBinding;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class VennBase extends Application	 {
	
	@Override 
	public void start(Stage primaryStage) {
		
		//sets window
		Stage stage = new Stage();
		
		//Custom colors
		Color blue = new Color(Color.BLUE.getRed(), Color.BLUE.getGreen(), Color.BLUE.getBlue(), 0.75);		
		Color red = new Color(Color.RED.getRed(), Color.RED.getGreen(), Color.RED.getBlue(), 0.75);
		
		//First venn circle
		Pane pane = new Pane();
		Circle circle = new Circle();
		circle.centerYProperty().bind(pane.heightProperty().divide(2.0));	
		circle.centerXProperty().bind(pane.widthProperty().divide(5.0/3.0));
		circle.radiusProperty().bind(pane.widthProperty().divide(5.0));
		circle.setStroke(Color.BLUE);
		circle.setFill(red);
		
		//Second venn circle
		Circle circle2 = new Circle();
		circle2.centerYProperty().bind(pane.heightProperty().divide(2.0));												
		circle2.centerXProperty().bind(pane.widthProperty().divide(5.0/2.0));
		circle2.radiusProperty().bind(pane.widthProperty().divide(5.0));
		circle2.setStroke(Color.RED);
		circle2.setFill(blue);
		
		//Text box within first circle
		Button box1 = new Button("Insert text here");
		box1.layoutXProperty().bind(pane.widthProperty().divide(5.0/2.0));
		box1.layoutYProperty().bind(pane.heightProperty().divide(2.0));
		box1.prefWidthProperty().bind(pane.widthProperty().divide(10.0));
		box1.prefHeightProperty().bind(pane.heightProperty().divide(10.0));
		
		//Adds items to the window
		pane.getChildren().add(circle);
		pane.getChildren().add(circle2);
		pane.getChildren().add(box1);
		
		Scene scene2 = new Scene(pane, 600, 500);
		stage.setTitle("Venn Application Demo");
		stage.setScene(scene2);
		stage.show();
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}