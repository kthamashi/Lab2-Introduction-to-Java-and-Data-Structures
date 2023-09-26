/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thamashikumarasinghe
 */
public class HackerRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Read the number of lines (n)
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        // Read n lines of integers and store them in ArrayLists
        for (int i = 0; i < n; i++) {
            String[] lineTokens = scanner.nextLine().split(" ");
            int d = Integer.parseInt(lineTokens[0]);
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 1; j <= d; j++) {
                line.add(Integer.valueOf(lineTokens[j]));
            }
            lines.add(line);
        }

        // Read the number of queries (q)
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Process queries and print results
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x <= lines.size() && y <= lines.get(x - 1).size()) {
                System.out.println(lines.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }

}
