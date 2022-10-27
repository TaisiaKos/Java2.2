public class Main {
    public static void main(String[] args) {
        int money = 1000;
        int refill = 3000;
        int fullMoney = (money + refill);
        System.out.println(fullMoney);
        int bonus;
        if (refill > 1000) {
            bonus = (refill / 100);
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
