package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder input = new StringBuilder(reader.readLine());
        String[] commands = reader.readLine().split(" ");

        boolean isDeadlocked = false;

        int souls = 0;
        int food= 0;
        int jumps = 0;
        int deadlocks = 0;

        int currentCell = 0;

        for (int i = 0; i <= commands.length; i++) {
            char currentChar = input.charAt(currentCell);
            if (currentChar == '@') {
                souls++;
                input.replace(currentCell, currentCell + 1, " ");
            } else if (currentChar == '*') {
                food++;
                input.replace(currentCell, currentCell + 1, " ");
            } else if (currentChar == 'x') {
                if (currentCell % 2 == 0) {
                    if (souls == 0) {
                        isDeadlocked = true;
                        break;
                    } else {
                        souls--;
                        input.replace(currentCell, currentCell + 1, "@");
                        deadlocks++;
                    }
                } else {
                    if (food == 0) {
                        isDeadlocked = true;
                        break;
                    } else {
                        food--;
                        input.replace(currentCell, currentCell + 1, "*");
                        deadlocks++;
                    }
                }
            }
            jumps++;

            if (i == commands.length) break;
            int currentJump = Integer.parseInt(commands[i]);
            currentCell = ((currentCell + currentJump) % input.length() + input.length()) % input.length();
        }
        StringBuilder printout = new StringBuilder();
        if (isDeadlocked) {
            printout.append("You are deadlocked, you greedy kitty!\n");
            printout.append("Jumps before deadlock: ").append(jumps);
        } else {
            printout.append("Coder souls collected: ").append(souls).append("\n");
            printout.append("Food collected: ").append(food).append("\n");
            printout.append("Deadlocks: ").append(deadlocks);
        }
        System.out.print(printout);

    }
}
