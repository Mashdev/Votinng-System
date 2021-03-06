import static javafx.scene.text.TextAlignment.CENTER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class voting_system extends Application
{
	
	
public void start(Stage stage) throws Exception
{
	

//************************ Home Page Coding ************************
 
ImageView imageViewh = new ImageView(new Image("file:Images/Home.png"));
 imageViewh.setFitHeight(665); 
 imageViewh.setFitWidth(1000); 
 imageViewh.setX(0);
 imageViewh.setY(0);
 imageViewh.setOpacity(1);
 imageViewh.setPreserveRatio(true);
 
 Rectangle r1 = new Rectangle();
 r1.setX(202);
 r1.setY(160); 
 r1.setWidth(600); 
 r1.setHeight(350);
 r1.setArcWidth(50);
 r1.setArcHeight(50);
 r1.setFill(Color.DARKBLUE);
 r1.setOpacity(0.6);
 
 Text t=new Text("WELCOME TO IQRA UNIVERSITY");
 t.setLayoutX(235);
 t.setLayoutY(220);
 t.setTextAlignment(CENTER);
 t.setFill(Color.WHITE);
 t.setFont(Font.font("Archive", FontWeight.BOLD,35));
 
 Text t1=new Text("Online Voting System");
 t1.setLayoutX(355);
 t1.setLayoutY(260);
 t1.setTextAlignment(CENTER);
 t1.setFill(Color.WHITE);
 t1.setFont(Font.font("Archive", FontWeight.THIN, FontPosture.ITALIC,30));
 Button b=new Button("Faculty");
 b.setFont(Font.font("Archive", FontWeight.BOLD,22));
 b.setLayoutX(450);
 b.setLayoutY(320);
 b.setPrefSize(110,50);
 b.getStylesheets().add("file:css/style.css");
 
 Button b1=new Button("Students");
 b1.setFont(Font.font("Archive", FontWeight.BOLD,19.7));

 b1.setLayoutX(450);
 b1.setLayoutY(400);
 b1.setPrefSize(110,50);
 b1.getStylesheets().add("file:css/style.css");
 
 
 Group root1 = new Group(imageViewh,r1,t,t1,b,b1);
 Scene scene1 = new Scene(root1, 1000, 665);
 
 
 //************************* Faculty Login Page Coding *************************
 
 Rectangle r2 = new Rectangle();

 r2.setWidth(500);
 r2.setHeight(665);
 r2.setFill(Color.DARKBLUE);
r2.setOpacity(0.8);
 
ImageView imageViewl = new ImageView(new Image("file:Images/iqra.jpg"));
 imageViewl.setFitHeight(300); 
 imageViewl.setFitWidth(300); 
 imageViewl.setX(600);
 imageViewl.setY(50);
 imageViewl.setOpacity(1);
 imageViewl.setPreserveRatio(true);
 Text txt=new Text("ONLINE VOTING\nSYSTEM");
 txt.setLayoutX(65);
 txt.setLayoutY(90);
 txt.setTextAlignment(CENTER);
 txt.setFont(Font.font("Verdana", FontWeight.BOLD,40));
 txt.setFill(Color.WHITE);
 Text txt1=new Text("Become a part\n of the Iqra University\n Voting Community,\n and select your\n Student Council\n Leaders");
 txt1.setLayoutX(60);
 txt1.setLayoutY(250);
 txt1.setTextAlignment(CENTER);
 txt1.setFont(Font.font("Archive", FontWeight.THIN, FontPosture.ITALIC,40));
 txt1.setLineSpacing(2);
 txt1.setFill(Color.WHITE);
 TextField useraNmeField13 = new TextField();
 useraNmeField13.setLayoutX(645);
 useraNmeField13.setLayoutY(220);
 useraNmeField13.setPrefSize(215, 50);
 useraNmeField13.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
 useraNmeField13.setPromptText("User Name");
 useraNmeField13.getStylesheets().add("file:css/style.css");
 PasswordField userPasswordField2 = new PasswordField();
 userPasswordField2.setLayoutX(645);
 userPasswordField2.setLayoutY(310);
 userPasswordField2.setPrefSize(215, 50);
 userPasswordField2.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
 userPasswordField2.setPromptText("Password");
 userPasswordField2.getStylesheets().add("file:css/style.css");
 Button btn2 = new Button("Login");
 btn2.setLayoutX(680);
 btn2.setLayoutY(450);
 btn2.setPrefSize(100,40);
 btn2.setFont(Font.font("Archive", FontWeight.BOLD,20));
 btn2.setOpacity(0.9);
 btn2.getStylesheets().add("file:css/style.css");
 Button goback = new Button("Go Back");
 goback.setTranslateX(6);
 goback.setTranslateY(6);
 goback.setPrefSize(80, 20);
 goback.setFont(Font.font("Archive", FontWeight.BOLD,15));
 goback.setOpacity(0.9);
 goback.getStylesheets().add("file:css/style.css");
 
 Button btn22 = new Button("Signup");
 btn22.setLayoutX(800);
 btn22.setLayoutY(450);
 btn22.setPrefSize(100,40);
 btn22.setFont(Font.font("Archive", FontWeight.BOLD,20));
 btn22.setOpacity(0.9);
 btn22.getStylesheets().add("file:css/style.css");

 
 
 Group root2 = new Group(r2, imageViewl, 
txt,txt1,btn2,useraNmeField13,userPasswordField2,goback,btn22);
 Scene scene2 = new Scene(root2, 1000, 665);
 
 
 //************************* Faculty Signup Page Coding *************************
 
 Rectangle r22 = new Rectangle();

 r22.setWidth(500);
 r22.setHeight(665);
 r22.setFill(Color.DARKBLUE);
r22.setOpacity(0.8);
 
ImageView imageViewl2 = new ImageView(new Image("file:Images/iqra.jpg"));
 imageViewl2.setFitHeight(300); 
 imageViewl2.setFitWidth(300); 
 imageViewl2.setX(600);
 imageViewl2.setY(50);
 imageViewl2.setOpacity(1);
 imageViewl2.setPreserveRatio(true);
 Text txt22=new Text("ONLINE VOTING\nSYSTEM");
 txt22.setLayoutX(65);
 txt22.setLayoutY(90);
 txt22.setTextAlignment(CENTER);
 txt22.setFont(Font.font("Verdana", FontWeight.BOLD,40));
 txt22.setFill(Color.WHITE);
 Text txt12=new Text("Become a part\n of the Iqra University\n Voting Community,\n and select your\n Student Council\n Leaders");
 txt12.setLayoutX(60);
 txt12.setLayoutY(250);
 txt12.setTextAlignment(CENTER);
 txt12.setFont(Font.font("Archive", FontWeight.THIN, FontPosture.ITALIC,40));
 txt12.setLineSpacing(2);
 txt12.setFill(Color.WHITE);
 TextField userNameField22 = new TextField();
 userNameField22.setLayoutX(645);
 userNameField22.setLayoutY(220);
 userNameField22.setPrefSize(215, 50);
 userNameField22.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
 userNameField22.setPromptText(" user Name");
 userNameField22.getStylesheets().add("file:css/style.css");
 TextField userEmailField = new TextField();
 userEmailField.setLayoutX(645);
 userEmailField.setLayoutY(310);
 userEmailField.setPrefSize(215, 50);
 userEmailField.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
 userEmailField.setPromptText(" User Email");
 userEmailField.getStylesheets().add("file:css/style.css");
 TextField mnumber = new TextField();
 mnumber.setLayoutX(645);
 mnumber.setLayoutY(400);
 mnumber.setPrefSize(215, 50);
 mnumber.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
 mnumber.setPromptText(" Mobile Number");
 mnumber.getStylesheets().add("file:css/style.css");
 PasswordField userPasswordField22 = new PasswordField();
 userPasswordField22.setLayoutX(645);
 userPasswordField22.setLayoutY(490);
 userPasswordField22.setPrefSize(215, 50);
 userPasswordField22.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
 userPasswordField22.setPromptText("Password");
 userPasswordField22.getStylesheets().add("file:css/style.css");
 Button btn20 = new Button("Login");
 btn20.setLayoutX(680);
 btn20.setLayoutY(580);
 btn20.setPrefSize(100,40);
 btn20.setFont(Font.font("Archive", FontWeight.BOLD,20));
 btn20.setOpacity(0.9);
 btn20.getStylesheets().add("file:css/style.css");
 Button goback2 = new Button("Go Back");
 goback2.setTranslateX(6);
 goback2.setTranslateY(6);
 goback2.setPrefSize(80, 20);
 goback2.setFont(Font.font("Archive", FontWeight.BOLD,15));
 goback2.setOpacity(0.9);
 goback2.getStylesheets().add("file:css/style.css");

 Button btn21 = new Button("Signup");
 btn21.setLayoutX(800);
 btn21.setLayoutY(580);
 btn21.setPrefSize(100,40);
 btn21.setFont(Font.font("Archive", FontWeight.BOLD,20));
 btn21.setOpacity(0.9);
 btn21.getStylesheets().add("file:css/style.css");
 
 
 
 Group root21 = new Group(r22, imageViewl2, 
txt22,txt12,btn20,userNameField22,userEmailField,userPasswordField22,mnumber,goback2,btn21);
 Scene scene22 = new Scene(root21, 1000, 665);
 
 

 
 
 
 //************************* Student Login Page Coding *************************
 
 Rectangle r3 = new Rectangle();
 r3.setWidth(500);
 r3.setHeight(665);
 r3.setFill(Color.DARKBLUE);
 r3.setOpacity(0.9);
 
 ImageView imageViewl1 = new ImageView(new Image("file:Images/iqra.jpg")); 
 imageViewl1.setFitHeight(300); 
 imageViewl1.setFitWidth(300); 
 imageViewl1.setX(600);
 imageViewl1.setY(50);
 imageViewl1.setOpacity(1);
 imageViewl1.setPreserveRatio(true); 
 Text txt3=new Text("ONLINE VOTING\nSYSTEM");
 txt3.setLayoutX(65);
 txt3.setLayoutY(90);
 txt3.setTextAlignment(CENTER);
 txt3.setFont(Font.font("Verdana", FontWeight.BOLD,40));
 txt3.setFill(Color.WHITE);
 Text txt4=new Text("Become a part\n of the Iqra University\n Voting Community,\n and select your\n Student Council\n Leaders");
 txt4.setLayoutX(60);
 txt4.setLayoutY(250);
 txt4.setTextAlignment(CENTER);
 txt4.setFont(Font.font("Archive", FontWeight.THIN, FontPosture.ITALIC,40));
 txt4.setLineSpacing(2);
 txt4.setFill(Color.WHITE);
 TextField userNameField3 = new TextField();
 userNameField3.setLayoutX(645);
 userNameField3.setLayoutY(220);
 userNameField3.setPrefSize(215, 50);
 userNameField3.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
 userNameField3.setPromptText("User Name");
 userNameField3.getStylesheets().add("file:css/style.css");
 PasswordField userPasswordField3 = new PasswordField();
 userPasswordField3.setLayoutX(645);
 userPasswordField3.setLayoutY(310);
 userPasswordField3.setPrefSize(215, 50);
 userPasswordField3.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
 userPasswordField3.setPromptText("Password");
 userPasswordField3.getStylesheets().add("file:css/style.css");
 Button btn3 = new Button("Login");
 btn3.setLayoutX(680);
 btn3.setLayoutY(450);
 btn3.setPrefSize(100,40);
 btn3.setFont(Font.font("Archive", FontWeight.BOLD,20));
 btn3.setOpacity(0.9);
 btn3.getStylesheets().add("file:css/style.css");
 
 Button goback1 = new Button("Go Back");
 goback1.setTranslateX(6);
 goback1.setTranslateY(6);
 goback1.setPrefSize(80, 20);
 goback1.setFont(Font.font("Archive", FontWeight.BOLD,15));
 goback1.setOpacity(0.9);
 goback1.getStylesheets().add("file:css/style.css");
 
 Button btn32 = new Button("Signup");
 btn32.setLayoutX(800);
 btn32.setLayoutY(450);
 btn32.setPrefSize(100,40);
 btn32.setFont(Font.font("Archive", FontWeight.BOLD,20));
 btn32.setOpacity(0.9);
 btn32.getStylesheets().add("file:css/style.css");

 
 Group root3 = new Group(r3, imageViewl1, 
txt3,txt4,btn3,userNameField3,userPasswordField3,goback1,btn32);
 Scene scene3 = new Scene(root3, 1000, 665);
 
//************************* Student Signup Page Coding *************************
 
Rectangle r23 = new Rectangle();

r23.setWidth(500);
r23.setHeight(665);
r23.setFill(Color.DARKBLUE);
r23.setOpacity(0.8);

ImageView imageViewl23 = new ImageView(new Image("file:Images/iqra.jpg"));
imageViewl23.setFitHeight(300); 
imageViewl23.setFitWidth(300); 
imageViewl23.setX(600);
imageViewl23.setY(50);
imageViewl23.setOpacity(1);
imageViewl23.setPreserveRatio(true);
Text txt23=new Text("ONLINE VOTING\nSYSTEM");
txt23.setLayoutX(65);
txt23.setLayoutY(90);
txt23.setTextAlignment(CENTER);
txt23.setFont(Font.font("Verdana", FontWeight.BOLD,40));
txt23.setFill(Color.WHITE);
Text txt123=new Text("Become a part\n of the Iqra University\n Voting Community,\n and select your\n Student Council\n Leaders");
txt123.setLayoutX(60);
txt123.setLayoutY(250);
txt123.setTextAlignment(CENTER);
txt123.setFont(Font.font("Archive", FontWeight.THIN, FontPosture.ITALIC,40));
txt123.setLineSpacing(2);
txt123.setFill(Color.WHITE);
TextField userNameField23 = new TextField();
userNameField23.setLayoutX(645);
userNameField23.setLayoutY(220);
userNameField23.setPrefSize(215, 50);
userNameField23.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
userNameField23.setPromptText(" user Name");
userNameField23.getStylesheets().add("file:css/style.css");
TextField userEmailField3 = new TextField();
userEmailField3.setLayoutX(645);
userEmailField3.setLayoutY(310);
userEmailField3.setPrefSize(215, 50);
userEmailField3.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
userEmailField3.setPromptText(" User Email");
userEmailField3.getStylesheets().add("file:css/style.css");
TextField mnumber3 = new TextField();
mnumber3.setLayoutX(645);
mnumber3.setLayoutY(400);
mnumber3.setPrefSize(215, 50);
mnumber3.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
mnumber3.setPromptText(" Mobile Number");
mnumber3.getStylesheets().add("file:css/style.css");
PasswordField userPasswordField23 = new PasswordField();
userPasswordField23.setLayoutX(645);
userPasswordField23.setLayoutY(490);
userPasswordField23.setPrefSize(215, 50);
userPasswordField23.setFont(Font.font("Open Sans Light",FontWeight.THIN,20));
userPasswordField23.setPromptText("Password");
userPasswordField23.getStylesheets().add("file:css/style.css");
Button btn23 = new Button("Login");
btn23.setLayoutX(680);
btn23.setLayoutY(580);
btn23.setPrefSize(100,40);
btn23.setFont(Font.font("Archive", FontWeight.BOLD,20));
btn23.setOpacity(0.9);
btn23.getStylesheets().add("file:css/style.css");
Button goback3 = new Button("Go Back");
goback3.setTranslateX(6);
goback3.setTranslateY(6);
goback3.setPrefSize(80, 20);
goback3.setFont(Font.font("Archive", FontWeight.BOLD,15));
goback3.setOpacity(0.9);
goback3.getStylesheets().add("file:css/style.css");

Button btn213 = new Button("Signup");
btn213.setLayoutX(800);
btn213.setLayoutY(580);
btn213.setPrefSize(100,40);
btn213.setFont(Font.font("Archive", FontWeight.BOLD,20));
btn213.setOpacity(0.9);
btn213.getStylesheets().add("file:css/style.css");




Group root23 = new Group(r23, imageViewl23, 
txt23,txt123,btn23,userNameField23,userEmailField3,userPasswordField23,mnumber3,goback3,btn213);
Scene scene23 = new Scene(root23, 1000, 665);


 
 
 
 //************************* Faculty Voting Page Coding *************************
 
 //Background Image
 ImageView imageViewf = new ImageView(new Image("file:Images/voteback.jpg")); 
 imageViewf.setFitHeight(1000); 
 imageViewf.setFitWidth(1000); 
 imageViewf.setX(0);
 imageViewf.setY(-10);
 imageViewf.setOpacity(1);
 imageViewf.setPreserveRatio(true);
 
 
//vote image 1 

 
 Button votef1=new Button();
 ImageView imageView1 = new ImageView(new Image("file:Images/vote1.jpg"));
 imageView1.setFitHeight(160);
 imageView1.setFitWidth(160);
 imageView1.setPreserveRatio(true);
 votef1.setGraphic(imageView1);
 votef1.setTranslateX(270);
 votef1.setTranslateY(125);
 votef1.setOnAction(new EventHandler<ActionEvent>(){
 public void handle(ActionEvent arg0) {
 votef1.setStyle("-fx-background-color: Darkblue; ");
 }});
  
 //vote image 2
 Button votef2=new Button();
 ImageView imageView2 = new ImageView(new Image("file:Images/vote2.jpg"));
 imageView2.setFitHeight(160);
 imageView2.setFitWidth(160);
 imageView2.setPreserveRatio(true);
 votef2.setGraphic(imageView2);
 votef2.setTranslateX(550);
 votef2.setTranslateY(125); 
 votef2.setOnAction(new EventHandler<ActionEvent>(){
 public void handle(ActionEvent arg0) {
 votef2.setStyle("-fx-background-color: Darkblue; ");
 }});
  
 //vote image 3
 Button votef3=new Button();
 ImageView imageView3 = new ImageView(new Image("file:Images/vote3.jpg"));
 imageView3.setFitHeight(160);
 imageView3.setFitWidth(160);
 imageView3.setPreserveRatio(true);
 votef3.setGraphic(imageView3);
 votef3.setTranslateX(270);
 votef3.setTranslateY(330); 
 votef3.setOnAction(new EventHandler<ActionEvent>(){
	 public void handle(ActionEvent arg0) {
	 votef3.setStyle("-fx-background-color: Darkblue; ");
	 }});
	  
	 //vote image 4
	 Button votef4=new Button();
	 ImageView imageView4 = new ImageView(new Image("file:Images/vote4.jpg"));
	 imageView4.setFitHeight(160);
	 imageView4.setFitWidth(160);
	 imageView4.setPreserveRatio(true);
	 votef4.setGraphic(imageView4);
	 votef4.setTranslateX(550);
	 votef4.setTranslateY(330);
	 votef4.setOnAction(new EventHandler<ActionEvent>(){
	 public void handle(ActionEvent arg0) {
	 votef4.setStyle("-fx-background-color: Darkblue; ");
	 }});
	  
	 //submit button 
	 Button fsubmit=new Button("Submit");
	 fsubmit.setFont(Font.font("Archive", FontWeight.BOLD,22));
	 fsubmit.setLayoutX(450);
	 fsubmit.setLayoutY(550);
	 fsubmit.setPrefSize(110,50);
	 fsubmit.getStylesheets().add("file:css/style.css");
	 Button logout = new Button("Log Out");
	 logout.setTranslateX(6);
	 logout.setTranslateY(6);
	 logout.setPrefSize(80, 20);
	 logout.setFont(Font.font("Archive", FontWeight.BOLD,15));
	 logout.setOpacity(0.9);
	 logout.getStylesheets().add("file:css/style.css");

	  
	 Group root4 = new Group(imageViewf,votef1, votef2, votef3,votef4, fsubmit,logout);
	 Scene scene4 = new Scene(root4, 1000, 665);
	  
	 //******************** Student Voting Page Coding *********************
	  
	  //Background Image
	 ImageView imageViews = new ImageView(new Image("file:Images/voteback.jpg"));
	  imageViews.setFitHeight(1000); 
	  imageViews.setFitWidth(1000);
	  imageViews.setX(0);
	  imageViews.setY(-10);
	  imageViews.setOpacity(1);
	  imageViews.setPreserveRatio(true);
	  
	 // vote image 1 
	 Button votef12=new Button();
	 ImageView imageView12 = new ImageView(new Image("file:Images/vote1.jpg"));
	 imageView12.setFitHeight(160);
	 imageView12.setFitWidth(160);
	 imageView12.setPreserveRatio(true);
	 votef12.setGraphic(imageView1);
	 votef12.setTranslateX(270);
	 votef12.setTranslateY(125);
	 votef12.setOnAction(new EventHandler<ActionEvent>(){
	 public void handle(ActionEvent arg0) {
	 votef12.setStyle("-fx-background-color: Darkblue; ");
	 }});
	  
	 //vote image 2
	 Button votef22=new Button();
	 ImageView imageView22 = new ImageView(new Image("file:Images/vote2.jpg"));
	 imageView22.setFitHeight(160);
	 imageView22.setFitWidth(160);
	 imageView22.setPreserveRatio(true);
	 votef22.setGraphic(imageView2);
	 votef22.setTranslateX(550);
	 votef22.setTranslateY(125); 
	 votef22.setOnAction(new EventHandler<ActionEvent>(){
	 public void handle(ActionEvent arg0) {
	 votef22.setStyle("-fx-background-color: Darkblue; ");
	 }});
	  
	 //vote image 3
	 Button votef32=new Button();
	 ImageView imageView32 = new ImageView(new Image("file:Images/vote3.jpg"));
	 imageView32.setFitHeight(160);
	 imageView32.setFitWidth(160);
	 imageView32.setPreserveRatio(true);
	 votef32.setGraphic(imageView3);
	 votef32.setTranslateX(270);
	 votef32.setTranslateY(330); 
	 votef32.setOnAction(new EventHandler<ActionEvent>(){
	 public void handle(ActionEvent arg0) {
	 votef32.setStyle("-fx-background-color: Darkblue; ");
	 }});
	  
	 //vote image 4
	 Button votef42=new Button();
	 ImageView imageView42 = new ImageView(new Image("file:Images/vote4.jpg"));
	 imageView42.setFitHeight(160);
	 imageView42.setFitWidth(160);
	 imageView42.setPreserveRatio(true);
	 votef42.setGraphic(imageView4);
	 votef42.setTranslateX(550);
	 votef42.setTranslateY(330);
	 votef42.setOnAction(new EventHandler<ActionEvent>(){
	 public void handle(ActionEvent arg0) {
	 votef42.setStyle("-fx-background-color: Darkblue; ");
	 }});
	  
	 //submit button 
	 Button ssubmit=new Button("Submit");
	 ssubmit.setFont(Font.font("Archive", FontWeight.BOLD,22));
	 ssubmit.setLayoutX(450);
	 ssubmit.setLayoutY(550);
	 ssubmit.setPrefSize(110,50);
	 ssubmit.getStylesheets().add("file:css/style.css");
	 Button logout1 = new Button("Log Out");
	 logout1.setTranslateX(6);
	 logout1.setTranslateY(6);
	 logout1.setPrefSize(80, 20);
	 logout1.setFont(Font.font("Archive", FontWeight.BOLD,15));
	 logout1.setOpacity(0.9);
	 logout1.getStylesheets().add("file:css/style.css");

	  
	 Group root41 = new Group(imageViews,votef12, votef22, votef32,votef42, 
	 ssubmit,logout1);
	 Scene scene41 = new Scene(root41, 1000, 665);
	//************************* Last Page Coding *************************
	 
	 ImageView imageView5 = new ImageView(new Image("file:Images/LastPage.jpg"));
	 imageView5.setFitHeight(750); 
	 imageView5.setFitWidth(1000); 
	 imageView5.setX(0);
	 imageView5.setY(0);
	 imageView5.setOpacity(1);
	 imageView5.setPreserveRatio(true);
	 
	 Text t2=new Text("Thank You");
	 t2.setLayoutX(270);
	 t2.setLayoutY(220);
	 t2.setTextAlignment(CENTER);
	 t2.setFill(Color.WHITE);
	 t2.setFont(Font.font("Archive",100));
	 
	 Text t3=new Text("IQRA UNIVERSITY");
	 t3.setLayoutX(385);
	 t3.setLayoutY(260);
	 t3.setTextAlignment(CENTER);
	 t3.setFill(Color.WHITE);
	 t3.setFont(Font.font("Archive", FontWeight.THIN, FontPosture.ITALIC,30));
	 
	 Button OK=new Button("OK");
	 OK.setFont(Font.font("Archive", FontWeight.BOLD,22));
	 OK.setLayoutX(450);
	 OK.setLayoutY(610);
	 OK.setPrefSize(110,50);
	 OK.getStylesheets().add("file:css/style.css");

	 
	 Group root5 = new Group(imageView5,t2,t3,OK);
	 Scene scene5 = new Scene(root5, 1000, 665); 
	 
	 
	 //************************* Event Handling Coding *************************
	 
	 
	 b.setOnAction(e -> stage.setScene(scene2)); //Faculty Page Button 
	 b1.setOnAction(e -> stage.setScene(scene3)); //Student Page Button
	 btn2.setOnAction(new EventHandler<ActionEvent>(){
		 //Faculty login Database Connection
			public void handle(ActionEvent event) {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root", "");
				Statement stm =con.createStatement();
				String sql ="SELECT * FROM signup where Name ='"+useraNmeField13.getText()+"'and Password='"+userPasswordField2.getText().toString()+"'";
				ResultSet rs =stm.executeQuery(sql);
				if(rs.next()){
					
					JOptionPane.showMessageDialog(null, "Login Succesfully ");
					stage.setScene(scene4);
				}
				else
					JOptionPane.showMessageDialog(null, "Incorrect Name and Password ");
					
				
					} catch(Exception e) {
					System.err.println("Exception: " + e);
					} 
				
								
			}});


	 btn21.setOnAction(new EventHandler<ActionEvent>(){
		 //Faculty Signup Database Connection
			public void handle(ActionEvent event) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root", "");
				
				
				
				String query ="insert into signup (Name,Email,Number,Password) values (?,?,?,?)";
				PreparedStatement pst =con.prepareStatement(query);
				pst.setString(1,userNameField22.getText() );
				pst.setString(2,userEmailField.getText() );
				pst.setString(3,mnumber.getText() );
				pst.setString(4,userPasswordField22.getText() );
				pst.execute();
									
				JOptionPane.showConfirmDialog(null, "Sucessfully Signup");

				
				//System.out.println("Successfully connected to MySQL server...");
				con.close();
				stage.setScene(scene4);
					} catch(Exception e) {
					System.err.println("Exception: " + e);
					} 
				
								
			}});


	 btn22.setOnAction(e -> stage.setScene(scene22)); //Faculty Signup Button
	 btn20.setOnAction(e -> stage.setScene(scene2)); //Faculty Signup Button

	 btn3.setOnAction(new EventHandler<ActionEvent>(){
		 //Student login Database Connection
			public void handle(ActionEvent event) {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root", "");
				Statement stm =con.createStatement();
				String sql ="SELECT * FROM signup where Name ='"+userNameField3.getText()+"'and Password='"+userPasswordField3.getText().toString()+"'";
				ResultSet rs =stm.executeQuery(sql);
				if(rs.next()){
					
					JOptionPane.showMessageDialog(null, "Login Succesfully ");
					stage.setScene(scene41);
				}
				else
					JOptionPane.showMessageDialog(null, "Incorrect Name and Password ");
					
				
					} catch(Exception e) {
					System.err.println("Exception: " + e);
					} 
				
								
			}});
	 
	 
	 btn213.setOnAction(new EventHandler<ActionEvent>(){
		 //Student Signup Database Connection
			public void handle(ActionEvent event) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root", "");
				
				
				
				String query ="insert into signup (Name,Email,Number,Password) values (?,?,?,?)";
				PreparedStatement pst =con.prepareStatement(query);
				pst.setString(1,userNameField23.getText() );
				pst.setString(2,userEmailField3.getText() );
				pst.setString(3,mnumber3.getText() );
				pst.setString(4,userPasswordField3.getText() );
				pst.execute();
									
				JOptionPane.showConfirmDialog(null, "Sucessfully Signup");

				
				//System.out.println("Successfully connected to MySQL server...");
				con.close();
				stage.setScene(scene4);
					} catch(Exception e) {
					System.err.println("Exception: " + e);
					} 
				
								
			}});




	 btn32.setOnAction(e -> stage.setScene(scene23)); //Student Signup Button
	 btn23.setOnAction(e -> stage.setScene(scene3)); //Student Signup Button
	 goback.setOnAction(e -> stage.setScene(scene1));//Go Back First Page
	 goback1.setOnAction(e -> stage.setScene(scene1));//Go Back First Page
	 goback2.setOnAction(e -> stage.setScene(scene1));//Go Back First Page
	 goback3.setOnAction(e -> stage.setScene(scene1));//Go Back First Page
	 logout.setOnAction(e -> stage.setScene(scene1));//Go Back First Page
	 logout1.setOnAction(e -> stage.setScene(scene1));//Go Back First Page
	 OK.setOnAction(e -> stage.setScene(scene4));//Go Back First Page

	 fsubmit.setOnAction(e -> stage.setScene(scene5)); //Faculty Vote Submit Button
	 ssubmit.setOnAction(e -> stage.setScene(scene5)); //Student Vote Submit Button
	 
	 
	 //*************************Stage Show Coding *************************
	 stage.getIcons().add(new Image("file:Images/iqra.jpg"));
	stage.setResizable(false);
	stage.setTitle("IQRA UNIVERSITY ONLINE VOTING SYSTEM");
	 stage.setScene(scene1);
	 stage.show(); 
	}
	public static void main(String[] args)
	{
	launch(args);
	}
	}

 

 