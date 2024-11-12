class Answer2 {
    public static void printEvenNums() {
        for (int i = 2; i <= 100; i += 2)
            System.out.println(i);
    }
}

class Printer2 {
    public static void main(String[] args) {
        Answer2 ans = new Answer2();
        ans.printEvenNums();
    }
}
