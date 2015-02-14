/**
 * Created by Administrator on 2015/2/13.
 */
public class TriangleExercises {
    public void printOneAsterisk() {
        print("*");
    }

    private void print(String str) {
        System.out.println(str);
    }

    public void drawOneHorizontalLine(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }
        print(sb.toString());
    }

    public void drawOneVerticalLine(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("*\n");
        }
        sb.deleteCharAt(sb.length()-1);
        print(sb.toString());
    }

    public void drawOneRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            print(sb.toString());
        }
    }
}
