
public class Main {
    public static void main(String[] args) {
        Menu exactum = new Menu();

        // When you have created addMeal(String meal) method,
        // you may remove the comments below
        exactum.addMeal("Fish fingers with sour cream sauce");
        exactum.addMeal("Vegetable casserole with salad cheese");
        exactum.addMeal("Chicken and nacho salad");

        // When you have created printMeals() method,
        // you may remove the comments below
        System.out.println("Printing menu");
        exactum.printMeals();

        // When you have created clearMenu() method,
        // You may remove the comments below
        exactum.clearMenu();
        System.out.println("Menu cleared");
        System.out.println("Printing menu");
        exactum.printMeals();
    }
}
