import java.util.List;

public abstract class BaseDish {

  private List <String> MenuList;
  private String selectMenuNo;
  private String selectMenu;

  public String getSelectMenu() {
    return selectMenu;
  }

  public void setSelectMenu(String selectMenu) {
    this.selectMenu = selectMenu;
  }

  public String getSelectMenuNo() {
    return selectMenuNo;
  }

  public void setSelectMenuNo(String selectMenuNo) {
    this.selectMenuNo = selectMenuNo;
  }

  public List<String> getMenuList() {
    return MenuList;
  }

  public void setMenuList(List<String> menuList) {
    MenuList = menuList;
  }

  public abstract void DishList(String restauranTtype) ;
  public abstract void ShowMenu();
  public abstract void SelectMenu();
  public abstract void cook();






//  protected String mealName = "食べ物";
//  abstract void mealType();
//  abstract void eat();
//
//  public void cooking() {
//    System.out.println("*****" + mealName + "を調理中*****");
//  }
//
//  public void serve() {
//    System.out.println("*****" + mealName + "の盛り付け中*****");
//  }
//}
//
//class Teishoku extends Dish {
//  public Teishoku(String name) {
//    super.mealName = name;
//  }
//  public void mealType() {
//    //定食としているが、可変となるように改修するべき点。
//    System.out.println("あなたは定食を注文しました。");
//  }
//  public void eat() {
//    System.out.println("あなたは定食を3分で完食しました。");
//  }
//}
//
//class Stew extends Dish {
//  public Stew(String name) {
//    super.mealName = name;
//  }
//  public void mealType() {
//    System.out.println("あなたはシチューを注文しました。");
//  }
//  public void eat() {
//    System.out.println("あなたはシチューを1分で流し込みました。");
//  }

}
