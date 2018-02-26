public abstract class BaseRestaurant {

private String restrantType;
private String order;
//private String staff;

//abstract void order();
abstract void order();
//abstract void staff();

public String getOrder() {
  return order;
}

public void setOrder(String order) {
  this.order = order;
}

//public String getStaff() {
//  return staff;
//}
//
//public void setStaff(String staff) {
//  this.staff = staff;
//}

public String getRestrantType() {
  return restrantType;
}

public void setRestrantType(String restrantType) {
  this.restrantType = restrantType;
}


//  protected String restaurantType = "お店";
//  abstract void order();
//
//  public void entryRestaurant() {
//    System.out.println(restaurantType + "に決めた!!!!!");
//  }
//
//  public void exitRestaurant() {
//    System.out.println(restaurantType + "。ここは当たりだった。また訪問しよう。");;
//  }
//}
//
//class WashokuRestaurant  extends Restaurant{
//  public WashokuRestaurant(String name) {
//    super.restaurantType = name;
//  }
//  public void order() {
//    System.out.println("ここはThe・和食のお店です。");
//    System.out.println("和食を注文しましょう。");
//  }
//}
//
//class WesternRestaurant extends Restaurant {
//  public WesternRestaurant(String name) {
//    super.restaurantType = name;
//  }
//  public void order() {
//    System.out.println("ここはガッツリ洋食のお店です。");
//    System.out.println("洋食を注文しましょう。");
//  }

//  public String getRestaurantType() {
//    return this.name;
//  }
//
//  public void setRestaurantType(String name) {
//    this.restrantType = name;
//  }




}




