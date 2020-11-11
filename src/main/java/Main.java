public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean registered = true;
    long expected = 30;
    long present = service.calculate(amount, registered );
    boolean crossed = expected == present;
    System.out.println(crossed);
  }
}

