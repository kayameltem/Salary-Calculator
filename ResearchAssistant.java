class ResearchAssistant extends Academician {
    private final int SS_BENEFITS ;
    public ResearchAssistant(String name, String surname, String reg, String position, int start) {
        super(name,surname,reg,position,start);
        SS_BENEFITS = BASE_SALARY * 105 / 100;
    }
    @Override
    public void Salary(int[] weeks) {
        setTotal(SS_BENEFITS+BASE_SALARY);
    }
}