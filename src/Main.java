public class Main {
    public static void main(String[] args) {
        int counter = 100;
        for(int i = 100; i < 1000;i++) {
            if(i % 5 == 0 && i % 6 == 0) {
                System.out.println(i + " ");
                counter++;
                if (counter == 10) {
                    System.out.println();
                    counter = 0;
                }
            }
        }

    }
}