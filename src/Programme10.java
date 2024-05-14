import java.util.HashMap;
import java.util.Map;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme10 {
  public static void main (String[]args){
      //Create a map for zone1 stations with the lines that pass through
      Map<String,String >zone1Stations = new HashMap<>();

      //Zone 1 station name and their lines
      zone1Stations.put("Bank","Bakerloo ,  Central, Victoria");
      zone1Stations.put("Kennington", "Circle, Jubilee, Northern, Waterloo & City");
      zone1Stations.put("Bond Street", "Central, Circle, District, Hammersmith & City");
      zone1Stations.put("Waterloo", "Victoria, Hammersmith & City, Metropolitan, Northern, Piccadilly, Victoria");

      String stationToQuery= "Waterloo";

      if(zone1Stations.containsKey(stationToQuery)){
          String line = zone1Stations.get(stationToQuery);
          System.out.println("The following line pass through "+stationToQuery+": "+line);
      }else
          System.out.println(stationToQuery+ "is not  a Zone 1 station");

  }
}
