import java.util.*;

public class Remove_Top_3_for_Multiples_of_3 {
    static int top = -1, MAX = 1000;
    static int[] stack = new int[MAX];

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

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();

            if (m % 3 != 0) {
                push(m);
            } else {
                for (int j = 0; j < 3 && getSize() >= 0; j++) {
                    pop();
                }
            }
        }

        while (getSize() >= 0) {
            System.out.print(pop() + " ");
        }

        sc.close();
    }
}