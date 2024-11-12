class Answer3 {
    public int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
class Printer3 {
    public static void main(String[] args) {
        int n = 12345;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        Answer3 ans = new Answer3();
        int itresume_res = ans.sumDigits(n);
        System.out.println(itresume_res);
    }
}