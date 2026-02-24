public class Customer {
    private String name;
    private String car_No;
    private String carType;

    Customer(String name,String car_No,String carType){
        this.name=name;
        this.car_No=car_No;
        this.carType=carType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCar_No() {
        return car_No;
    }

    public void setCar_No(String car_No) {
        this.car_No = car_No;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

}
