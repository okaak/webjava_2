
public abstract class Staff {
  protected String name = "スタッフゥ";
  abstract void work();

  public void greeting() {
    System.out.println(name + "のいらっしゃいませが響き渡る。");
  }

  public void smilePriceless() {
    System.out.println(name + "の営業スマイルは0円。");
  }
}

class Sheff extends Staff{
  public Sheff(String name) {
    super.name = name;
  }
  public void work() {
    System.out.println("オーダーの料理をシェフが調理している。");
  }
}

class HallStaff extends Staff{
  public HallStaff(String name) {
    super.name = name;
  }
  public void work() {
    System.out.println("ホールがオーダーを取りに来た。");
  }



}