package prac_1;

public class Program_2 {
    private String answ;

    public static void main(String[] args) {
        Program_2 p2 = new Program_2();
        final double ROUBLES_PER_YUAN = 11.91;

        for (int i = 0; i < 10000; ++i) {
            double yuan = Math.ceil(i / ROUBLES_PER_YUAN);

            String answ = p2.find_ending((int) yuan);

            System.out.println((int) yuan + " юан" + answ);
        }
    }

    public String find_ending(int value) {
        if (value >= 10 && value <= 20) {
            this.answ = "ей";
        } else if (value % 10 >= 2 && value % 10 <= 4) {
            this.answ = "я";
        } else if (value % 10 == 1) {
            this.answ = "ь";
        } else {
            this.answ = "ей";
        }
        return this.answ;
    }
}
