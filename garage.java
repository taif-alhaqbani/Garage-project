public class garage {
    private vehicle[] vehicles;
    private int count;
    
    public garage(){
        this.vehicles = new vehicle[100];
        this.count=0;
    }
    public void addvehicles(vehicle vehicle){
        if(count<vehicles.length){
            vehicles[count]= vehicle;
            count++;
            System.out.println("vehicle added to the garage .");
        }
        else{
             System.out.println("Garage is full . can not add more vehicles .");
        }
    }
  public void updatevehicle(String brand ,String model ,int year , String newowner ,String currentowner){
      boolean found =false;
      
      for(int i=0 ; i<count ; i++){
          if (vehicles[i].getownername().equalsIgnoreCase(currentowner)){
              vehicles[i].setbrand(brand);
              vehicles[i].setmodel(model);
              vehicles[i].setyear(year);
              vehicles[i].setownername(newowner);
              System.out.println("Vehicle update successfully");
              found=true;
              break;
          }
      }
      if (!found){
          System.out.println("Vehicle with owner '" + currentowner +" ' not found. update failed.");
      }
  }
  public void removevehicle(String ownername){
      boolean found = false;
      for(int i=0 ; i<count ; i++){
          if (vehicles[i].getownername().equalsIgnoreCase(ownername)){
       vehicles[i] =  vehicles[count-1];
       vehicles[count-1]=null;
       count--;
       System.out.println("Vehicle removed from the garage");
       found=true;
       break;
  }
}
      if (!found){
          System.out.println("Vehicle with owner '" + ownername +" ' not found. remval failed.");
      }
  }
  public void displayvehicles(){
      if (count ==0){
          System.out.println("the garage is empty");
      }
      else{
           for(int i=0 ; i<count ; i++){
               vehicles[i].displayinfo();
               System.out.println();
           }
      }
  }
  public void displayvehiclDetals(String ownername){
      boolean found = false;
     for(int i=0 ; i<count ; i++){
          if (vehicles[i].getownername().equalsIgnoreCase(ownername)){
              vehicles[i].displayinfo();
              found=true;
              break;
          } 
      }
      if (!found){
          System.out.println("Vehicle with owner '" + ownername +" ' not found.");
      }
  }
}


