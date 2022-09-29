public class Main {
    public class RPSGame {

        public static void main(String[] args) {

            String playerA = "R";
            String playerB = "R";


            if (playerA.equalsIgnoreCase("R")) {
                //playerB code agains the Player A Rock Move
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock. It's a Tie");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Rock vs Paper. Player B wins");
                } else //player B must be scissors
                {
                    System.out.println("Rock vs Scissors. Player A wins");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                //playerB code agains the Player A Rock Move
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper vs Rock. Player A wins");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper. Its a Tie");
                } else //player B must be scissors
                {
                    System.out.println("Paper vs Scissors. Player A wins");
                }

            } else //player A is scissors
            {
                //playerB code agains the Player A Rock Move
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Scissors vs Rock. Player B wins");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors vs Paper. Player A wins");
                } else //player B must be scissors
                {
                    System.out.println("Scissors vs Scissors. Its a Tie");
                }
            }
        }
    }
}

