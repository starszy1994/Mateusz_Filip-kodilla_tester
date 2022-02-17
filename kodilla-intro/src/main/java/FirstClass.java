public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 600 ,  2012);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(1200, 1500, 2020);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();heavyNotebook.checkWeight();heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 800, 2017);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();oldNotebook.checkWeight();oldNotebook.checkYear();

    }
}
