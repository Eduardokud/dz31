public class main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
       int myResult = service.calculate(80);
        System.out.println("количество бонусных миль = " + myResult);

    }
}
