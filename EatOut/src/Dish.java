
public abstract class Dish {
  protected String mealName = "食べ物";
  abstract void mealType();
  abstract void eat();

  public void cooking() {
    System.out.println("*****" + mealName + "を調理中*****");
  }

  public void serve() {
    System.out.println("*****" + mealName + "の盛り付け中*****");
  }
}

class Teishoku extends Dish {
  public Teishoku(String name) {
    super.mealName = name;
  }
  public void mealType() {
    //定食としているが、可変となるように改修するべき点。
    System.out.println("あなたは定食を注文しました。");
  }
  public void eat() {
    System.out.println("あなたは定食を3分で完食しました。");
  }
}

class Stew extends Dish {
  public Stew(String name) {
    super.mealName = name;
  }
  public void mealType() {
    System.out.println("あなたはシチューを注文しました。");
  }
  public void eat() {
    System.out.println("あなたはシチューを1分で流し込みました。");
  }

}
