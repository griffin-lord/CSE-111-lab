import java.util.Scanner;
public class TreasureHuntGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] grid = {{0, 0, -1, 0}, {7, 0, 0, -1},{0, 10, 0, 0},{0, 0, 0, 0}};
        int playRow = 1;
        int playCol = 0;
        int moves = 5;
        while (moves> 0) {
            System.out.println("Current Grid:");
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Moves left: " + moves);
            System.out.print("Enter your move (UP/DOWN/LEFT/RIGHT): ");
            String move=sc.nextLine().toUpperCase();
            if (move.equals("UP")) {
                playRow--;
            } 
            else if (move.equals("DOWN")) {
                playRow++;
            } 
            else if (move.equals("LEFT")) {
                playCol--;
            } 
            else if (move.equals("RIGHT")) {
                playCol++;
            } 
            else {
                System.out.println("Invalid move. Try again.");
                continue;
            }
            if (playRow < 0 || playRow >= grid.length || playCol<0 || playCol>= grid[0].length) {
                System.out.println("You moved outside the grid. Game over!");
                break;
            }
            if (grid[playRow][playCol] == -1) {
                System.out.println("You stepped on a mine. Game over!");
                break;
            }
            if (grid[playRow][playCol] == 10) {
                System.out.println("Congratulations! You found the treasure!");
                break;
            }
            grid[1][0] = 0;
            grid[playRow][playCol] = 7;
            moves--;
            if (moves == 0) {
                System.out.println("Out of moves. Game over!");
            }
        }
    }
}

