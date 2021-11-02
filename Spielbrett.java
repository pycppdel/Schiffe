import java.io.IOException;
import java.lang.InterruptedException;


public class Spielbrett{

  public final static char wasser = '~';
  public final static char missed_boat = 'o';
  public final static char hit_boat = 'x';

  public char[][] feld;
  public int lng;

  public Spielbrett(int l){

    lng = l;

    feld = new char[lng][lng];

    for(int i=0;i<lng;i++){
      for(int z=0;z<lng;z++){

        feld[i][z] = Spielbrett.wasser;

      }
    }
  }

  public void printSpielfeld(int insert){

    String white = " ";
    for(int g=0;g<insert;g++){
      white += " ";
    }

    for(int i=0;i<lng;i++){
      System.out.print(white);
      System.out.print(""+(lng-i)+white);
      for(int z=0;z<lng;z++){

        System.out.print(feld[i][z] + " ");

      }
      System.out.println();
    }

    for(int i=0;i<2;i++){
      System.out.println();
    }

    System.out.print(white+white+" ");
    for(int i=0;i<lng;i++){
      System.out.print(((char)('A'+i))+" ");
    }
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.print(white+"Choose your field: ");

  }



public static void refresh(){

try{
  if (Spielbrett.getSystem().equals("Windows 10")){

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
