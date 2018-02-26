import java.util.ArrayList;
import java.util.List;

public class Dish extends BaseDish {

  List <String> Menu;

  @Override
  public void DishList(String restaurantType) {

    Menu = new ArrayList<String>();

    if(restaurantType.equals("和食店")) {
    //和食のメニュー。追加が発生したら追加。
      Menu.add("サンマ定食");
      Menu.add("唐揚げ定食");
      Menu.add("お刺身定食");
      Menu.add("親子丼");
      Menu.add("うな重");
      //etc.etc
    }
    else if (restaurantType.equals("洋食店")) {
      //洋食のメニュー。追加が発生したら追加。
      Menu.add("クリームシチュー");
      Menu.add("ハンバーグ");
      Menu.add("ステーキ");
      Menu.add("ローストビーフ");
      Menu.add("オニオングラタン");
      //etc.etc
    }

    setMenuList(Menu);

  }

  @Override
  public void ShowMenu() {
    for (int i = 0; i < getMenuList().size(); i++) {
      System.out.println("注文番号：" + i + "　" + getMenuList().get(i));
    }

  }


  @Override
  public void SelectMenu() {
    int iMenu = Integer.parseInt(getSelectMenuNo());
    for (int i = 0; i < getMenuList().size(); i++) {
      if(i == iMenu) {
        System.out.println("注文番号：" + i + "　" + getMenuList().get(i) + "を注文しました。");
        setSelectMenu(getMenuList().get(i));
      }
    }

  }

  @Override
  public void cook() {
    if(!(getSelectMenu() == null)) {
      System.out.println(getSelectMenu()  + "の調理をしています。");
      for (int j =0; j < 3; j++) {
        try {
          Thread.sleep(1000);
          System.out.println("***");
          System.out.println("");
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println(getSelectMenu() + "が完成しました。");
    }
  }

}
