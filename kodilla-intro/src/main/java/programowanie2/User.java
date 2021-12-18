package programowanie2;

public class User {
    private String name = null;
    private int age = 0;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User("Adam", 15);
        users[1] = new User("Monika", 22);
        users[2] = new User("Ola", 30);
        users[3] = new User("Weronika", 37);
        users[4] = new User("Ola", 35);
        users[5] = new User("Tomek", 31);
        users[6] = new User("Piotr", 24);
        users[7] = new User("Ola", 60);
        users[8] = new User("Karolina", 56);
        users[9] = new User("Jarek", 34);


        double sum = 0.0;
        for (int i = 0; i < users.length; i++) {
            User actualUser = users[i];
            sum = sum + actualUser.getAge();
        }
        System.out.println(sum);
        Double average = sum / users.length;
        System.out.println(average);

        for (int i = 0; i < users.length; i++) {
            User actualUser = users[i];
            if (actualUser.getAge() < average) {
                System.out.println(actualUser.getName());
            }
        }
    }
}
