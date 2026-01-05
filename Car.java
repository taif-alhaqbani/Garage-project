public class Car extends vehicle {
    private int seatingcapacity;
    public Car (String ownerName ,String brand ,String model ,int year ,int seatingcapacity){
    super(ownerName ,brand ,model ,year);
         this.seatingcapacity=seatingcapacity;
     }
     public void setseatingcapacity(int seatingcapacity){
                 this.seatingcapacity=seatingcapacity;
 
     }
     public int getseatingcapacity(){
         return seatingcapacity;
     }
    @Override
    public void displayinfo(){
    System.out.println("owner: " + getownername());
    System.out.println("car : "+ getbrand() + " " +"model :" + getmodel() + " " + "year :" + getyear());
    System.out.println("Seating Capacity :" + seatingcapacity);
}
}
