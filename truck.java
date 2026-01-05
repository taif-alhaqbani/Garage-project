public class truck extends vehicle {
    private double cargocapacity;
    public truck(String ownername ,String brand ,String model ,int year , double cargocapacity){
    super(ownername ,brand ,model ,year);
       this.cargocapacity=cargocapacity;
   }
    public void setcargocapacity( double cargocapacity){
        this.cargocapacity=cargocapacity;
    }
    public double getcargocapacity(){
        return cargocapacity;
    }
    @Override
    public void displayinfo(){
    System.out.println("owner: " + getownername());
    System.out.println("car : "+ getbrand() + " " +"model :" + getmodel() + " " + "year :" + getyear());
    System.out.println("cargo Capacity :" + cargocapacity + "tans");
    }

}