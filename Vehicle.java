package Training;


public abstract class  Vehicle {

   public String name = "" ;
   public String model = "" ;
   public String color = "";
   public String company= "";
   public String engine = "";
   public static int numOfVehicles = 0 ;
    
   
   
   // Constructor 
    public Vehicle (){numOfVehicles++;}
    
   // Constructor
    public Vehicle (String Name , String Model , String Color , String Company , String Engine ){
        this.name = Name ;
        this.model = Model ;
        this.color = Color;
        this.company = Company;
        this.engine = Engine;
        numOfVehicles++;
    }

    protected  int calSalary(int x ,int y){
        return x + y;
    }
    
    // Name setter
    public void setName(String name) {
        this.name = name;
    }
 
    // Model setter 
    public void setModel(String model) {
        this.model = model;
    }

    // Color setter
    public void setColor(String color) {
        this.color = color;
    }

    // Company setter
    public void setCompany(String company) {
        this.company = company;
    }
    
    // Engine setter
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    // Name getter 
    public String getName() {
        return name;
    }

    // Model getter
    public String getModel() {
        return model;
    }

    // Color getter
    public String getColor() {
        return color;
    }

    // Company getter
    public String getCompany() {
        return company;
    }


    // Engine getter 
    public String getEngine() {
        return engine;
    }

  // Method to be ovreloaded
    public int getPower(int x ){
        return x ;
    }
    

    // Method to get num of objects
    public  int getNumOfVehicles() {
        return numOfVehicles;
    }
    
}
