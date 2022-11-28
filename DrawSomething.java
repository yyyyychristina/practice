// Chingwing Yeung
// Assignment10 DrawSomething
//11/23/2022

package drawShapesPKG;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.control.*;

import javafx.scene.shape.Ellipse;

public class DrawSomething extends Application {
	
	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
	    // Create a pane
	    Pane pane = new Pane();
	    pane.setStyle(
	    	      "-fx-border-color: green; -fx-background-color: lightgreen;");
		
	    //create text 
	    Text text1 = new Text(80, 700, "Chingwing Yeung's Thanksgiving Dinner Party!");
	    text1.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 48));
	    text1.setFill(Color.SALMON);
	    pane.getChildren().add(text1);
	    
	    
	  // Create a rectangle called dinnertable and set its property
	    Rectangle dinnertable = new Rectangle();
	    dinnertable.setX(250);
	    dinnertable.setY(60);
	    dinnertable.setWidth(1000);
	    dinnertable.setHeight(550);
	    dinnertable.setArcWidth(10);
	    dinnertable.setArcHeight(20);
	    dinnertable.setFill(Color.MINTCREAM);
	    dinnertable.setStroke(Color.INDIGO);
	    pane.getChildren().add(dinnertable);
	    
	    
	    
	 // Create a circle called turkeyhead and set its property
	    Circle turkeyhead = new Circle();
	    turkeyhead.setCenterX(450);
	    turkeyhead.setCenterY(100);
	    turkeyhead.setRadius(50);
	    turkeyhead.setStroke(Color.PERU);
	    turkeyhead.setStrokeWidth(3.0);
	    turkeyhead.setFill(Color.SIENNA);	       
	    pane.getChildren().add(turkeyhead);
	    
	    
	  //Create four turkey feather with random color using for loop and rotate them
	    for (int i = 0; i < 4; i++) {
	        // Create an ellipse and add it to pane
	        Ellipse turkeyfeather = new Ellipse(650, 150, 
	          30, 150);
	        turkeyfeather.setStroke(Color.color(Math.random(), Math.random(),
	          Math.random()));
	        turkeyfeather.setFill(Color.LEMONCHIFFON);
	        turkeyfeather.setRotate(i * 90 / 8);
	        pane.getChildren().add(turkeyfeather);
	    }
	    
	  //Create an ellipse called turkeybody
	    Ellipse turkeybody = new Ellipse(550, 200, 150, 100);
	    turkeybody.setFill(Color.SADDLEBROWN);
	    turkeybody.setStroke(Color.DARKSALMON);
	    pane.getChildren().add(turkeybody);
	    turkeyhead.setStrokeWidth(3.0);
	    
	  //Create an ellipse called turkeyleg
	    Ellipse turkeyleg = new Ellipse(650, 275, 75, 45);
	    turkeyleg.setFill(Color.CHOCOLATE);
	    turkeyleg.setRotate(10);
	    pane.getChildren().add(turkeyleg);
	    
	  //Create turkey eye using two lines
	    /**line1*/
	    Line eyeline1 = new Line(420, 80, 440, 100);  //compare with eyeline2
	    eyeline1.setStrokeWidth(5);
	    eyeline1.setStroke(Color.BLACK);
	    pane.getChildren().add(eyeline1);
	    
	    /**line2*/
	    Line eyeline2 = new Line(440, 80, 420, 100);  //same start and end y; reverse start and end x
	    eyeline2.setStrokeWidth(5);
	    eyeline2.setStroke(Color.BLACK);
	    pane.getChildren().add(eyeline2);
	    
	  //Create a text to tell what the dishes are: turkey
	    Text text2 = new Text(450, 400, "Dish1\nTurkey With Feather And Head");
	    text2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 
	    	      FontPosture.ITALIC, 32));
	    text2.setFill(Color.ORANGE);
	    pane.getChildren().add(text2); 
	    
	  //Create an arc called pie
	    Arc pie = new Arc(1100, 400, 100, 100, 30, 35); // Create an arc
	    pie.setFill(Color.BEIGE); // Set fill color
	    pie.setStroke(Color.TAN);
	    pie.setStrokeWidth(6);
	    pie.setType(ArcType.ROUND); // Set arc type
	    pane.getChildren().add(pie);
	    
	  //Create another arc called pie2
	    Arc pie2 = new Arc(1000, 450, 100, 100, 50, 275); // Create an arc
	    pie2.setFill(Color.LIGHTGOLDENRODYELLOW); // Set fill color
	    pie2.setStroke(Color.TAN);
	    pie2.setStrokeWidth(6);
	    pie2.setType(ArcType.ROUND); // Set arc type
	    pane.getChildren().add(pie2);
	    
	  //Create a text to tell what the dishes are: pecan pie
	    Text text3 = new Text(1000, 200, "Dish2\nPecan Pie");
	    text3.setFill(Color.PEACHPUFF);
	    text3.setFont(Font.font("Arial", FontWeight.NORMAL, 
	    	      FontPosture.REGULAR, 25));
	    text3.setStrikethrough(true);
	    pane.getChildren().add(text3);
	    
	  //Create a text to tell the pecan pie is pumpkin pie
	    Text text4 = new Text(1000, 300, "Dish2\nPumpkin Pie");
	    text4.setFill(Color.TOMATO);
	    text4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 
	    	      FontPosture.ITALIC, 34));
	    text4.setUnderline(true);
	    pane.getChildren().add(text4);
	    
	    
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane, 1000, 500);
	    primaryStage.setTitle("Draw Something"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }
	  
	  void DrawMyStuff(Pane myPane, Shape myShape)
	  {
		  myPane.getChildren().add(myShape);
	  }
	  
	  
	  
	  /**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	  public static void main(String[] args) {
	    launch(args);
	  }

		  

}
