package demo;

public class GradeCalculator {

    public int total(int a, int b, int c) {
        validate(a);
        validate(b);
        validate(c);
        return a + b + c;
    }

    public double average(int a, int b, int c) {
        return total(a, b, c) / 3.0;
    }

    public String grade(int a, int b, int c) {
        double avg = average(a, b, c);
        if (avg >= 90) return "A";
        if (avg >= 75) return "B";
        if (avg >= 60) return "C";
        if (avg >= 40) return "D";
        return "Fail";
    }

    private void validate(int mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
    }
}
