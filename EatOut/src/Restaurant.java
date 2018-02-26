import java.util.Scanner;

public class Restaurant extends BaseRestaurant {

  Dish dish = new Dish();



  public void entryRestaurant(String input) {

    switch (input) {
      case "1":
        setRestrantType("和食店");
        order();
        break;

      case "2":
        setRestrantType("洋食店");
        order();
        break;

      default:
        System.out.println("やっぱり自炊することにした。");
        break;
    }

  }

  @Override
  void order() {

    dish.DishList(getRestrantType());

    System.out.println(getRestrantType() + "に入店しました。");
    System.out.println("以下のメニューから、食べたいものを選択してください");
    dish.ShowMenu();

    Scanner scan = new Scanner(System.in);
    String input = scan.next();

    dish.setSelectMenuNo(input);

    //注文、調理
    dish.SelectMenu();
    dish.cook();


    //実食
    if(!(dish.getSelectMenu() == null)) {
      System.out.println(dish.getSelectMenu() + "を食べきった！あとは帰宅。");
    }
    else {
      System.out.println("食べたいメニューがないため、機会を改めることにした。");
    }


    System.out.println(getRestrantType() + "から退店しました。");
    System.out.println( "またのお越しをお待ちしております。");

    scan.close();

  }
}
