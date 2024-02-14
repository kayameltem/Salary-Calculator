public class PartTime extends Employee{

    public PartTime(String name, String surname, String reg, String position, int start) {
        super(name, surname, reg, position, start);
    }
    @Override
    public void Salary(int[] weeks) {
        int salary = 0 ;
        for (int week:weeks) {
            if (week >= 10 && week <= 20)
                salary += 18 * week;
            else if (week > 20)
                salary += 20 * 18; 
        }
        setTotal(salary);
    }    
}