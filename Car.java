
package Training;

public class Car extends Vehicle implements BaseInterface {
    
    private boolean powerSteering = false;
    private boolean ledScreen = true;
    
    
    // Constructor
    public Car (String Name , String Model , String Color , String Company , String Engine ,boolean PowerSteering ,boolean LedScreen ){
        
        super(Name , Model, Color , Company , Engine );
        this.powerSteering = PowerSteering;
        this.ledScreen = LedScreen;
    }

    
    // PowerSteering setter 
    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    // LedScreen setter
    public void setLedScreen(boolean ledScreen) {
        this.ledScreen = ledScreen;
    }
    

    // PowerSteering getter
    public boolean isPowerSteering() {
        return powerSteering;
    }

    // LedScreen getter
    public boolean isLedScreen() {
        return ledScreen;
    }

    
    // Override getInfo method from interface
    @Override
    public void getInfo() {
        System.out.println("This is a Car" + " and the address is " + AgencyAddress);    }

    protected int calSalary(int x, int y, int z) {
        return x + y + z ;
    }

    // Override getInfo method from interface
    @Override
    public int getSpeed(int param1, int param2) {
        
        return param1 * param2 ;

        }
    
  // Overload method 
    public int getPower(int x , int y , int z){
        return x + y + z ;
    }
 
     
    
    
}
