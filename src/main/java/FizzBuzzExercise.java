/**
 * Created by Administrator on 2015/2/13.
 */
public class FizzBuzzExercise {
    public void fizzBuzz() {
        for (int i = 0; i < 100; i++) {
            int current = i + 1;
            StringBuffer sb = new StringBuffer();
            if (isFizz(current)) {
                sb.append("Fizz");
            }
            if (isBuzz(current)) {
                sb.append("Buzz");
            }
            if (isEmpty(sb)) {
                sb.append(current);
            }
            System.out.println(sb.toString());
        }
    }

    private boolean isEmpty(StringBuffer sb) {
        return sb.length() == 0;
    }

    private boolean isBuzz(int data) {
        return data % 5 == 0;
    }

    private boolean isFizz(int data) {
        return data % 3 == 0;
    }
}
