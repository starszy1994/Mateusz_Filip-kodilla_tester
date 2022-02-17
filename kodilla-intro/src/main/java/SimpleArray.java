public class SimpleArray {
    public static void main(String[] args) {

        String[] sports = new String[5];

        sports[0] = "Football";
        sports[1] = "Volleyball";
        sports[2] = "Tennis";
        sports[3] = "Swimming";
        sports[4] = "Running";

        String sport = sports[3];
        {
            System.out.println(sports[3]);
        }
        int numerOfElements = sports.length;

        if (numerOfElements <= 5){
            System.out.println("Moja tablica zawiera 5 elementów");
        } else {
            System.out.println("Moja tablica nie zawiera 5 elementów");
        }
    }
}
