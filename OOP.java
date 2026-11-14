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
