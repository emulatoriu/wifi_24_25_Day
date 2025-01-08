package org.example;

public class Main {

    // Die möglichen Bewegungen eines Springers
    private static final int[][] knightMoves = {
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1},
            {2, 1}, {1, 2}, {-1, 2}, {-2, 1}
    };

    public static boolean isSafeKnights(int[][] board) {
        int n = 8;  // Die Größe des Schachbretts (8x8)

        // Gehe alle Felder des Schachbretts durch
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                // Wenn ein Springer auf dem aktuellen Feld ist
                if (board[row][col] == 1) {
                    // Überprüfe alle möglichen Bewegungen des Springers
                    for (int[] move : knightMoves) {
                        int newRow = row + move[0];
                        int newCol = col + move[1];

                        // Prüfe, ob die neue Position innerhalb des Schachbretts ist
                        if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n) {
                            // Wenn ein anderer Springer auf der neuen Position ist, return false
                            if (board[newRow][newCol] == 1) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        // Wenn kein Springer einen anderen fressen kann, return true
        return true;
    }

    public static void main(String[] args) {
        // Beispiel Schachbrett
        int[][] board = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        // Aufruf der Funktion und Ausgabe des Ergebnisses
        System.out.println(isSafeKnights(board));  // Sollte true ausgeben, da kein Springer einen anderen fressen kann.
    }
}
