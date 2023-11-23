
package Training;


public class Bike extends Vehicle implements BaseInterface {
    
    private boolean fourStroke = true ;

    public Bike(String Name, String Model, String Color, String Company, String Engine , boolean FourStroke) {
        super(Name, Model, Color, Company, Engine);
        this.fourStroke = FourStroke;
    }

    public void setFourStroke(boolean fourStroke) {
        this.fourStroke = fourStroke;
    }

    public boolean isFourStroke() {
        return fourStroke;
    }

    @Override
    public void getInfo() {
        System.out.println("This is a bike " + "and the address is " + AgencyAddress);   
    }
    
    
    protected int CalSalary(int x , int y , int z , int t){
        return x + y + z + t ;
    }

    @Override
    public int getSpeed(int param1, int param2) {
        return param1 + param2;
    }
    
    // Overload Method 
    public int getPower(int x , int y){
        return x + y ;
    }
 
  

    
    
}
