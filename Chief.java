public class Chief extends FullTime {

    public Chief(String name, String surname, String reg, String position, int start) {
        super(name, surname, reg, position, start);
    }   
    @Override
    public void Salary(int[] weeks) {
        int salary = 0;
        for(int week:weeks){
            if (week-40 <= 8)
                salary += ((week-40) * 15);
            else
                salary += (8 * 15);     
        }
        setTotal(salary + (125 *20));
    }
}