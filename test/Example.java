class Example {
    public static void staticMethod() {
        System.out.println("Static method called");
    }

    public void instanceMethod() {
        System.out.println("Instance method called");
    }

    public static void main(String[] args) {
        Example.staticMethod(); // Correct
        // instanceMethod(); // Why is this not allowed?

        Example obj = new Example();
        obj.instanceMethod(); // Why does this work?
    }
}
