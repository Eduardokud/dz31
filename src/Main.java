public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        System.out.println("стоимость 80");

        System.out.println("Количество бонусных миль " + service.calculate(80));


    }
}