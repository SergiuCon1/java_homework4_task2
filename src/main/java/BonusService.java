public class BonusService {
  public void calculate(long amount, boolean registered) {
    int percent = registered ? 3 : 1;
    long bonus = amount * percent / 100 / 100;
    long limit = 500;
    if (bonus > limit) {
      bonus = limit;
    }
    System.out.println("Бонус равен " + bonus);;
  }
}


