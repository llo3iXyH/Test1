public class Sample {
    public static void main(String args[]) {
        String str = new String("Hi welcome to Tutoria12");
        int count = 0;
        for(int i = 0; i<str.length(); i++) {
            count++;
        }
        System.out.println("Number characters in the given string (including spaces) "+count);
    }
}