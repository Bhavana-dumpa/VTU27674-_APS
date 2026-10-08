import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            boolean destroyed = false;

            // Collision happens only when:
            // stack top is moving right (+)
            // current asteroid is moving left (-)
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {

                if (stack.peek() < -asteroid) {
                    // Stack asteroid is smaller
                    stack.pop();
                }
                else if (stack.peek() == -asteroid) {
                    // Both have same size
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else {
                    // Current asteroid is smaller
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }

        return result;
    }
}