


class main{

  public static void main(String... args){

    String eingabe="";

    do{

      Spielbrett.refresh();
      eingabe = new java.util.Scanner(System.in).next();

    }
      while (!(eingabe.equals("quit")));



  }
}
