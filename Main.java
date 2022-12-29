package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Create a border pane 
	    Pane pane = new Pane();
		pane.setStyle(
	    	      "-fx-border-color: green; -fx-background-color: lightblue;");
		 
		//Create a circle called fan body and set its properties
		Circle fanbody = new Circle();
		fanbody.centerXProperty().bind(pane.widthProperty().divide(2));
		fanbody.centerYProperty().bind(pane.heightProperty().divide(2.75));
		/**bind pane's width and height, fanbody's height is higher, so smaller no.*/
		fanbody.setRadius(240);
		fanbody.setStroke(Color.BLACK);
		fanbody.setStrokeWidth(4.0);
		fanbody.setFill(Color.WHITE);
		pane.getChildren().add(fanbody);
		
		
		
		//Create four polygons(having three sides) with random color(Fill) using for loop and rotate them
		for (int i = 0; i < 8; i++) {
			
			/**first loop*/
			//Create a polygon with points
			Polygon blade = new Polygon(450, 240, 290, 160, 370, 150);
		
			blade.setFill(Color.color(Math.random(), Math.random(), Math.random()));
			blade.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			
			//Using a Rotate class to set e.g.(new Rotate(angle, pivotX, pivotY)
			blade.getTransforms().add(new Rotate(i * 45, 500, 274));
			
			//Add polygon to the pane
			pane.getChildren().add(blade);
		
			//Add listeners when fanbody's centerX and centerY change 
			/**centerX change -> blade's first point(0)(x- coordinate) change regarding pane's width
			 * centerY change -> blade's second point(1)(y- coordinate) change regarding pane's height
			 * pane's width and pane's height similar to fanbody's */
			fanbody.centerXProperty().addListener(ov -> {blade.getPoints().set(0, pane.getWidth() / 2);});
			fanbody.centerYProperty().addListener(ov -> {blade.getPoints().set(1, pane.getHeight() / 2.75);});
			
		
			/**first loop*/
		}

		
		//Create a circle called fancenter in the middle of the fan body and set its properties
		Circle fancenter = new Circle();
		fancenter.centerXProperty().bind(pane.widthProperty().divide(2));
		fancenter.centerYProperty().bind(pane.heightProperty().divide(2.75));
		/**fancenter has the same radius as fanbody which bind pane's width and height*/
		fancenter.setRadius(fanbody.getRadius() / 4);
		fancenter.setStroke(Color.PALEGOLDENROD);
		fancenter.setStrokeWidth(2.5);
		fancenter.setFill(Color.NAVY);
		pane.getChildren().add(fancenter);
		
		//Create a rectangle to hold the fan body
		
		//Create an arc for holding buttons
		
		//Three buttons in the arc
		
		//Create a text and add it to the pane
		Text text1 = new Text(600, 600, "Product with Quality");
		text1.setFont((Font.font("Times New Roman", FontPosture.ITALIC, 48)));
		pane.getChildren().add(text1);
		
		// Create a scene and place it in the stage
	    Scene scene = new Scene(pane, 1000, 740);
	    primaryStage.setTitle("Draw Fan"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
