package programowanie2;

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (weight <= 600) {
            System.out.println("This notebook is light.");
        } else if (weight <= 1200) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkYearPrice() {
        if (price <= 700 && year > 2000 && year < 2015) {
            System.out.println("Really cheep notebook but quite old.");
        } else if (price >= 1500 && price <= 3000 && year >= 2017) {
            System.out.println("Price is quite good and notebook quite new.");
        } else if (price >= 40000 || year <= 2000) {
            System.out.println("Price is too big or to old notebook. Unworthy.");
        } else if (year >= 2018) {
            System.out.println("programowanie2.Notebook is from 2018 or newer.");
        }
    }
}
