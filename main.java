


class main{

  public static void main(String... args){

    String eingabe="";

    Spielbrett feld = new Spielbrett(8);

    do{

      Spielbrett.refresh();
      for(int i=0;i<2;i++){
        System.out.println();
      }
      feld.printSpielfeld(4);
      eingabe = new java.util.Scanner(System.in).next();

    }
      while (!(eingabe.equals("quit")));



  }
}
