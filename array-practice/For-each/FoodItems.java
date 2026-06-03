class FoodItems {

    static String[] getIngredients(String foodName) {

        // ingredients
        // 1. Biryani Ingredients
        String[] biryaniIngredients = { "Rice", "Chicken", "Onion", "Tomato", "Ginger", "Garlic", "Green Chilli",
                "Curd", "Oil", "Ghee", "Salt", "Turmeric Powder", "Red Chilli Powder", "Coriander Powder",
                "Garam Masala", "Cumin Seeds", "Cloves", "Cardamom", "Cinnamon", "Bay Leaf", "Star Anise",
                "Black Pepper", "Mint Leaves", "Coriander Leaves", "Lemon Juice", "Saffron", "Milk", "Fried Onion",
                "Cashew Nuts", "Raisins" };

        // 2. Pizza
        String[] pizzaIngredients = { "Flour", "Yeast", "Salt", "Olive Oil", "Tomato Sauce", "Cheese", "Basil",
                "Oregano", "Garlic", "Onion", "Bell Pepper", "Mushroom", "Olives", "Chicken", "Pepperoni" };

        // 3. Pasta
        String[] pastaIngredients = { "Pasta", "Salt", "Olive Oil", "Garlic", "Onion", "Tomato Sauce", "Cheese",
                "Basil", "Oregano", "Black Pepper" };

        // 4. Burger
        String[] burgerIngredients = { "Bun", "Patty", "Cheese", "Lettuce", "Tomato", "Onion", "Pickles", "Mayonnaise",
                "Ketchup", "Mustard" };

        // 5. Sandwich
        String[] sandwichIngredients = { "Bread", "Butter", "Cheese", "Lettuce", "Tomato", "Cucumber", "Onion",
                "Mayonnaise", "Chicken", "Egg" };

        // 6. Salad
        String[] saladIngredients = { "Lettuce", "Cucumber", "Tomato", "Carrot", "Onion", "Olives", "Feta Cheese",
                "Salt", "Pepper", "Olive Oil", "Lemon Juice" };

        // 7. Cake
        String[] cakeIngredients = { "Flour", "Sugar", "Butter", "Eggs", "Milk", "Baking Powder", "Vanilla Essence",
                "Salt", "Chocolate", "Cream" };

        // 8. Ice Cream Flavors
        String[] iceCreamFlavors = { "Vanilla", "Chocolate", "Strawberry", "Mango", "Butterscotch", "Pistachio",
                "Coffee", "Mint", "Blueberry", "Caramel" };

        // 9. Soup
        String[] soupIngredients = { "Water", "Salt", "Pepper", "Carrot", "Onion", "Tomato", "Garlic", "Celery",
                "Chicken", "Corn" };

        // 10. Curry
        String[] curryIngredients = { "Oil", "Onion", "Tomato", "Garlic", "Ginger", "Salt", "Turmeric", "Chilli Powder",
                "Coriander Powder", "Chicken" };

        // 11. Dosa
        String[] dosaIngredients = { "Rice", "Urad Dal", "Salt", "Water", "Oil", "Fenugreek Seeds" };

        // 12. Idli
        String[] idliIngredients = { "Rice", "Urad Dal", "Salt", "Water", "Fenugreek Seeds" };

        // 13. Samosa
        String[] samosaIngredients = { "Flour", "Salt", "Oil", "Potato", "Peas", "Onion", "Green Chilli", "Coriander",
                "Cumin", "Garam Masala" };

        // 14. Pakora
        String[] pakoraIngredients = { "Gram Flour", "Salt", "Turmeric", "Chilli Powder", "Onion", "Potato", "Spinach",
                "Oil" };

        // 15. Chapati
        String[] chapatiIngredients = { "Wheat Flour", "Salt", "Water", "Oil" };

        // 16. Paratha
        String[] parathaIngredients = { "Wheat Flour", "Salt", "Water", "Oil", "Potato", "Onion", "Coriander" };

        // 17. Pulao
        String[] pulaoIngredients = { "Rice", "Onion", "Tomato", "Carrot", "Peas", "Beans", "Salt", "Oil", "Cumin",
                "Bay Leaf" };

        // 18. Fried Rice
        String[] friedRiceIngredients = { "Rice", "Carrot", "Beans", "Capsicum", "Onion", "Soy Sauce", "Salt", "Pepper",
                "Oil", "Egg" };

        // 19. Noodles
        String[] noodlesIngredients = { "Noodles", "Carrot", "Beans", "Capsicum", "Onion", "Soy Sauce", "Salt",
                "Pepper", "Oil" };

        // 20. Pancake
        String[] pancakeIngredients = { "Flour", "Sugar", "Salt", "Milk", "Eggs", "Butter", "Baking Powder",
                "Vanilla Essence" };

        // 21. Omelette
        String[] omeletteIngredients = { "Eggs", "Salt", "Pepper", "Onion", "Tomato", "Green Chilli", "Oil" };

        // 22. Kebabs
        String[] kebabIngredients = { "Meat", "Salt", "Pepper", "Onion", "Garlic", "Ginger", "Coriander", "Cumin",
                "Oil" };

        // 23. Pizza
        String[] pizzaToppings = { "Cheese", "Tomato", "Onion", "Capsicum", "Mushroom", "Olives", "Corn", "Chicken",
                "Pepperoni" };

        // 24. Smoothie
        String[] smoothieIngredients = { "Milk", "Banana", "Strawberry", "Mango", "Sugar", "Ice", "Yogurt" };

        // 25. Milkshake
        String[] milkshakeIngredients = { "Milk", "Sugar", "Ice Cream", "Chocolate Syrup", "Banana", "Strawberry" };

        // 26. Porridge
        String[] porridgeIngredients = { "Oats", "Milk", "Sugar", "Salt", "Honey", "Banana" };

        // 27. Donut
        String[] donutIngredients = { "Flour", "Sugar", "Salt", "Yeast", "Milk", "Butter", "Eggs", "Oil" };

        // 28. Muffin
        String[] muffinIngredients = { "Flour", "Sugar", "Salt", "Milk", "Butter", "Eggs", "Baking Powder",
                "Chocolate Chips" };

        // 29. Brownie
        String[] brownieIngredients = { "Flour", "Sugar", "Salt", "Butter", "Eggs", "Chocolate", "Cocoa Powder",
                "Vanilla Essence" };

        // 30. Pudding
        String[] puddingIngredients = { "Milk", "Sugar", "Eggs", "Vanilla Essence", "Cornflour", "Butter" };

        // 31. Ice Lolly
        String[] iceLollyFlavors = { "Orange", "Mango", "Strawberry", "Pineapple", "Grape", "Lemon", "Cola" };

        //  Checking fooor  null valuesss
        if (foodName == null) {
            System.out.println("Food is not found");
            return null;
        }

        if (foodName == "Biryani") {
            System.out.println("Total Biryani Ingredients are : " + biryaniIngredients.length);
            return biryaniIngredients;
        }

        if (foodName == "Pizza") {
            System.out.println("Total Pizza Ingredients are : " + pizzaIngredients.length);
            return pizzaIngredients;
        }

        if (foodName == "Pasta") {
            System.out.println("Total Pasta Ingredients are : " + pastaIngredients.length);
            return pastaIngredients;
        }

        if (foodName == "Burger") {
            System.out.println("Total Burger Ingredients are : " + burgerIngredients.length);
            return burgerIngredients;
        }

        if (foodName == "Sandwich") {
            System.out.println("Total Sandwich Ingredients are : " + sandwichIngredients.length);
            return sandwichIngredients;
        }

        if (foodName == "Salad") {
            System.out.println("Total Salad Ingredients are : " + saladIngredients.length);
            return saladIngredients;
        }

        if (foodName == "Cake") {
            System.out.println("Total Cake Ingredients are : " + cakeIngredients.length);
            return cakeIngredients;
        }

        if (foodName == "Ice Cream") {
            System.out.println("Total Ice Cream Flavors are : " + iceCreamFlavors.length);
            return iceCreamFlavors;
        }

        if (foodName == "Soup") {
            System.out.println("Total Soup Ingredients are : " + soupIngredients.length);
            return soupIngredients;
        }

        if (foodName == "Curry") {
            System.out.println("Total Curry Ingredients are : " + curryIngredients.length);
            return curryIngredients;
        }

        if (foodName == "Dosa") {
            System.out.println("Total Dosa Ingredients are : " + dosaIngredients.length);
            return dosaIngredients;
        }

        if (foodName == "Idli") {
            System.out.println("Total Idli Ingredients are : " + idliIngredients.length);
            return idliIngredients;
        }

        if (foodName == "Samosa") {
            System.out.println("Total Samosa Ingredients are : " + samosaIngredients.length);
            return samosaIngredients;
        }

        if (foodName == "Pakora") {
            System.out.println("Total Pakora Ingredients are : " + pakoraIngredients.length);
            return pakoraIngredients;
        }

        if (foodName == "Chapati") {
            System.out.println("Total Chapati Ingredients are : " + chapatiIngredients.length);
            return chapatiIngredients;
        }

        if (foodName == "Paratha") {
            System.out.println("Total Paratha Ingredients are : " + parathaIngredients.length);
            return parathaIngredients;
        }

        if (foodName == "Pulao") {
            System.out.println("Total Pulao Ingredients are : " + pulaoIngredients.length);
            return pulaoIngredients;
        }

        if (foodName == "Fried Rice") {
            System.out.println("Total Fried Rice Ingredients are : " + friedRiceIngredients.length);
            return friedRiceIngredients;
        }

        if (foodName == "Noodles") {
            System.out.println("Total Noodles Ingredients are : " + noodlesIngredients.length);
            return noodlesIngredients;
        }

        if (foodName == "Pancake") {
            System.out.println("Total Pancake Ingredients are : " + pancakeIngredients.length);
            return pancakeIngredients;
        }

        if (foodName == "Omelette") {
            System.out.println("Total Omelette Ingredients are : " + omeletteIngredients.length);
            return omeletteIngredients;
        }

        if (foodName == "Kebab") {
            System.out.println("Total Kebab Ingredients are : " + kebabIngredients.length);
            return kebabIngredients;
        }

        if (foodName == "Pizza Toppings") {
            System.out.println("Total Pizza Toppings are : " + pizzaToppings.length);
            return pizzaToppings;
        }

        if (foodName == "Smoothie") {
            System.out.println("Total Smoothie Ingredients are : " + smoothieIngredients.length);
            return smoothieIngredients;
        }

        if (foodName == "Milkshake") {
            System.out.println("Total Milkshake Ingredients are : " + milkshakeIngredients.length);
            return milkshakeIngredients;
        }

        if (foodName == "Porridge") {
            System.out.println("Total Porridge Ingredients are : " + porridgeIngredients.length);
            return porridgeIngredients;
        }

        if (foodName == "Donut") {
            System.out.println("Total Donut Ingredients are : " + donutIngredients.length);
            return donutIngredients;
        }

        if (foodName == "Muffin") {
            System.out.println("Total Muffin Ingredients are : " + muffinIngredients.length);
            return muffinIngredients;
        }

        if (foodName == "Brownie") {
            System.out.println("Total Brownie Ingredients are : " + brownieIngredients.length);
            return brownieIngredients;
        }

        if (foodName == "Pudding") {
            System.out.println("Total Pudding Ingredients are : " + puddingIngredients.length);
            return puddingIngredients;
        }

        if (foodName == "Ice Lolly") {
            System.out.println("Total Ice Lolly Flavors are : " + iceLollyFlavors.length);
            return iceLollyFlavors;
        }

        System.out.println("Food not found");
        return null;
    }
}