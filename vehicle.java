public abstract class vehicle {
    private String ownername;
    private String brand;
    private String model;
    private int year;
    
    public vehicle(String ownerName ,String brand ,String model ,int year){
        this.ownername = ownerName;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void setownername(String ownername){
        this.ownername = ownername;
    }
    public String getownername(){
        return ownername;
    }
     public void setbrand(String brand){
         this.brand = brand;
     }
     public String getbrand(){
         return brand;
     }
      public void setmodel(String model){
          this.model = model;
      }
       public String getmodel(){
           return model;
       }
     public void setyear(int year){
        this.year = year; 
     }
     public int getyear(){
         return year;
     }
     public abstract void displayinfo();
}
