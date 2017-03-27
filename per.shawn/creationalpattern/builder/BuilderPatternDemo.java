package creationalpattern.builder;

/**
 * Created by shawn on 2017/3/27.
 */
public class BuilderPatternDemo {

    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();


        Meal vegMeal = mealBuilder.prepareVegMel();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: "+vegMeal.getCost());


        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("NonVeg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: "+nonVegMeal.getCost());
    }
}
