
import java.util.*;

public class Main
{
    public static void main(String[] args){
        UniversityRegister universityRegister = new UniversityRegister();
        
        universityRegister.addStudents(                
                new Student("John", "Doe", 20, Course.COMPUTER_SCIENCE, CourseType.UNDERGRADUATE, "12345",
                        Map.of(Module.CS101, 78, Module.CS102, 92, Module.CS103, 85)),
                
                new Student("Alice", "Smith", 22, Course.HISTORY, CourseType.GRADUATE, "67890",
                        Map.of(Module.HIST101, 56, Module.HIST102, 61, Module.HIST103, 58)),
                
                new Student("Ethan", "Johnson", 21, Course.ENGINEERING, CourseType.UNDERGRADUATE, "13579",
                        Map.of(Module.ENG101, 74, Module.ENG102, 78, Module.ENG103, 76)),
                
                new Student("Olivia", "Brown", 23, Course.POLITICAL_SCIENCE, CourseType.GRADUATE, "24680",
                        Map.of(Module.POL101, 70, Module.POL102, 73, Module.POL103, 68)),
                
                new Student("Liam", "Miller", 20, Course.MEDICINE, CourseType.UNDERGRADUATE, "11223",
                        Map.of(Module.MED101, 85, Module.MED102, 88, Module.MED103, 83)),
                
                new Student("Emma", "Wilson", 22, Course.ENGLISH_LITERATURE, CourseType.GRADUATE, "33445",
                        Map.of(Module.LIT101, 65, Module.LIT102, 70, Module.LIT103, 68)),
                
                new Student("Ava", "Jones", 21, Course.PHILOSOPHY, CourseType.UNDERGRADUATE, "55667",
                        Map.of(Module.PHIL101, 46, Module.PHIL102, 50, Module.PHIL103, 48)),
                
                new Student("Noah", "Taylor", 23, Course.PSYCHOLOGY, CourseType.GRADUATE, "77889",
                        Map.of(Module.PSYCH101, 66, Module.PSYCH102, 72, Module.PSYCH103, 68)),
                
                new Student("Sophia", "Martin", 20, Course.BIOLOGY, CourseType.UNDERGRADUATE, "99001",
                        Map.of(Module.BIO101, 90, Module.BIO102, 85, Module.BIO103, 92)),
                
                new Student("Jackson", "Lee", 22, Course.ARCHAEOLOGY, CourseType.GRADUATE, "11223",
                        Map.of(Module.ARCH101, 46, Module.ARCH102, 51, Module.ARCH103, 49)),
                
                new Student("Mia", "Harris", 21, Course.ART_HISTORY, CourseType.UNDERGRADUATE, "33445",
                        Map.of(Module.ART101, 64, Module.ART102, 70, Module.ART103, 66)),
                
                new Student("Lucas", "Clark", 23, Course.PHYSICS, CourseType.GRADUATE, "55667",
                        Map.of(Module.PHYS101, 86, Module.PHYS102, 88, Module.PHYS103, 82)),
                
                new Student("Amelia", "Lewis", 20, Course.GEOGRAPHY, CourseType.UNDERGRADUATE, "77889",
                        Map.of(Module.GEO101, 71, Module.GEO102, 76, Module.GEO103, 73)),
                
                new Student("Aiden", "Young", 22, Course.MUSIC, CourseType.GRADUATE, "99001",
                        Map.of(Module.MUSIC101, 46, Module.MUSIC102, 51, Module.MUSIC103, 49)),
                
                new Student("Harper", "King", 21, Course.CHEMISTRY, CourseType.UNDERGRADUATE, "11223",
                        Map.of(Module.CHEM101, 90, Module.CHEM102, 86, Module.CHEM103, 93)),
                
                new Student("Evelyn", "Ward", 23, Course.MODERN_LANGUAGES, CourseType.GRADUATE, "33445",
                        Map.of(Module.MODLANG101, 66, Module.MODLANG102, 72, Module.MODLANG103, 68)),
                
                new Student("Logan", "Evans", 20, Course.MATHEMATICS, CourseType.UNDERGRADUATE, "55667",
                        Map.of(Module.MATH101, 76, Module.MATH102, 83, Module.MATH103, 78)),
                
                new Student("Grace", "Parker", 22, Course.LAW, CourseType.GRADUATE, "77889",
                        Map.of(Module.LAW101, 66, Module.LAW102, 72, Module.LAW103, 68)),
                
                new Student("Liam", "Anderson", 20, Course.ENGINEERING, CourseType.UNDERGRADUATE, "12346",
                        Map.of(Module.ENG101, 75, Module.ENG102, 80, Module.ENG103, 78)),
                
                new Student("Olivia", "Smith", 22, Course.POLITICAL_SCIENCE, CourseType.GRADUATE, "67891",
                        Map.of(Module.POL101, 47, Module.POL102, 52, Module.POL103, 50)),
                
                new Student("Noah", "Johnson", 21, Course.MEDICINE, CourseType.UNDERGRADUATE, "13580",
                        Map.of(Module.MED101, 84, Module.MED102, 88, Module.MED103, 82)),
                
                new Student("Emma", "Brown", 23, Course.ENGLISH_LITERATURE, CourseType.GRADUATE, "24681",
                        Map.of(Module.ENGLIT101, 63, Module.ENGLIT102, 69, Module.ENGLIT103, 66)),
                
                new Student("Ava", "Taylor", 20, Course.PHILOSOPHY, CourseType.UNDERGRADUATE, "11224",
                        Map.of(Module.PHIL101, 49, Module.PHIL102, 54, Module.PHIL103, 52)),
                
                new Student("Sophia", "Thomas", 22, Course.BIOLOGY, CourseType.GRADUATE, "33446",
                        Map.of(Module.BIO101, 78, Module.BIO102, 82, Module.BIO103, 80)),
                
                new Student("Jackson", "Williams", 21, Course.ARCHAEOLOGY, CourseType.UNDERGRADUATE, "55668",
                        Map.of(Module.ARCH101, 54, Module.ARCH102, 58, Module.ARCH103, 56)),
                
                new Student("Logan", "Martin", 23, Course.PHYSICS, CourseType.GRADUATE, "77890",
                        Map.of(Module.PHYS101, 84, Module.PHYS102, 87, Module.PHYS103, 82)),
                
                new Student("Amelia", "Moore", 20, Course.GEOGRAPHY, CourseType.UNDERGRADUATE, "99002",
                        Map.of(Module.GEO101, 67, Module.GEO102, 72, Module.GEO103, 69)),
                
                new Student("Lucas", "Hill", 22, Course.MUSIC, CourseType.GRADUATE, "11225",
                        Map.of(Module.MUSIC101, 52, Module.MUSIC102, 58, Module.MUSIC103, 55)),
                
                new Student("Evelyn", "Adams", 21, Course.MODERN_LANGUAGES, CourseType.UNDERGRADUATE, "33447",
                        Map.of(Module.MODLANG101, 78, Module.MODLANG102, 82, Module.MODLANG103, 80)),
                
                new Student("Ethan", "Baker", 23, Course.COMPUTER_SCIENCE, CourseType.GRADUATE, "55669",
                        Map.of(Module.CS101, 45, Module.CS102, 50, Module.CS103, 48)),
                
                new Student("Mia", "Ward", 20, Course.MATHEMATICS, CourseType.UNDERGRADUATE, "77891",
                        Map.of(Module.MATH101, 74, Module.MATH102, 79, Module.MATH103, 76)),
                
                new Student("Harper", "Harrison", 22, Course.LAW, CourseType.GRADUATE, "99003",
                        Map.of(Module.LAW101, 59, Module.LAW102, 64, Module.LAW103, 62)),
                
                new Student("Aiden", "Fisher", 21, Course.HISTORY, CourseType.UNDERGRADUATE, "11226",
                        Map.of(Module.HIST101, 65, Module.HIST102, 70, Module.HIST103, 68)),
                
                new Student("Luna", "Turner", 23, Course.ART_HISTORY, CourseType.GRADUATE, "33448",
                        Map.of(Module.ART101, 58, Module.ART102, 63, Module.ART103, 60)),
                
                new Student("Lily", "Foster", 20, Course.CHEMISTRY, CourseType.UNDERGRADUATE, "55670",
                        Map.of(Module.CHEM101, 88, Module.CHEM102, 92, Module.CHEM103, 90)),
                
                new Student("Leo", "Sullivan", 22, Course.PSYCHOLOGY, CourseType.GRADUATE, "77892",
                        Map.of(Module.PSYCH101, 68, Module.PSYCH102, 73, Module.PSYCH103, 70)),
                
                new Student("Ivy", "Barnes", 21, Course.POLITICAL_SCIENCE, CourseType.UNDERGRADUATE, "99004",
                        Map.of(Module.POL101, 52, Module.POL102, 57, Module.POL103, 55)),
                
                new Student("Owen", "Parker", 23, Course.HISTORY, CourseType.GRADUATE, "11227",
                        Map.of(Module.HIST101, 71, Module.HIST102, 76, Module.HIST103, 73))
        );
        
        
        
        
        universityRegister.addStudents(
        		new Student("Theo", "Cousin", 19, Course.COMPUTER_SCIENCE, CourseType.UNDERGRADUATE, "12345",
        				Map.of(Module.CS101, 62, Module.CS102, 55, Module.CS103, 87)));
        
        
        
        List<Student> studentMODTest = 
        		universityRegister.filterStudents(
        				StudentFilters.orderByMarkAscending(Module.HIST102),
        				StudentFilters.hasModule(Module.HIST102)				
        				);
        
        System.out.println(studentMODTest);
    }
}
