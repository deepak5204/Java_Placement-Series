package Recursion;

public class PartyInvition {
    public static int partyInvition(int n) {
        if (n <= 1) {
            return 1;
        }

        int single = partyInvition(n - 1);
        int pair = partyInvition(n - 1) + partyInvition(n - 2);
        return single + pair;

    }

    public static void main(String[] args) {
        int n = 4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ;
        int noOfWays = partyInvition(n);
        System.out.println("No of ways of invition : " + noOfWays);

    }
}
