public class Security extends Personnel {
    public static final int TRANS_MONEY = 5;
    public static final int FOOD_MONEY = 10;

    public Security(String name, String surname, String reg, String position, int start) {
        super(name, surname, reg, position, start);
    }
    @Override
    public void Salary(int[] weeks) {
        int total = 0;
        for (int week:weeks) {
            if (week >= 30 && week <= 54)
                total += week * 10 + 6 * (TRANS_MONEY + FOOD_MONEY);
            else if (week > 54 )
                total += 54 * 10 + 6 * (TRANS_MONEY + FOOD_MONEY);
        }
        super.setTotal(total);
    }
}