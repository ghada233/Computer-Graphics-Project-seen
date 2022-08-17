/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.scene.AmbientLight;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Translate;

/**
 *
 * @author mnan1
 */
public class JavaFXApplication1 extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 820;
     int i=0;

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        //المباني القصيره  
        Box box = new Box(100, 200, 100);
        box.setTranslateX(100.0);
        box.setTranslateY(350);
        box.setTranslateZ(90);

        Image img1 = new Image(new FileInputStream("p1.jpg"));
        PhongMaterial mat = new PhongMaterial();
        mat.setDiffuseMap(img1);
        box.setMaterial(mat);

        Box box1 = new Box(100, 200, 100);
        box1.setTranslateX(300.0);
        box1.setTranslateY(350);
        box1.setTranslateZ(90);

        Image img2 = new Image(new FileInputStream("p2.jpg"));
        PhongMaterial mat2 = new PhongMaterial();
        mat2.setDiffuseMap(img2);
        box1.setMaterial(mat2);

        Box box2 = new Box(100, 200, 100);
        box2.setTranslateX(500.0);
        box2.setTranslateY(350);
        box2.setTranslateZ(90);

        Image img3 = new Image(new FileInputStream("p3.jpeg"));
        PhongMaterial mat3 = new PhongMaterial();
        mat3.setDiffuseMap(img3);
        box2.setMaterial(mat3);

        Box box3 = new Box(100, 200, 100);
        box3.setTranslateX(700.0);
        box3.setTranslateY(350);
        box3.setTranslateZ(90);

        Image img4 = new Image(new FileInputStream("p4.jpeg"));
        PhongMaterial mat4 = new PhongMaterial();
        mat4.setDiffuseMap(img4);
        box3.setMaterial(mat4);

//////////////// مباني طويله
        Box box4 = new Box(100, 300, 100);
        box4.setTranslateX(600.0);
        box4.setTranslateY(300);
        box4.setTranslateZ(90);

        Image img5 = new Image(new FileInputStream("p5.jpeg"));
        PhongMaterial mat5 = new PhongMaterial();
        mat5.setDiffuseMap(img5);
        box4.setMaterial(mat5);

        Box box5 = new Box(100, 300, 100);
        box5.setTranslateX(200.0);
        box5.setTranslateY(300);
        box5.setTranslateZ(90);

        Image img6 = new Image(new FileInputStream("p6.jpeg"));
        PhongMaterial mat6 = new PhongMaterial();
        mat6.setDiffuseMap(img6);
        box5.setMaterial(mat6);

        Box box6 = new Box(100, 300, 100);
        box6.setTranslateX(400.0);
        box6.setTranslateY(300);
        box6.setTranslateZ(90);

        Image img7 = new Image(new FileInputStream("p7.jpeg"));
        PhongMaterial mat7 = new PhongMaterial();
        mat7.setDiffuseMap(img7);
        box6.setMaterial(mat7);
/////////////////////////////////////////////////////////////////////////////

        Sphere sun = new Sphere(80, 70);
        sun.setTranslateX(100);
        sun.setTranslateY(80);
        sun.setTranslateZ(20);
        Image img8 = new Image(new FileInputStream("sun.jpeg"));
        PhongMaterial mat8 = new PhongMaterial();
        //   mat8.setDiffuseColor(Color.YELLOW);
        mat8.setDiffuseMap(img8);
        sun.setMaterial(mat8);

        //////////////////////////////////////////////////////////////////////////     
/////الغيوم
        Circle cir3 = new Circle(620, 75, 30);
        cir3.setFill(Color.WHITE);

        Circle cir0 = new Circle(650, 90, 20);
        cir0.setFill(Color.WHITE);

        Circle cir = new Circle(650, 50, 30);
        cir.setFill(Color.WHITE);

        Circle cir2 = new Circle(690, 75, 30);
        cir2.setFill(Color.WHITE);

        Circle cir4 = new Circle(400, 45, 30);
        cir4.setFill(Color.WHITE);

        Circle cir5 = new Circle(370, 70, 25);
        cir5.setFill(Color.WHITE);

        Circle cir6 = new Circle(430, 70, 25);
        cir6.setFill(Color.WHITE);

        Circle cir7 = new Circle(400, 75, 20);
        cir7.setFill(Color.WHITE);

        ////////////////////////////////////////////
        //الطريق
        Box box7 = new Box(800, 220, 300);
        box7.setTranslateX(400.0);
        box7.setTranslateY(700);
        box7.setTranslateZ(90);

        Image img9 = new Image(new FileInputStream("p20.jpg"));
        PhongMaterial mat9 = new PhongMaterial();
        mat9.setDiffuseMap(img9);
        box7.setMaterial(mat9);
        //////////////////////////

       
        //
        //desrt
        Rectangle r = new Rectangle(0, 450, 800, 200);
        r.setFill(Color.SANDYBROWN);

        ///////////////////////////////////////////////
       

        //////////////////////////////////////////////
        //الكورة 
        Sphere ball = new Sphere(20, 20);
        ball.setTranslateX(685);
        ball.setTranslateY(230);
        ball.setTranslateZ(0);
        Image img12 = new Image(new FileInputStream("ball.png"));

        PhongMaterial mat12 = new PhongMaterial();

        mat12.setDiffuseMap(img12);
        ball.setMaterial(mat12);

