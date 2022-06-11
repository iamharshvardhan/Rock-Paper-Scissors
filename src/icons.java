public class icons {
    
    public static String rock = """
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
""";
    public static String paper = """
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
""";
    public static String scissors = """
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
""";

    public static void showHand(int x) {
        if (x == 0) {
            System.out.println(rock);
        }
        else if (x == 1) {
            System.out.println(paper);
        }
        else if (x == 2) {
            System.out.println(scissors);
        }
    }

}
