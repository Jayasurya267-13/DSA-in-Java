import java.util.*;

public class Unit_Digit_to_Pop_the_Stack {
    static int top = -1, MAX = 1000;
    static int stack[] = new int[MAX];

    private static void push(int val) {
        stack[++top] = val;
    }

    private static int pop() {
        return stack[top--];
    }

    private static int getSize() {
        return top;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int M = sc.nextInt();

            if (M >= 0 && M <= 9) {
                if (getSize() >= 0) {
                    pop();
                }
            } else {
                push(M);
            }
        }

        while (getSize() >= 0) {
            System.out.print(pop() + " ");
        }

        sc.close();
    }
}