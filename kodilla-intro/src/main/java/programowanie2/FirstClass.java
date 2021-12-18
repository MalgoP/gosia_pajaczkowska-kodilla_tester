package programowanie2;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println(notebook.weight + "g " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPrice();
        Notebook heavyNotebook = new Notebook(2000, 1500, 2017);
        System.out.println(heavyNotebook.weight + "g " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearPrice();
        Notebook oldNotebook = new Notebook(1200, 500, 2009);
        System.out.println(oldNotebook.weight + "g " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearPrice();
        Notebook notKnowNotebook = new Notebook(1200, 20000, 1996);
        System.out.println(notKnowNotebook.weight + "g " + notKnowNotebook.price + " " + notKnowNotebook.year);
        notKnowNotebook.checkPrice();
        notKnowNotebook.checkWeight();
        notKnowNotebook.checkYearPrice();
        Notebook oneNotebook = new Notebook(1200, 700, 1900);
        System.out.println(oneNotebook.weight + "g " + oneNotebook.price + " " + oneNotebook.year);
        oneNotebook.checkPrice();
        oneNotebook.checkWeight();
        oneNotebook.checkYearPrice();
        Notebook secondNotebook = new Notebook(1400, 2000, 2018);
        System.out.println(oneNotebook.weight + "g " + secondNotebook.price + " " + secondNotebook.year);
        secondNotebook.checkPrice();
        secondNotebook.checkWeight();
        secondNotebook.checkYearPrice();
        Notebook thirdNotebook = new Notebook(1300, 41000, 2020);
        System.out.println(thirdNotebook.weight + "g " + thirdNotebook.price + " " + thirdNotebook.year);
        thirdNotebook.checkPrice();
        thirdNotebook.checkWeight();
        thirdNotebook.checkYearPrice();
    }
}