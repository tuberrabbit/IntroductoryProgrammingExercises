import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2015/2/13.
 */
public class PrimeFactorsExerciseTest {

    private PrimeFactorsExercise primeFactorsExercise;

    @Before
    public void setUp() throws Exception {
        primeFactorsExercise = new PrimeFactorsExercise();

    }

    @Test
    public void should_return_empty_list_when_given_1() throws Exception {
        List list = primeFactorsExercise.generate(1);
        assertTrue(list.isEmpty());
    }

    @Test
    public void should_return_prime_factors_in_increasing_numerial_order_when_given_30() throws Exception {
        List list = primeFactorsExercise.generate(30);
        List<Integer> matcher = new ArrayList<Integer>();
        matcher.add(2);
        matcher.add(3);
        matcher.add(5);
        assertEquals(list, matcher);
    }
}
