public class Person {
    String name;
    int age;
    double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        }
    public void chceckPerson(){

        if(age > 30 && height > 160) {
            System.out.println("User is older than 30 and taller than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
    public static void main(String[] args) {

        Person person = new Person("Adam", 40, 178);
        person.chceckPerson();
    }
}