//////////////////////////////////////////////////////
        //////////////////////////////////////////////
        Sphere rock1 = new Sphere(30, 30);
        rock1.setTranslateX(150);
        rock1.setTranslateY(600);
        rock1.setTranslateZ(20);
        Image img13 = new Image(new FileInputStream("rock.jpg"));
        PhongMaterial mat13 = new PhongMaterial();
        mat13.setDiffuseMap(img13);
        rock1.setMaterial(mat13);

        Sphere rock2 = new Sphere(30, 30);
        rock2.setTranslateX(120);
        rock2.setTranslateY(600);
        rock2.setTranslateZ(20);
        mat13.setDiffuseMap(img13);
        rock2.setMaterial(mat13);

        Sphere rock3 = new Sphere(30, 30);
        rock3.setTranslateX(400);
        rock3.setTranslateY(600);
        rock3.setTranslateZ(20);
        mat13.setDiffuseMap(img13);
        rock3.setMaterial(mat13);
        ////////////////////////////////////////  
        Sphere rock4 = new Sphere(30, 30);
        rock4.setTranslateX(200);
        rock4.setTranslateY(600);
        rock4.setTranslateZ(20);

        mat13.setDiffuseMap(img13);
        rock4.setMaterial(mat13);

        Sphere rock5 = new Sphere(30, 30);
        rock5.setTranslateX(180);
        rock5.setTranslateY(600);
        rock5.setTranslateZ(20);
        mat13.setDiffuseMap(img13);
        rock5.setMaterial(mat13);

        ///////////////////////////////
        Sphere rock6 = new Sphere(30, 30);
        rock6.setTranslateX(300);
        rock6.setTranslateY(600);
        rock6.setTranslateZ(20);

        mat13.setDiffuseMap(img13);
        rock6.setMaterial(mat13);

        Sphere rock7 = new Sphere(30, 30);
        rock7.setTranslateX(320);
        rock7.setTranslateY(600);
        rock7.setTranslateZ(20);
        mat13.setDiffuseMap(img13);
        rock7.setMaterial(mat13);

        ////////////////////////////////////////////////
        //اشارة المرور
        Rectangle mnb = new Rectangle(10, 400, 40, 120);
        mnb.setFill(Color.BLACK);

        Circle cirR = new Circle(30, 430, 12);
        cirR.setFill(Color.RED);
        Circle cirO = new Circle(30, 460, 12);
        cirO.setFill(Color.YELLOW);
        Circle cirG = new Circle(30, 490, 12);
        cirG.setFill(Color.GREEN);

        Rectangle Stick = new Rectangle(25, 520, 10, 70);
        Stick.setFill(Color.WHITE);

///////////////////////////////////////////////////////
//batman
        Box box14 = new Box(100, 110, 30);
        box14.setTranslateX(300.0);
        box14.setTranslateY(210.0);
        box14.setTranslateZ(60);
        Image img14 = new Image(new FileInputStream("batman.png"));

        PhongMaterial mat14 = new PhongMaterial();
        mat14.setDiffuseColor(Color.SKYBLUE);
        mat14.setDiffuseMap(img14);
        box14.setMaterial(mat14);

///////////////////////////////////////////////////////
        Box box15 = new Box(100, 150, 30);
        box15.setTranslateX(500.0);
        box15.setTranslateY(520.0);
        box15.setTranslateZ(10);
        Image img15 = new Image(new FileInputStream("Child1.png"));
        PhongMaterial mat15 = new PhongMaterial();
        mat15.setDiffuseColor(Color.SANDYBROWN);
        mat15.setDiffuseMap(img15);
        box15.setMaterial(mat15);
        //////////////////////////////////////////
         Rectangle StickL = new Rectangle(770, 290, 10, 160);
        StickL.setFill(Color.WHITE);
        
        Sphere Light = new Sphere(20, 20);
        Light.setTranslateX(780);
        Light.setTranslateY(270);
        Light.setTranslateZ(20);
        PhongMaterial mat16 = new PhongMaterial();
        mat16.setDiffuseColor(Color.YELLOW);
        Light.setMaterial(mat16);
       
