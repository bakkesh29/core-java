class FoodItemsRunner {
    public static void main(String[] values) {

        // List of all 31 food names
        String[] foodNames = {
            "Biryani", "Pizza", "Pasta", "Burger", "Sandwich", "Salad", "Cake", "Ice Cream",
            "Soup", "Curry", "Dosa", "Idli", "Samosa", "Pakora", "Chapati", "Paratha",
            "Pulao", "Fried Rice", "Noodles", "Pancake", "Omelette", "Kebab", "Pizza Toppings",
            "Smoothie", "Milkshake", "Porridge", "Donut", "Muffin", "Brownie", "Pudding", "Ice Lolly"
        };

        // Loop through each food name
        for (String foodName : foodNames) {
            System.out.println("\n--- Ingredients for: " + foodName + " ---");

            // Call your FoodItems class
            String[] ingredients = FoodItems.getIngredients(foodName);

            if (ingredients != null) {
                System.out.println("The ingredient length: " + ingredients.length);

                // Print each ingredient
                for (String ref : ingredients) {
                    System.out.println("Ingredient: " + ref);
                }
            } else {
                System.out.println("Food not found");
            }
        }
    }
}
