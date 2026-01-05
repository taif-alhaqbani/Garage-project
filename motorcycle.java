public class motorcycle extends vehicle{
    private int engineSize;
    public motorcycle(String ownername ,String brand ,String model ,int year ,int engineSize){
    super(ownername ,brand ,model ,year);
    this.engineSize=engineSize;
    }
    
    public void setengineSize(int engineSize){
        this.engineSize=engineSize;
    }
    public int getengineSize(){
        return engineSize;
    }
    public void displayinfo(){
    System.out.println("owner: " + getownername());
    System.out.println("car : "+ getbrand() + " " +"model :" + getmodel() + " " + "year :" + getyear());
    System.out.println("Enging Size :" + engineSize + "cc");
}
}
