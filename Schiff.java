public class Schiff{

    boolean[] s = {false,false,false,false};
    // 1. zwei int x und y 2. x und y Koordinaten speichern

    int x, y;
    int length;
    boolean waagrecht;

    public Schiff(int a, int b, int c){

        x = a;
        y = b;
        length = c;
        waagrecht = true;

    }

    public Schiff(){
    }

    public boolean hit(int bx, int by){

      for(int i=0;i<length;i++){

        if(waagrecht){

          if (bx == x+i && by == y){

            s[i] = true;

            return true;
          }

        }

      }

      return false;

    }

    public void lage(int a, int b){
      //  (int)(Math.random()*100%length)
    }
}
