package JpaDemo;


/**
 * Hello world!
 */
public class App {
    public static void main( String[] args )
    {
      Alien a = new Alien();
      a.setAid(19);
      a.setAname("Maria");
      a.setTech("Hardware");
      DBConnector.insertInToTable(a);
      System.out.println(a);


    }


}
