import java.util.*;

 class SimGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of dots
        int n = scanner.nextInt();

        // Get the pre-decided number of sides for each polygon
        int k = scanner.nextInt();

        // Create a map to store the score of each player
        Map<Integer, Integer> playerScores = new HashMap<>();

        // Get the details of each turn
        for (int i = 0; i < n - 1; i++) {
            int player = scanner.nextInt();
            int dot1 = scanner.nextInt();
            int dot2 = scanner.nextInt();

            // Check if the two dots form a valid side of a convex polygon
            if (isSideValid(dot1, dot2, n)) {
                // Update the score of the player
                playerScores.put(player, playerScores.getOrDefault(player, 0) + 1);

                // Check if the player has formed a convex polygon of the pre-decided number of sides
                if (playerScores.get(player) >= k) {
                    // Increment the score of the player by 1
                    playerScores.put(player, playerScores.get(player) + 1);
                }
            }
        }

        // Print the score of each player
        for (int player : playerScores.keySet()) {
            System.out.println(player + ": " + playerScores.get(player));
        }
    }

    // Checks if the two dots form a valid side of a convex polygon
    private static boolean isSideValid(int dot1, int dot2, int n) {
        // Check if the two dots are different
        if (dot1 == dot2) {
            return false;
        }

        // Normalize dots to ensure dot1 is less than dot2
        int temp;
        if (dot1 > dot2) {
            temp = dot1;
            dot1 = dot2;
            dot2 = temp;
        }

        // Check if the two dots are connected by a line segment
        return (dot2 - dot1 == 1) || (dot1 == 0 && dot2 == n - 1);
    }
}