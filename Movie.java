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