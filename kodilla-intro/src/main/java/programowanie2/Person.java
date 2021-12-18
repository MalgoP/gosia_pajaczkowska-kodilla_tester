package programowanie2;

public class Person {
    String name;
    double age = 0.0;
    double height = 0;
    double older = 30;
    double higher = 160;

    public Person(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void olderHigher() {
        if (this.age > older && this.height > higher) {
            System.out.println("programowanie2.User is older than 30 and higher than 160cm");
        } else {
            System.out.println("programowanie2.User is 30 (or younger) or 160cm (or shorter)");
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Adam", 40.5, 178);
        System.out.println(person1.name);
        person1.olderHigher();
        Person person2 = new Person("Wiola", 25, 170);
        System.out.println(person2.name);
        person2.olderHigher();
        Person person3 = new Person("Wiktor", 44, 170);
        System.out.println(person3.name);
        person3.olderHigher();
        Person person4 = new Person("Anna", 34, 157);
        System.out.println(person4.name);
        person4.olderHigher();
    }
}
