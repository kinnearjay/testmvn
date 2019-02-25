public class Blackjack {

    public static String play(int p, int d){
        String winner = "";
        if(p >21 && d >21){
            winner = "0";

        }else if( p>21 && d<22){
            winner = "d";

        }else if(p<22&& d>21){
            winner = "p";

        }else if(p>d){
            winner="p";
        }else if(d>p){
            winner="d";
        }

        if((p >31 || d >31 )){
            winner = "-1";

        }


        return winner;
    }

}
