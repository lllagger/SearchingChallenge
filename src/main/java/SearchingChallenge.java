import java.util.Stack;

public class SearchingChallenge {

    public static String SearchingChallenge(String str) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return "0";
                }
                char popped = stack.pop();
                if ((c == ')' && popped != '(') || (c == ']' && popped != '[')) {
                    return "0";
                }
                count++;
            }
        }
        if (stack.isEmpty()) {
            return "1 " + count;
        } else {
            return "0";
        }
    }

    public static void main(String[] args) {
        String str = "(hello [world])(!)";
        System.out.println(SearchingChallenge(str));
    }
}
