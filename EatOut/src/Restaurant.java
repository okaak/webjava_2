
public abstract class Restaurant {
  protected String restaurantType = "お店";
  abstract void order();

  public void entryRestaurant() {
    System.out.println(restaurantType + "に決めた!!!!!");
  }

  public void exitRestaurant() {
    System.out.println(restaurantType + "。ここは当たりだった。また訪問しよう。");;
  }
}

class WashokuRestaurant  extends Restaurant{
  public WashokuRestaurant(String name) {
    super.restaurantType = name;
  }
  public void order() {
    System.out.println("ここはThe・和食のお店です。");
    System.out.println("和食を注文しましょう。");
  }
}

class WesternRestaurant extends Restaurant {
  public WesternRestaurant(String name) {
    super.restaurantType = name;
  }
  public void order() {
    System.out.println("ここはガッツリ洋食のお店です。");
    System.out.println("洋食を注文しましょう。");
  }
}




