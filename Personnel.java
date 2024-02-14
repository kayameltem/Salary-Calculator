public abstract class Personnel {
    private String name ;
    private String surname;
    private String registration;
    private String position;
    private int start = 0;
    private int total ; // total salary
    private int SEVERENCE ;
    public abstract void Salary(int[] weeks); // calculates total salary for each personnel
    
    public Personnel(String name,String surname,String reg, String position,int start) {
    this.name = name;
    this.surname = surname;
    this.position = position;
    registration = reg;
    this.start = start;
    SEVERENCE = (2020-start) * 20 * 8 / 10 ;
    total += SEVERENCE;
    }
    public String Display() {
        // returns attributes of personnel
        return String.format("Name : %s\nSurname : %s\nRegistration Number : %s"
                + "\nPosition : %s\nYear of Start : %d\nTotal Salary : %d.00 TL\n"
                ,name,surname,registration,position,start,total);
    }
    public String getRegistration() {
        return registration;
    }
    public void setTotal(int total) {
        this.total += total;
    }  
}