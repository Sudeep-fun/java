public class Main {
    public static void main(String[] args) {
       int newScore= calculateScore("Sudeep",1000);
        System.out.println("New Score is: "+newScore);
        calculateScore(200);
        calculateScore();
    }
    public static int calculateScore (String playerName, int score){
        System.out.println("Player:"+playerName+ " scored "+ score +" points");
        return score * 1000;
    }
    //Overloaded Function definition
    public static int calculateScore (int score){
        System.out.println("Unnamed Player: scored "+ score +" points");
        return score * 1000;
    }
    public static int calculateScore (){
        System.out.println("No score calculated");
        return 0;
    }
}
