import java.io.IOException;
import java.util.ArrayList;

public class University {
    private ArrayList<Personnel> personnel = new ArrayList<Personnel>();
    public University(String pathP, String pathM) throws IOException{
        /* reads given pathP and pathM, then creates each personnel objects.
        writes attributes of each personnel into "registrationNumber.txt" files.
        */
        ArrayList<String> lines = FileIO.reader(pathP);
        ArrayList<String> weeks = FileIO.reader(pathM); 
        createPersonnel(lines);
        
        for (String weekL:weeks){
            String[] week = weekL.split("\t");          
            int week1 = Integer.valueOf(week[1]);
            int week2 = Integer.valueOf(week[2]);
            int week3 = Integer.valueOf(week[3]);
            int week4 = Integer.valueOf(week[4]);
            int[] timeWeekly = {week1,week2,week3,week4}; // consists of weekly working hours.
            for (Personnel person:personnel){
                if (person.getRegistration().equals(week[0])){
                    person.Salary(timeWeekly);
                    FileIO.writer(week[0],person);
                }      
        }
        }
   }
    private void createPersonnel(ArrayList<String> lines) {
        //  reads given lines and creates objects which are suitable for each personnel.
        for (String line:lines){
        String[] person = line.split("\t");
        int start = Integer.valueOf(person[4]);
	switch (person[2].charAt(0)) {
        case 'W' : personnel.add(new Worker(person[0],person[1],person[2],person[3],start));
		break;
        case 'R' : personnel.add(new ResearchAssistant(person[0],person[1],person[2],person[3],start));       
		break;
        case 'P' : personnel.add(new PartTime(person[0],person[1],person[2],person[3],start));
  		break;          
        case 'F' : personnel.add(new FacultyMember(person[0],person[1],person[2],person[3],start));
 		break;
        case 'S' : personnel.add(new Security(person[0],person[1],person[2],person[3],start));          
		break;
        case 'O' : personnel.add(new Officer(person[0],person[1],person[2],person[3],start));        
		break;
        case 'C' : personnel.add(new Chief(person[0],person[1],person[2],person[3],start));
		break;
	}
   }   
    }
}