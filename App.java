import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.println("****** 🚗Welcome to Garage🚗 ********");

            System.out.println("Enter Customer name: ");
            String name=sc.nextLine();

            System.out.println("Enter Your Car Number: ");
            String car_No=sc.nextLine();

            System.out.println("Enter Your Car Type(Sedan/HatchBack/SUV): ");
            String carType=sc.nextLine();

            Customer customer=new Customer(name,car_No,carType);

            Services []services={
                    new Services(1,"Full Service",2000),
                    new Services(2,"Car Wash",250),
                    new Services(3,"Brake Change",400),
                    new Services(4,"Filter Change",350),
                    new Services(5,"Oil change",600),
            };

            boolean[]selected=new boolean[services.length];

            while(true){
                System.out.println("\n");
                System.out.println("🚗Availabe Services🚗");
                for(Services s:services){
                    System.out.println(s.getService_id()+"."+s.getService_name()+" Rs."+s.getPrice());
                }

                System.out.println("0.Generate Bill");
                System.out.println("Enter your choice: ");

                int choice= sc.nextInt();
                if(choice<0 || choice> services.length){
                    throw new Exception("Invalid Input");
                }



                if(choice==0){
                    //Final Billing
                    System.out.println("*********Billing********");
                    System.out.println("Services Availed By you : ");

                    for(int i=0;i< selected.length;i++){
                        if (selected[i]){
                            System.out.println("🎯"+services[i].getService_name()+"Rs."+services[i].getPrice());
                        }
                    }

                    int total=BillCalulator.calculate(services,selected);
                    System.out.println("Your Total Amount:Rs."+total);
                    System.out.println("******************* 😊Thanks For Visiting,Come Again😊*********************");
                    break;
                }
                System.out.println("Service Added: "+ services[choice-1].getService_name());
                selected[choice-1]=true;


            }



        }

        catch (Exception e) {
            System.out.println(""+e.getMessage());
        }

    }

}
