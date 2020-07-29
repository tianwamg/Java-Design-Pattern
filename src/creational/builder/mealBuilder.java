package creational.builder;

public class mealBuilder {

    public meal prepareVegMeal(){
        meal meal = new meal();
        meal.addItem(new vegBurger());
        meal.addItem(new coke());
        return meal;
    }

    public meal prepareNonVegMeal(){
        meal meal = new meal();
        meal.addItem(new chickenBurger());
        meal.addItem(new pepsi());
        return meal;
    }
}
