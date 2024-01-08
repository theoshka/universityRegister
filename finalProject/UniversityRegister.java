
import java.util.*;
import java.util.stream.*;
import java.util.function.*;


public class UniversityRegister // A class to deal with starting queries and storing the students
{
    private List<Student> students; // List that stores all students
    
    public UniversityRegister()  //constructer that initialises the students list
    {
        this.students = new ArrayList<>();      
    }
    
    public void addStudents(Student... newStudents){ // method to add a students. simpler to use OOP 
        students.addAll(List.of(newStudents));    //using the add all method to add the contents of a container onto the end of a prexisting list
        
        
        /*  functional approach to adding students
        List<Student> updatedStudents = Arrays.stream(newStudents)
        		.collect(Collectors.toList());
        List<Student> combinedList = Stream.concat(students.stream(), updatedStudents.stream())
        		.collect(Collectors.toList());        
        students = combinedList; 
        */
    }
    
    public void removeStudentsByFirstName(String... namesToRemove){ // removing a list<string> of students from the students list by their first name
        students.removeIf(student -> List.of(namesToRemove).contains(student.firstName()));
    }
    
    public void removeStudentsByLastName(String... namesToRemove){ // removing a list<string> of students from the students list by their last name
        students.removeIf(student -> List.of(namesToRemove).contains(student.lastName()));
    }
    
    public void removeStudentsByID(String... namesToRemove){ // removing a list<string> of students from the students list by their ID
        students.removeIf(student -> List.of(namesToRemove).contains(student.studentID()));
    }
    
    // Method to query the students list with prewritten predicates (or your own up to you)
    public List<Student> filterStudents(Predicate<Student>... predicates){
        Predicate<Student> combinedPredicate = Stream.of(predicates) // combining the predicate using stream API
                .reduce((pred1, pred2) -> pred1.and(pred2))          // and the .reduce() method to combine them
                .orElse(student -> true); // if no predicates are probided it defaults to true	
  
        return students.stream() // start the stream on the student 'database'
            .filter(combinedPredicate) // filter by the combined predicate made using .reduce
            .collect(Collectors.toList()); // collect the filtered students to a list and return it
    }
    
    public boolean exists(String studentID) { // checks to see if the student exists
    	return students.stream()
    			.anyMatch(student -> student.studentID().equals(studentID)); // made kinda for debugging purposes
    }
    
    public double averageMark(String studentID) {
    	 Optional<Student> s = students.stream()  //using Optional because maybe the specified student doesnt exist
    			.filter(student -> student.studentID().equals(studentID))
    			.findFirst(); //gets the first student that matches the student ID
    	
    	if (s.isPresent()) //checks to see if the student actually exists, if not then it returns -1.o
    	{
    		Map<Module, Integer> moduleMarks = s.get().moduleMarks(); // gets the actual Student object from the Optional<Student> so i can fetch the Map<Module, Integer> from the student object
    		if (!moduleMarks.isEmpty()) // makes sure the map isn't empty
    		{
    			return moduleMarks.values().stream() // I only need the values (the mark) from the map so I use .values()
        				.mapToInt(integer -> integer.intValue()) // converts from the Integer object to int primitive datatype
        				.average()
    					.orElse(0.0); // if the average is present it returns it, otherwise it'll return 0, kinda useful for debugging
    		}
    	}
    	
    	return -1.0;
    }
}
