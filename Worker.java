public class Worker extends FullTime{

    public Worker(String name, String surname, String reg, String position, int start) {
        super(name, surname, reg, position, start);
    }
    @Override
    public void Salary(int[] weeks) {
        int salary = 0;
        for (int week:weeks){
            if (week-40 <= 10)
                salary += ((week-40) * 11); 
            else
                salary += (10 * 11);
        }
        setTotal(salary + (105 * 20));
    }   
}