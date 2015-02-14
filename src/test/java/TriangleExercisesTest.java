import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleExercisesTest {

    private TriangleExercises triangleExercises;

    @Before
    public void setUp() throws Exception {
        triangleExercises = new TriangleExercises();

    }

    @Test
    public void test_easiest_exercise_ever() throws Exception {
        triangleExercises.printOneAsterisk();

    }

    @Test
    public void test_draw_a_horizontal_line() throws Exception {
        triangleExercises.drawOneHorizontalLine(8);

    }

    @Test
    public void test_draw_a_vertical_line() throws Exception {
        triangleExercises.drawOneVerticalLine(3);

    }

    @Test
    public void test_draw_a_right_triangle() throws Exception {
        triangleExercises.drawOneRightTriangle(3);

    }
}