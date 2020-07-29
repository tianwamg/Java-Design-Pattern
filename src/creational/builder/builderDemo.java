package creational.builder;

/**
 * 生成器模式
 */
public class builderDemo {

    public static void main(String args[]){
        mealBuilder mealBuilder = new mealBuilder();

        meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());

    }
}
