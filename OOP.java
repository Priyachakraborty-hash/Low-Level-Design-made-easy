//Abstraction in java, abstract classes and methods
class Circle {
  //define data attributes
  private double radius;
  private double pi;
  
  //define constructors
  public Circle() {
    radius = 0;
    pi = 3.142;
  }

  public Circle(double r) {
    radius = r;
    pi = 3.142;
  }
  
  //define methods
  public double area() {
    return pi * radius * radius;
  }

  public double perimeter() {
    return 2 * pi * radius;
  }  
  
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    System.out.printf("Area: %.2f %n", circle.area());
    System.out.printf("Perimeter: %.2f %n", circle.perimeter());
  }
}
***********************************************************************
  class Movie
{
    //Encapsulation Exmaple
     
     private String title;
     private int year;
     private String genre;

    public Movie()
    {
       this.title = "";
       this.year = -1;
       this.genre = "";
    }
    public Movie(String t,int y,String g)
    {
        this.title = t;
       this.year = y;
       this.genre = g;
    }
    public String getTitle()
    {
          return title;
    }
    public void setTitle(String t)
    {
         title = t;
    }
    public int getYear()
    {
        return year;
    }
    public  void setYear(int y)
    {
        year = y;
    }
    public String getGenre()
    {
         return genre;
    }
    public void setGenre(String g)
    {
        genre = g;
    }
    void printDetails()
    {
        System.out.println("Title : "+title);
        System.out.println("Year: "+year);
        System.out.println("Genre: "+genre);
    }
     public static void main(String[] args)
     {
          Movie m = new Movie("KABHI KABHI ADITI",2003,"Comedy");
          m.printDetails();
          System.out.println("___________________________");
          m.setYear(1995);
          System.out.println("NEW YEAR : "+m.getYear());
 
     }

}
********************************************************************
  // Base class (Parent)
class Vehicle {
    private String name;
    private String model;
    Vehicle(String name, String model) {
        this.name = name;
        this.model = model;
    }
    public void getName() {
        System.out.print("The car is a " + name + " " + model);
    }
}

// Single inheritance
// FuelCar class extending from Vehicle class
// Derived class (Child)
class FuelCar extends Vehicle {
    private String combustType;
    FuelCar(String name, String model, String combustType) {
        super(name, model);
        this.combustType = combustType;
    }
    public void getFuelCar() {
        getName();
        System.out.print(", combust type is " + combustType);
    }
}

// Hierarchical inheritance
// Alongside the FuelCar class, the ElectricCar class is also extending from Vehicle class
// Another Derived class (Child)
class ElectricCar extends Vehicle {
    private String batteryPower;
    ElectricCar(String name, String model, String batteryPower) {
        super(name, model);
        this.batteryPower = batteryPower;
    }
    public void getElectricCar() {
        getName();
        System.out.print(", battery power is " + batteryPower);
    }
}

// Multi-level inheritance
// GasolineCar class is derived from the FuelCar class, which is further derived from the Vehicle class
// Derived class (Grandchild)
class GasolineCar extends FuelCar {
    private String combustType;
    private String gasCapacity;
    GasolineCar(String name, String model, String combustType, String gasCapacity) {
        super(name, model, combustType);
        this.gasCapacity = gasCapacity;
    }
    public void getGasolineCar() {
        getName();
        System.out.print(", gas capacity is " + gasCapacity);
    }
}

// Java does not support Multiple inheritance via classes

// main
public class main
{
    public static void main(String[] args) {
        System.out.println("Single inheritance:");
        FuelCar Fuel = new FuelCar("Honda", "Accord", "Petrol");
        Fuel.getName();
        System.out.println("\n");

    //     System.out.println("Hierarchical inheritance:");
    //     ElectricCar Electric = new ElectricCar("Tesla", "ModelX", "200MWH");
    //     Electric.getElectricCar();
    //     System.out.println("\n");

    //     System.out.println("Multi-Level inheritance:");
    //     GasolineCar Gasoline = new GasolineCar("Toyota", "Corolla", "Gasoline", "30 liters");
    //     Gasoline.getGasolineCar();
        
        
    //     System.out.println("\n");
    //     System.out.println("Java does not support Multiple Inheritance through classes");
    // }
}
