public class Notebook {
    double weight;
    int price;
    int year;

    public Notebook(double weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("This price is good.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 800 && this.weight <= 1200) {
            System.out.println("This notebook is not to heavy.");
        } else {
            System.out.println("This notebook is heavy");
        }
    }

    public void checkYear() {
        if (this.price < 1000 && this.year < 2013) {
            System.out.println("This notebook is cheap and old.");
        } else if (this.price > 1400 && this.year > 2019) {
            System.out.println("This notebook is new, but expensive.");
        } else {
            System.out.println("This notebook is not old and is not expensive.");
        }
    }
}
