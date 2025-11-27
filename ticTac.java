import java.util.Scanner; 

public class ticTac
{
    public static void main ( String [] args){

        Scanner coor  = new Scanner (System.in); 
        boolean playAgain = true;

        while (playAgain) {      

            int rNum = 1; 
            int f = 0; 
            String XorO = ""; 
            boolean WorL = false; 
            String XorOturn = "X";
            int [][] grid  = new int [3][3];   

            while (!WorL) {      

               
                if (rNum % 2 == 0){
                    XorOturn = "O";   
                    f = 2;
                } else {
                    XorOturn = "X"; 
                    f = 1;
                }

              
                System.out.println("Round " + rNum); 

                
                for (int row = 0; row < 3; row++){
                    for (int col = 0; col < 3; col++){
                        XorO = getSymbol(grid[row][col]);
                        System.out.print("[" + XorO + "]"); 
                    }
                    System.out.println();
                }

                
                System.out.print(XorOturn + ", make your move (row, col): "); 
                String c = coor.nextLine(); 

                int rowXcoor = Integer.parseInt(c.substring(0, 1)); 
                int colXcoor = Integer.parseInt(c.substring(2, 3));

                
                while (grid[rowXcoor][colXcoor] != 0) {
                    System.out.print("Please choose a valid coordinate (row, col): ");
                    c = coor.nextLine();
                    rowXcoor = Integer.parseInt(c.substring(0, 1)); 
                    colXcoor = Integer.parseInt(c.substring(2, 3));
                }

              
                grid[rowXcoor][colXcoor] = f;  
                rNum++; 

               
                if (checkWin(grid)) {
                    System.out.println(XorOturn + " wins!");
                    WorL = true;
                }
            }

            
            System.out.print("Play Again? Y/N: ");
            String b = coor.nextLine();

            playAgain = b.equals("Y");
        }

        System.out.println("Thanks for playing!");
    }


    public static String getSymbol(int f) {
        if ( f == 0 ) return " "; 
        if ( f == 1 ) return "X"; 
        return "O"; 
    }


    public static boolean checkWin(int[][] grid) {

        
        for (int r = 0; r < 3; r++){
            if (grid[r][0] != 0 && grid[r][0] == grid[r][1] && grid[r][1] == grid[r][2]) {
                return true;
            }
        }

        
        for (int c = 0; c < 3; c++){
            if (grid[0][c] != 0 && grid[0][c] == grid[1][c] && grid[1][c] == grid[2][c]) {
                return true;
            }
        }

        
        if (grid[0][0] != 0 && grid[0][0] == grid[1][1] &&  grid[1][1] == grid[2][2]) {
            return true;
        }

        
        if (grid[0][2] != 0 && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
            return true;
        }

        return false;
    }
}
