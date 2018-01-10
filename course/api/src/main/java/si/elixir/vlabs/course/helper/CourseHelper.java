package si.elixir.vlabs.course.helper;

import si.elixir.vlabs.course.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseHelper {

    private static List<Course> courses = new ArrayList<>(Arrays.asList(
            new Course(10233, "Unix/Linux CMD", new ArrayList<>(Arrays.asList(100, 153)))
    ));

    public static List<Course> getCourseInfo(int id) {
        List<Course> result = new ArrayList<>();
        for (Course c : courses) {
            if (c.getId() == id) {
                result.add(c);
                break;
            }
        }
        return result;
    }
}
