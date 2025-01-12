public class Exer {
    public static void main(String[] args) {
        int numOfOranges = 5;
        int numOfApples = 10;
        int numOfFruit;
        numOfFruit = numOfOranges++ + numOfApples + ++numOfOranges;
        System.out.println(numOfFruit);
        System.out.println(numOfOranges);
        System.out.println(numOfApples);
    }
}
