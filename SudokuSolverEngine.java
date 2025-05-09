
public class SudokuSolverEngine {

   public static void main(String[] args) {
      // Here I have called my class `MySudokuBoard` if you named your class
      // differently, modify the line below to use your own class name
      MySudokuBoard board = new MySudokuBoard("boards/very-fast-solve.sdk");
      System.out.println("Initial board");
      System.out.println(board);
      System.out.println();

      System.out.print("Solving board...");
      long start = System.currentTimeMillis();
      board.solve();
      long stop = System.currentTimeMillis();
      System.out.printf("SOLVED in %.3f seconds.\n", ((stop-start)/1000.0));
      System.out.println();
      System.out.println(board);
      
   }
   

}

/*
 Initial board
 X 3 4 6 7 8 9 1 2 
 X 7 2 1 9 5 3 4 8 
 1 9 8 3 4 2 5 6 7 
 X X 9 X 6 1 4 2 3 
 X 2 6 8 5 3 7 9 1 
 X 1 3 9 2 4 X 5 6 
 X 6 1 5 3 7 2 8 4 
 X 8 X 4 1 9 6 3 5 
 3 4 5 X 8 6 1 7 9 
 
 
 Solving board...SOLVED in 0.860 seconds.
 
 5 3 4 6 7 8 9 1 2 
 6 7 2 1 9 5 3 4 8 
 1 9 8 3 4 2 5 6 7 
 8 5 9 7 6 1 4 2 3 
 4 2 6 8 5 3 7 9 1 
 7 1 3 9 2 4 8 5 6 
 9 6 1 5 3 7 2 8 4 
 2 8 7 4 1 9 6 3 5 
 3 4 5 2 8 6 1 7 9 
 */