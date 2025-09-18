package W3L9_HW_Asgmt.prob3;

import java.util.Stack;

public class BrowserHistory {
    private final Stack<String> back = new Stack<>();
    private final Stack<String> forward = new Stack<>();
    private String currentUrl;

    public BrowserHistory(String startUrl) {
        this.currentUrl = startUrl;
    }

    public void visit(String url) {
        back.push(currentUrl);
        forward.clear();
        currentUrl = url;
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (back.isEmpty()) {
            System.out.println("No history to go back to.");
            return;
        }

        forward.push(currentUrl);
        currentUrl = back.pop();
        System.out.println("Back to: " + currentUrl);
    }

    public void forward() {
        if (forward.isEmpty()) {
            System.out.println("No forward history");
            return;
        }
        back.push(currentUrl);
        currentUrl = forward.pop();
        System.out.println("Forward to: " + currentUrl);
    }
}
