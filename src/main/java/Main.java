public class Main {
    public static void main(String[] args) {
        Burger cheeseBurger = new Burger();
        cheeseBurger.id = 2336;
        cheeseBurger.imageUrl= "https://kfc.ru";
        cheeseBurger.name = "Чизбургер";
        cheeseBurger.weight = 167;
        cheeseBurger.description = "Пряный горчичный соус, кетчуп, сочные стрипсы в оригинальной панировке, лук, сыр Чеддер, огурцы на пшеничной булочке с кукурузной посыпкой.";
        cheeseBurger.price = 69;
        cheeseBurger.calories = 237;
        cheeseBurger.proteins = 13.2;
        cheeseBurger.fats = 8.6;
        cheeseBurger.carbohydrates = 26.6;

        Burger chefBurger = new Burger();
        chefBurger.id = 2384;
        chefBurger.imageUrl= "https://kfc.ru";
        chefBurger.name = "Шефбургер";
        chefBurger.weight = 213;
        chefBurger.description = "Попробуйте новый уникальный бургер от шефа! Нежный сливочный соус, сочное филе в оригинальной панировке, салат айcберг и помидоры на пшеничной булочке с черно-белым кунжутом.";
        chefBurger.price = 69;
        chefBurger.calories = 236;
        chefBurger.proteins = 13;
        chefBurger.fats = 10;
        chefBurger.carbohydrates = 22;

        System.out.println(chefBurger.imageUrl);
        System.out.println(chefBurger.name);
        System.out.println(chefBurger.price + " руб.");
        System.out.println(chefBurger.description);
    }
}
