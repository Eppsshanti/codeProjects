public class RockPaperScissors1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        
        String ready = scan.nextLine();

       if (ready.equals("yes")) {
            System.out.println("Great!");
            System.out.println("\nrock - paper - scissors, shoot");
          String yourChoice = scan.nextLine();
            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);
    
        } else {
            System.out.println("Darn, some other time...!");
        }
         
        scan.close();
    }

// Function name: computerChoice - generates random selection of words rock, paper, scissors

public static String computerChoice() {
    double randomNumber = Math.random() * 3;
    int integer = (int) randomNumber;

    switch(integer){
        case 0: return "rock";
        case 1: return "paper";
        case 2: return "scissors"; 
        default: return "ERROR";
    }
}
  
// Funtion name: result - pulls computerChoice and yourChoice values and returns win or lose results
  
    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            return "You win!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            return "You win!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "You win!";
        } else if (computerChoice.equals("rock") && yourChoice.equals("scissors")) {
            return "you lose.";
        } else if (computerChoice.equals("paper") && yourChoice.equals ("rock")) {
            return "You lose.";
        } else if (computerChoice.equals("scissors") && yourChoice.equals("paper")) {
            return "You lose!";
        } else if (yourChoice.equals(computerChoice)) {
            return "It's a tie";
        } else {
            System.out.println("Invalid");
            System.exit(0);
        }
        return result;
    }
    
    
// Function name: printResult - prints the results of the game
  
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("You chose: \n" + yourChoice);
        System.out.println("Computer chose: \n" + computerChoice);
        System.out.println("Results: \n" + result);
    }
    
    
}
