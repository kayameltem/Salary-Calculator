class FacultyMember extends Academician{
    private final int SS_BENEFITS ;
    public FacultyMember(String name, String surname, String reg,String position, int start) {
        super(name,surname,reg,position,start);
        SS_BENEFITS = BASE_SALARY * 135 / 100;
    }
    @Override
    public void Salary(int[] weeks) {
        int fee = 0;
        for (int week:weeks){
            if (week - 40 > 8)
                fee += 8 * 20;
            else
                fee += (week-40) * 20;           
        }
        setTotal(BASE_SALARY+SS_BENEFITS+fee);
    }
}
