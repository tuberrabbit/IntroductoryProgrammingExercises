import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 2015/2/13.
 */
public class FizzBuzzExerciseTest {

    private FizzBuzzExercise fizzBuzzExercise;

    @Before
    public void setUp() throws Exception {
        fizzBuzzExercise = new FizzBuzzExercise();

    }

    @Test
    public void test_FizzBuzz() throws Exception {
        fizzBuzzExercise.fizzBuzz();

    }
}
