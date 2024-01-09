
import java.util.Comparator;
import java.util.function.Predicate;


public class StudentFilters // A class to contain all filters that could be needed to search through the student databases
{
    // Functions that return a predicate relating to the student.firstName() attribute
    public static Predicate<Student> hasFirstName(String firstName) { // Checks if the firstName is...
        return student -> student.firstName().equals(firstName);
    }

    public static Predicate<Student> firstNameStartsWith(String prefix) { // Checks if a firstName starts with...
        return student -> student.firstName().startsWith(prefix);
    }

    public static Predicate<Student> firstNameEndsWith(String suffix) { // Checks if a firstName ends with...
        return student -> student.firstName().endsWith(suffix);
    }

    public static Predicate<Student> firstNameContains(String keyword) { // Checks if a firstName contains...
        return student -> student.firstName().contains(keyword);
    }
    //////////////////////////////////////
    //////////////////////////////////////

    // Functions that return a predicate relating to student.lastName() attribute
    public static Predicate<Student> hasLastName(String lastName) { // Checks if the lastName is...
        return student -> student.lastName().equals(lastName);
    }

    public static Predicate<Student> lastNameStartsWith(String prefix) { // Checks if a lastName starts with...
        return student -> student.lastName().startsWith(prefix);
    }

    public static Predicate<Student> lastNameEndsWith(String suffix) { // Checks if a lastName ends with...
        return student -> student.lastName().endsWith(suffix);
    }

    public static Predicate<Student> lastNameContains(String keyword) { // Checks if a lastName contains...
        return student -> student.lastName().contains(keyword);
    }
    //////////////////////////////////////
    //////////////////////////////////////

    // Functions that return a predicate relating to the student.age() attribute
    public static Predicate<Student> isAgeEqualTo(int age){ // cehsk to see if age is equal to
    	return student -> student.age() == age;
    }
    public static Predicate<Student> isAgeGreaterThan(int age) { // Checks if an age is greater than...
        return student -> student.age() > age;
    }

    public static Predicate<Student> isAgeLessThan(int age) { // Checks if an age is less than..
        return student -> student.age() < age;
    }
 
    public static Predicate<Student> isAgeBetween(int minAge, int maxAge) { // Checks if an age is between... Can be used to check if an age is equal to also. For example someone is 20 will have their age between 20 and 20.
        return student -> student.age() >= minAge && student.age() <= maxAge;
    }
    //////////////////////////////////////
    //////////////////////////////////////
    
    // Predicate relating to student.Course() attribute (which is an enum)
    public static Predicate<Student> hasCourse(Course course) { // Checks if a student is on a course
        return student -> student.course() == course;
    }
    //////////////////////////////////////
    //////////////////////////////////////
    
    // Functions that return a predicate relating to student.CourseType() attribute (also an enum)
    public static Predicate<Student> hasCourseType(CourseType courseType) { // Checks if a student's course is undergrad, grad or postgrad
        return student -> student.courseType() == courseType;
    }
    //////////////////////////////////////
    //////////////////////////////////////
    
    // Functions that return a predicate relating to student.studentID attribute (which is stored as a string not an integer because realistically im going to be comparing to things like it's a string)(even though its a number :))
    public static Predicate<Student> hasStudentID(String studentID) { // Checks if the student ID is equal to...
        return student -> student.studentID().equals(studentID);
    }

    public static Predicate<Student> studentIDStartsWith(String prefix) { // Checks if a student ID starts with...
        return student -> student.studentID().startsWith(prefix);
    }

    public static Predicate<Student> studentIDEndsWith(String suffix) { // Checks if a student ID ends with...
        return student -> student.studentID().endsWith(suffix);
    }

    public static Predicate<Student> studentIDContains(String keyword) { // Checks if a student ID contains...
        return student -> student.studentID().contains(keyword);
    }
    //////////////////////////////////////
    //////////////////////////////////////
    
    // FUnctions that return a predicate relating to student.moduleMarks (which is a Map<Module, Integer>)
    
    public static Predicate<Student> hasModule(Module module){
    	return student -> student.moduleMarks().containsKey(module);
    }
    
    public static Predicate<Student> markEqualTo(Module module, int mark){
    	return student -> student.moduleMarks().get(module).equals(mark);
    }
    
    public static Predicate<Student> markLessThan(Module module, int mark){
    	return student -> student.moduleMarks().get(module) < (mark);
    }
    
    public static Predicate<Student> markGreateraThan(Module module, int mark){
    	return student -> student.moduleMarks().get(module) > (mark);
    }
    
    public static Predicate<Student> markBetween(Module module, int minMark, int maxMark){
    	return student -> student.moduleMarks().get(module) >= minMark && student.moduleMarks().get(module) <= maxMark;
    }
    
    
    
    public static Comparator<Student> markComparator(Module module){ // takes a module as an argument and returns Comparator<Student> that compares students based on the marks of the specified module
    	return Comparator.comparingInt(student -> student.moduleMarks().getOrDefault(module, 0)); // compares marksfor specified module
    }
    
    public static Predicate<Student> orderByMarkAscending(Module module){
    	Comparator<Student> comparator = markComparator(module);
    	
    	return student -> true; // predicate is used for sorting not filtering so they always return true
    }
    
    public static Predicate<Student> orderByMarkDescending(Module module){
    	Comparator<Student> comparator = markComparator(module).reversed(); 
    	
    	return student -> true;// predicate is used for sorting not filtering so they always return true
    }
}
