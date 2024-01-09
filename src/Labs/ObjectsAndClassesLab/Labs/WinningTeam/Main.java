package Labs.ObjectsAndClassesLab.Labs.WinningTeam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Team team = new Team();
        System.out.println("Enter team name:");
        String name = scnr.next();
        System.out.println("Enter team wins:");
        int wins = scnr.nextInt();
        System.out.println("Enter team losses:");
        int losses = scnr.nextInt();

        team.setName(name);
        team.setWins(wins);
        team.setLosses(losses);

        team.printStanding();
    }
}
