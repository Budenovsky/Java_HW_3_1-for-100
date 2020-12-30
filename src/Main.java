public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int depositAmount = 1006;
        int bonusRubles;
        if (depositAmount > 1000) {
            bonusRubles = depositAmount / 100;
        } else {
            bonusRubles = 0;
        }
        int total = currentBalance + depositAmount + bonusRubles;
        System.out.println(total);
    }
}