//////////////////////////////////////////////////////////
 //شعار 
        Box box9 = new Box(80, 40, 30);
        box9.setTranslateX(488.0);
        box9.setTranslateY(230.0);
        box9.setTranslateZ(60);
        Image img11 = new Image(new FileInputStream("badman.png"));

        PhongMaterial mat11 = new PhongMaterial();
        mat11.setDiffuseColor(Color.SKYBLUE);
        mat11.setDiffuseMap(img11);
        box9.setMaterial(mat11);
///////////////////////////////////////////////////////////
//الاضاءه
/////////////////////////////////////////////////////////
        AmbientLight ambLight = new AmbientLight(Color.WHITE);
        PointLight pLight = new PointLight(Color.YELLOW);
        pLight.getTransforms().add(new Translate(100, 80, 20));
        

        
       primaryStage.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                //turn the point light on/off 
                pLight.setLightOn(!pLight.isLightOn());
            } //turn the ambient light on/off 
            else if (event.getButton() == MouseButton.SECONDARY) {
                ambLight.setLightOn(!ambLight.isLightOn());
            }
        });
       
               primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            switch (event.getCode()) {
                //change the color of point light based on the pressed key
                case W :
                    pLight.setColor(Color.WHITE);
                    break;
                case R:
                    pLight.setColor(Color.RED);
                    break;
                case G:
                    pLight.setColor(Color.GREEN);
                    break;
                case B:
                    pLight.setColor(Color.BLUE);
                    break;
                case Y:
                    pLight.setColor(Color.YELLOW);
                    break;

                //change the position of point light based on the pressed arrow key
                case UP:
                    pLight.setTranslateY(pLight.getTranslateY() - 10);
                    break;
                case DOWN:
                    pLight.setTranslateY(pLight.getTranslateY() + 10);
                    break;
                case LEFT:
                    pLight.setTranslateX(pLight.getTranslateX() - 10);
                    break;
                case RIGHT:
                    pLight.setTranslateX(pLight.getTranslateX() + 10);
                    break;
             
            }
        });
///////////////////////////////////////////////////////////
        primaryStage.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            if (event.getButton() == MouseButton.PRIMARY) {

                box9.setTranslateX((box9.getTranslateX() + (event.getSceneX() - box9.getTranslateX())));
                box9.setTranslateY((box9.getTranslateY() + (event.getSceneY() - box9.getTranslateY())));
                
                Light.setTranslateX((Light.getTranslateX() + (event.getSceneX() - Light.getTranslateX())));
                Light.setTranslateY((Light.getTranslateY() + (event.getSceneY() - Light.getTranslateY())));

            }

        });
/////////////////////////////////////////////////////////////////////////////
        primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            

            switch (event.getCode()) {

                case RIGHT:
                     ball.setRotate(ball.getRotate() + 180);
                    sun.setRotate(sun.getRotate() + 180);

                    break;
                case LEFT:
                      ball.setRotate(ball.getRotate() - 180);
                    sun.setRotate(sun.getRotate() - 180);
                    break;
                    
                    
                   
                     case D:

                    if (i == 0) {
                        ball.setTranslateY(ball.getTranslateY() + 300);
                     
                        i = 1;
                    } else if (i == 1) {
                        ball.setTranslateY(ball.getTranslateY() - 20);
                        i = 2;
                    } else if (i == 2) {
                        ball.setTranslateY(ball.getTranslateY() + 20);
                        i = -1;

                    }break;
                     case R:
                    ball.setTranslateX(685);
                    ball.setTranslateY(230);
                    ball.setTranslateZ(0);
                    box9.setTranslateX(488.0);
                    box9.setTranslateY(230.0);
                    box9.setTranslateZ(60);
                    Light.setTranslateX(780);
                    Light.setTranslateY(270);
                    Light.setTranslateZ(20);
                    
                    
                      
                    
                    
                 
                 
                    
        break;
                    
            }
        });
/////////////////////////////////////////////////////////

 Group group = new Group();

       
group.getChildren().addAll(box,box1,box2,box3,box4 , box5, box6,sun,cir,cir2,cir3,cir4,cir5,cir6,cir7 ,cir0, box7,ball,r,rock1,rock2,rock3,rock4,rock5,rock6,rock7,mnb,cirR,cirO,cirG,Stick,box14,box15,box9,ambLight, pLight,StickL,Light);
        Camera camera = new PerspectiveCamera();
        Scene scene = new Scene(group, WIDTH, HEIGHT,true);
        scene.setCamera(camera);
        scene.setFill(Color.SKYBLUE);
        primaryStage.setTitle("Batman super hero ");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
