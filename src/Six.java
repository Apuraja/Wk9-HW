//      Display right angle triangle of @ using nested for loops in java

public class Six {
      public static void main(String[] args) {
        for (int j = 1; j <= 5; j = j +1){
            for (int i = 1; i <= j; i = i + 1){
                System.out.print( " @ ");
            }
            System.out.println();
        }
    }
}

