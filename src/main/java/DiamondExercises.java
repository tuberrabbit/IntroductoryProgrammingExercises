/**
 * Created by Administrator on 2015/2/13.
 */
public class DiamondExercises {
    public void printOneCenteredTriangle(int n) {
        printOneCenteredTriangleUp(n);
        printOneHorizontalLine(n);
    }

    public void printOneCenteredDiamond(int n) {
        printOneCenteredTriangle(n);
        printOneCenteredTriangleDown(n);
    }

    public void printOneCenteredDiamondWithName(int n) {
        printOneCenteredTriangleUp(n);
        System.out.println("Tuber");
        printOneCenteredTriangleDown(n);
    }

    private void printOneCenteredTriangleUp(int n) {
        for (int i = 0; i < n - 1; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < n - i - 1; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                sb.append("*");
            }
            print(sb.toString());
        }
    }

    private void printOneCenteredTriangleDown(int n) {
        for (int i = 0; i < n - 1; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < i + 1; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 3; j++) {
                sb.append("*");
            }
            print(sb.toString());
        }
    }

    private void printOneHorizontalLine(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n * 2 - 1; i++) {
            sb.append("*");
        }
        print(sb.toString());
    }

    private void print(String str) {
        System.out.println(str);
    }
}
