import java.util.Map;

public record Student
(
		String firstName, // Variables to store names age
		String lastName,
		int age,
		Course course,  // using an enum
		CourseType courseType, 
		String studentID,
		Map<Module, Integer> moduleMarks // map to store the module as the key and the mark and the value
)
{}