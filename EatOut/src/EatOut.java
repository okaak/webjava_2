import java.util.Scanner;

public class EatOut {

   //食べ物カテゴリ
  //カテゴリ増えたら追加
  private static String Wasyoku = "The・和食";
  private static String Western = "ガッツリ洋食";

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    //レストランの種類
    WashokuRestaurant war = new WashokuRestaurant("風情のある和食のお店");
    WesternRestaurant wer = new WesternRestaurant("雰囲気の良い洋食店");
    //料理の種類
    Teishoku tei = new Teishoku("定食");
    Stew ste = new Stew("シチュー");
    //店員さん
    Sheff she = new Sheff("シェフ");
    HallStaff hal = new HallStaff("ホール");


  //腹減りなので外食に行く
    System.out.println("おなかが減り、自炊する気力がないので外食に行く決意を固める。");
    System.out.println("今食べたいものは");

    //カテゴリ
    System.out.println("1：" + Wasyoku);
    System.out.println("2：" + Western);

    boolean RestaurantSelect = true;

    Scanner scan = new Scanner(System.in);
    String input = scan.next();

    while(RestaurantSelect)
    {
      if(input.equals("1"))
      {
        war.entryRestaurant();
        hal.greeting();
        hal.work();
        war.order();
        tei.mealType();
        she.work();
        tei.cooking();
        tei.serve();
        tei.eat();
        war.exitRestaurant();
        RestaurantSelect = false;
      }
      else if(input.equals("2"))
      {
        wer.entryRestaurant();
        hal.greeting();
        hal.work();
        wer.order();
        ste.mealType();
        she.work();
        ste.cooking();
        ste.serve();
        ste.eat();
        wer.exitRestaurant();
        RestaurantSelect = false;
      }
      else
      {
        System.out.println("やはり外食ではなく、家にあるもので良い、と考え直した。");
        RestaurantSelect = false;
      }
    }

    scan.close();

  }

}
