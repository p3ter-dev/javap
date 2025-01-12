public class ScopeTest {
    int midget = 9;
    public int mutate(int midget) {
        this.midget = midget + (midget * 4);
        return midget;
    }

    public void displayMutate() {
        System.out.println(mutate(midget) + " & " + midget);
    }

    public static void main(String[] args) {
        ScopeTest sctest = new ScopeTest();
        sctest.displayMutate();
    }
}
