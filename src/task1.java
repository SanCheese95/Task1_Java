class Answer {
    public int factorial(int n) {
        if (n < 0)
            return -1;
        int result = 1;
        for (int i = n; i > 1; i--)
            result *= i;
        return result;
    }
}

class Printer {
    public static void main(String[] args) {
        int n = 9;
        if (args.length > 0)
            n = Integer.parseInt(args[0]);
        Answer ans = new Answer();
        int itresume_res = ans.factorial(n);
        System.out.println(itresume_res);
    }
}