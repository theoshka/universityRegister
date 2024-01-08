import java.util.Map;

public record Student(String firstName, String lastName, int age, Course course, CourseType courseType, String studentID, Map<Module, Integer> moduleMarks)
{}