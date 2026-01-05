import java.util.Scanner;
public class main {
public static void main(String[] args) {
        garage garage = new garage();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        do{
            System.out.println("menu:");
            System.out.println("1. Add a vehivle");
            System.out.println("2. Update a vehivle");
            System.out.println("3. Remove a vehivle");
            System.out.println("4. Display vehivles");
            System.out.println("5. Display details of  avehivle");
            System.out.println("0. Exit");
            
            System.out.println("Enter your choice");
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("1. car");
                    System.out.println("2. Motorcycle");
                    System.out.println("3. Truck");
                    
                    System.out.println("Enter the vehicle (1-3) : ");
                    int vehicletypechoice = scanner.nextInt();
                    switch(vehicletypechoice){
                        case 1 :
                            System.out.println("Enter owner name :");
                            String carowner = scanner.nextLine();
                            System.out.println("Enter vehicle brand :");
                            String carbrand = scanner.nextLine();
                            System.out.println("Enter vehicle model :");
                            String carmodel = scanner.nextLine();
                            System.out.println("Enter vehicle year :");
                            int caryear = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter seating capacity :");
                            int seatingcapacity = scanner.nextInt();
                            garage.addvehicles(new Car (carowner , carbrand , carmodel ,caryear ,seatingcapacity));
                            break;
                        case 2 :
                            System.out.println("Enter owner name :");
                            String motorcycleowner = scanner.nextLine();
                            System.out.println("Enter vehicle brand :");
                            String motorcyclebrand = scanner.nextLine();
                            System.out.println("Enter vehicle model :");
                            String motorcyclemodel = scanner.nextLine();
                            System.out.println("Enter vehicle year :");
                            int motorcycleyrar = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter engine size :");
                            int enginesize = scanner.nextInt();
                            garage.addvehicles(new motorcycle (motorcycleowner , motorcyclebrand , motorcyclemodel ,motorcycleyrar ,enginesize));
                            break;
                         case 3 :
                            System.out.println("Enter owner name :");
                            String truckowner = scanner.nextLine();
                            System.out.println("Enter vehicle brand :");
                            String truckbrand = scanner.nextLine();
                            System.out.println("Enter vehicle model :");
                            String truckmodel = scanner.nextLine();
                            System.out.println("Enter vehicle year :");
                            int truckyear = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter engine size :");
                             enginesize = scanner.nextInt();
                            garage.addvehicles(new truck (truckowner , truckbrand , truckmodel ,truckyear ,enginesize));
                            break;  
  
                         default:
                             System.out.println("invalid vehicle type chouce. ");
                            break;
                    }
                case 2 :
                     System.out.println("Enter owner name of the vehicle to update :");
                            String owner = scanner.nextLine();
                            System.out.println("Enter new owner name :");
                            String updateowner = scanner.nextLine();
                            System.out.println("Enter new vehicle brand :");
                            String brand = scanner.nextLine();
                            System.out.println("Enter new vehicle model :");
                            String model = scanner.nextLine();
                            System.out.println("Enter new vehicle year :");
                            int year = scanner.nextInt();
                            
                            garage.updatevehicle( brand , model ,year ,owner ,updateowner );
                            break; 
                            
                case 3 :
                     System.out.println("Enter new owner name :");
                            String removeowner = scanner.nextLine();
                            garage.removevehicle(removeowner);
                            break; 
                            
                case 4 :
                    garage.displayvehicles();
                    break;
                
                case 5 :  
                    System.out.println("Enter  owner name of the vehicle to display details : :");
                            String displayowner = scanner.nextLine();
                            garage.displayvehiclDetals(displayowner);
                            break;
                            
                case 0 : 
                  System.out.println("Exiting the program!");  
                  break;
                
                default:
                    System.out.println("Invalid choice. please enter a valid option");
                
            }
        }while(choice != 0);
                
                
    }
    
}
