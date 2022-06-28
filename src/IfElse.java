public class IfElse {
    public static void main(String[] args) {

        int x = (int)  (Math.random() * 13);

        if (x > 6) {
            System.out.println("Ти забагато взяв цього разу: " + x + " -І це перельот");
        } else if (x < 6) {
            System.out.println("Ех, маловато, твоє число: " + x + " -І це недольот");
        } else if (x == 6) {
            System.out.println("Опа чірік, в точку: " + x + " Курлик");
        }
    }

}