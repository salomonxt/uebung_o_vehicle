import java.time.Year;
import java.util.Arrays;
import java.util.Objects;

public class Vehicle {
    String model;
    String manufacture;
    String year;

    public static void main(String[] args) { //prüfe position!
        System.out.println("Welcome to Vehicle");
        Vehicle auto = new car("Mode200","bmw","1970", "2");//error
        System.out.println("Model: " + auto.model+ " Manufactor: " + auto.manufacture+ " Year: " +auto.year+ " Doors : kommtnoch");
        //error mit doors - zahl fehlt


    }
    public Vehicle(String model, String manufacture, String year) {
        this.model = model;
        this.manufacture = manufacture;
        this.year = year;

    }


    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(model, vehicle.model) && Objects.equals(manufacture, vehicle.manufacture) && Objects.equals(year, vehicle.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, manufacture, year);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "year='" + year + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    static class car extends Vehicle {
        String numberdoors;

        public String getNumberdoors() {
            return numberdoors;
        }

        public void setNumberdoors(String numberdoors) {
            this.numberdoors = numberdoors;
        }

        @Override
        public String toString() {
            return "car{" +
                    "numberdoors='" + numberdoors + '\'' +
                    "} " + super.toString();
        }

        public car(String model, String manufacture, String year, String numberdoors) {

            super(model, manufacture, year);
            this.numberdoors = numberdoors;


        }


    }



}
