
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan Parekh
 */
public class u1930306_FX1 extends Application
{
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    
     // visual components
                    private Label headingLabel = new Label("Car Park Application");
                    //parkDetails
                    private Label carNo = new Label("carNo");
                    private TextField carNo1 =  new TextField();
                    private Label owner = new Label("Owner");
                    private TextField owner1 =  new TextField();
                    private Label ps1= new Label ("Position");
                    private TextField post = new TextField();
                    //parkbuttons
                    private Button checkin=new Button("Check IN");
                    private Button checkout=new Button ("Check OUT");
                    private Button currentstatus= new Button ("Display Current Status");
                    private TextArea displayArea1  = new TextArea();
                    
                    private Label headingLabel2 = new Label("Register Car");
                    //regdetails
                    private Label regCar = new Label("carNo");
                    private TextField carNo2 =  new TextField();
                    private Label regOwner = new Label("Owner");
                    private TextField owner2 =  new TextField();
                    //regbuttons
                    private Button addcar = new Button ("Add Car");
                    private Button registeredcar=new Button("Display all registered Cars");
                     private Button saveAndQuitButton  = new Button("Save and Quit");
                    private TextArea displayArea2 =  new TextArea();
                    
    
    //@Override
    public void start(Stage stage)
    {
                       List<Car> carList = new ArrayList<>();
                        //  String[] parkstatus=new String[10];
                       List<Car> parkstatus = new ArrayList<>();
                       CarFileHandler.readList1(parkstatus);
                       CarFileHandler.readList2(carList);
                       
                      //menu navigation system
                      //Menu menu1=new Menu ("file");
                      Menu menu2=new Menu("Help");
                    MenuItem menuItem1 = new MenuItem("New ");
                    MenuItem menuItem2 = new MenuItem("Exit without saving");

                    //menu1.getItems().add(menuItem1);
                    menu2.getItems().add(menuItem2);

                    MenuBar menuBar = new MenuBar();
                    //menuBar.getMenus().add(menu1);
                    menuBar.getMenus().add(menu2);
                    menuItem2.setOnAction(e -> Platform.exit());
                    VBox vbx=new VBox(10);      
                    vbx.getChildren().addAll(menuBar);
                       
                      HBox parkDetails = new HBox (10);
                      HBox parkButtons = new HBox(10);
                      HBox regDetails = new HBox(10);
                      HBox regButtons = new HBox(10);
                      // add components to HBoxes
                      parkDetails.getChildren().addAll(carNo, carNo1, owner, owner1,ps1,post);
                      parkButtons.getChildren().addAll(	checkin, checkout, currentstatus);
                      regDetails.getChildren().addAll(	regCar, carNo2, regOwner, owner2);
                      regButtons.getChildren().addAll(addcar, registeredcar, saveAndQuitButton);
                      
                       // create VBox
                        VBox root = new VBox(13);
                        
                         // add all components to VBox
                        root.getChildren().addAll(vbx, headingLabel, parkDetails, parkButtons, displayArea1,headingLabel2,
                         regDetails, regButtons, displayArea2);
                        
                         // create the scene
       Scene scene = new Scene( root, Color.LIGHTBLUE);
                        
                        // set font of heading
       Font font = new Font("Calibri", 40);
       headingLabel.setFont(font);
       headingLabel2.setFont(font);
       
       
 		// set alignment of HBoxes
       parkDetails.setAlignment(Pos.CENTER);
       parkButtons.setAlignment(Pos.CENTER);
       regDetails.setAlignment(Pos.CENTER);
       regButtons.setAlignment(Pos.CENTER);
       // set alignment of VBox
       root.setAlignment(Pos.CENTER);
       
              // set minimum and maximum width of components 
       carNo1.setMaxWidth(50);
       ps1.setMaxWidth(50);
       carNo2.setMaxWidth(50);
        
       parkDetails.setMinWidth(WIDTH);
       parkDetails.setMaxWidth(WIDTH);
        
       parkButtons.setMinWidth(WIDTH);
       parkButtons.setMaxWidth(WIDTH);
        
       regDetails.setMinWidth(WIDTH);
       regDetails.setMaxWidth(WIDTH);
        
       regButtons.setMinWidth(WIDTH);
       regButtons.setMaxWidth(WIDTH);
        
       root.setMinSize(WIDTH, HEIGHT);
       root.setMaxSize(WIDTH, HEIGHT);
        
       displayArea1.setMaxSize(WIDTH - 80, HEIGHT/5);
       displayArea2.setMaxSize(WIDTH - 80, HEIGHT/5);
         
       stage.setWidth(WIDTH);
       stage.setHeight(HEIGHT);
       
         // customise the visual components
        
       // customise the VBox border and background
       BorderStroke style = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2) );
       root.setBorder(new Border (style));
       root.setBackground(Background.EMPTY);
               
       // customise buttons
       checkin.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW, 
									new CornerRadii(10), Insets.EMPTY)));
       checkout.setBackground(	new Background(new BackgroundFill(Color.LIGHTYELLOW, 
											new CornerRadii(10), Insets.EMPTY)));
       currentstatus.setBackground(	new Background(new BackgroundFill(Color.LIGHTYELLOW, 
										new CornerRadii(10), Insets.EMPTY)));
       addcar.setBackground(	new Background(new BackgroundFill(Color.LIGHTYELLOW, 
												new CornerRadii(10), Insets.EMPTY)));
       registeredcar.setBackground(	new Background(new BackgroundFill(Color.LIGHTYELLOW, 
											new CornerRadii(10), Insets.EMPTY)));
       saveAndQuitButton.setBackground(	new Background(new BackgroundFill(Color.LIGHTYELLOW, 
										new CornerRadii(10), Insets.EMPTY)));
       
         checkin.setOnAction(e -> checkin(parkstatus, carList));
       checkout.setOnAction(e -> checkout(parkstatus) );
       currentstatus.setOnAction( e -> currentpark(parkstatus));
		addcar.setOnAction( e -> addCar(carList));
       registeredcar.setOnAction( e -> listAll(carList));
		saveAndQuitButton.setOnAction( e -> saveandquit(parkstatus, carList));
        
                        
      // configure the stage and make the stage visible
       stage.setScene(scene);
		stage.setTitle("Car Park Applicaton");
       stage.setResizable(false); // see discussion below
       stage.show();    
    }
    
     
        void currentpark(List <Car> parkin)
    {
        {
                    int st=parkin.size();
                    int temp=10-st;
                    //System.out.println
                    displayArea1.setText("Current availabilty of car park is "+ temp);
                    displayArea1.appendText("\nList of Entered cars ");
                   for(int i=0;i<st;i++){ 
                   //for (Car item : parkin) 
                  displayArea1.appendText("\n"+(i+1)+". "+parkin.get(i).getRegistration()
			+ " "
			+ parkin.get(i).getowner()); }
                    
                }
    }
   //this method will check the car and allow only the registered car to enter 
    void checkin( List<Car> parkin, List<Car> carin)
   {
        if (parkin.size() <= 10)
                        {
                            String tempReg;
                            String tempowner;

                            displayArea1.setText("Please enter the registration number: ");
                            tempReg = carNo1.getText();//EasyScanner.nextString();

                            displayArea1.appendText("Please enter the owner: ");
                            tempowner= owner1.getText();//EasyScanner.nextString();
                           if (carNo1.getText().equalsIgnoreCase(""))
                           {
                               displayArea1.setText("Please enter the car number in carNo field."
                                      );
                           }
                           else
                           {
                                boolean ans=false;
                                for (int i=0;i<carin.size();i++)
                                {
                                    if (carin.get(i).getRegistration().equals(tempReg))
                                       ans = true;
                                }
                                      if (ans)
                                      {
                                          parkin.add(new Car(tempReg, tempowner));
                                          displayArea1.setText("The car is CHECKed IN");
                                      }
                                      else displayArea1.setText("Only registered cars allowed"); 
                           }
                                
         } 
         else displayArea1.setText("The Park is currently full");  
        
                                carNo1.setText("");
                                owner1.setText("");
   }
   //this method will allow the car to exit the car park
    void checkout(List<Car> parkin)
            {
                displayArea1.setText("Cars in list");
                for(int i=0;i<parkin.size();i++) {
                   //for (Car item : parkin) 
                   displayArea1.appendText("\n"+(i+1)+". "+parkin.get(i).getRegistration()
			+ " "
			+ parkin.get(i).getowner()); }
                    
                String Spos;
		displayArea1.appendText("\nEnter the position of the car in Position box to be removed: ");
		Spos = post.getText();// EasyScanner.nextInt();
                int pos = Integer.parseInt(Spos);
                int pIn=pos - 1;
                if (pos<=parkin.size()) {
		parkin.remove(pIn);
               displayArea1.appendText("\nCheck out Successful"); }
                else displayArea1.appendText("Invalid selection");
                post.setText("");
                }
   
    
      void listAll(List<Car> carListIn)
	{
            displayArea2.setText("List of Registered Cars ");
		for(Car item : carListIn)
		{
			displayArea2.appendText("\n"+item.getRegistration()
			+ " "
			+ item.getowner());
			
		}
	}
    // this method helps in adding new cars in the registered file
    void addCar(List<Car> carListIn)
	{
		String tempReg;
		String tempowner;
		displayArea2.setText("Please enter the registration number: ");
		tempReg = carNo2.getText();
               
		System.out.print("Please enter the owner: ");
		tempowner= owner2.getText();
		//tempPrice = EasyScanner.nextDouble();
		carListIn.add(new Car(tempReg, tempowner));
                		displayArea2.setText("\nCar added "+tempReg+" "+tempowner);
                                carNo2.setText("");
                                owner2.setText("");
	}
    void saveandquit(List<Car> parkstatus, List<Car> carList)
   {
                        CarFileHandler.writeList1(parkstatus);
                        CarFileHandler.writeList2(carList);
                        Platform.exit();
   }
   
    public static void main(String[] args)
    {
        launch(args);
    }
     
}
