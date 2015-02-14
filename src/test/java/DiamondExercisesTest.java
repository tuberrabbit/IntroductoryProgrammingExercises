import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 2015/2/13.
 */
public class DiamondExercisesTest {

    private DiamondExercises diamondExercises;

    @Before
    public void setUp() throws Exception {
        diamondExercises = new DiamondExercises();

    }

    @Test
    public void test_isosceles_triangle() throws Exception {
        diamondExercises.printOneCenteredTriangle(3);

    }

    @Test
    public void test_diamond() throws Exception {
        diamondExercises.printOneCenteredDiamond(3);

    }

    @Test
    public void test_diamond_with_name() throws Exception {
        diamondExercises.printOneCenteredDiamondWithName(3);

    }
}
