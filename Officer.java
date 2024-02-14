public class Officer extends Personnel{
    private final int SS_BENEFITS = Academician.BASE_SALARY * 65 / 100;

    public Officer(String name, String surname, String reg, String posiiton, int start) {
        super(name, surname, reg, posiiton, start);
    }
    @Override
    public void Salary(int[] weeks) {
        int salary = 0 ;
        for (int week:weeks) {
            if (week-40 <= 10)
                salary += 20 * (week-40);
            else if (week -40 > 10)
                salary += 10 * 20;
        }
        setTotal(salary + SS_BENEFITS + Academician.BASE_SALARY);
    }
}