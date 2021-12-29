package programowanie2;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2020);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2017);
        Notebook oldNotebook = new Notebook(1200, 500, 2009);
        Notebook notKnowNotebook = new Notebook(1200, 20000, 1996);
        Notebook oneNotebook = new Notebook(1200, 700, 1900);
        Notebook thirdNotebook = new Notebook(1300, 41000, 2020);
        Notebook secondNotebook = new Notebook(1400, 2000, 2018);

        notebookParameters(notebook);
        notebookParameters(heavyNotebook);
        notebookParameters(oldNotebook);
        notebookParameters(notKnowNotebook);
        notebookParameters(oneNotebook);
        notebookParameters(secondNotebook);
        notebookParameters(thirdNotebook);
    }

    private static void notebookParameters(Notebook notebook) {
        System.out.println(notebook.weight + "g " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPrice();
    }
}