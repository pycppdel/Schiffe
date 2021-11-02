import java.io.IOException;
import java.lang.InterruptedException;


public class Spielbrett{

  public final static char wasser = '~';
  public final static char missed_boat = 'o';
  public final static char hit_boat = 'x';



public static void refresh(){

try{
  if (Spielbrett.getSystem().equals("Windows")){

    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

  }

  else{
    new ProcessBuilder("clear").inheritIO().start().waitFor();
  }
}

catch(IOException i){

}

catch(InterruptedException e){

}


}

public static String getSystem(){

return System.getProperty("os.name");

}
}
