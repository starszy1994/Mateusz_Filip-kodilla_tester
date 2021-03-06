public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        User mateusz = new User("mateusz", 28);
        User martyna = new User("martyna", 30);
        User pawel = new User("pawel", 22);
        User michal = new User("michal", 47);
        User agata = new User("agata", 55);
        User anita = new User("anita", 17);
        User[] users = {mateusz, martyna, pawel, michal, agata, anita};
        int numerOfElements = users.length;
        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        result = result / users.length;
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < result) {
                System.out.println(users[i].getName());
            }
        }
    }
}
