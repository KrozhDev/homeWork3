public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1\n");

        int numCells = 1231234;
        byte numDogs = 120;
        short earthLevel = -12000;
        long bankAccount = 12350000000L;
        float heightMeters = 3243235.3f;
        double weightKilos = 1234.4;

        System.out.println(numCells);
        System.out.println(numDogs);
        System.out.println(earthLevel);
        System.out.println(bankAccount);
        System.out.println(heightMeters);
        System.out.println(weightKilos);

        System.out.println();

        System.out.println("Task 2\n");

        double num1 = 27.12;
        long num2 = 987_678_965_549L;
        double num3 = 2.786;
        short num4 = 569;
        short num5 = -159;
        int num6 = 27897;
        byte num7 = 67;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);

        System.out.println();

        System.out.println("Task 3");

        byte ludPav = 23;
        byte annSer = 27;
        byte ekAndr = 30;

        short numOfLists = 480;

        int allPupils = ludPav + annSer + ekAndr;

        System.out.println("Каждому ученику достанется " + numOfLists/allPupils + " листов бумаги");

        System.out.println("Task 4");

        int pBottleMaker = 16/2;
        int bottleNumberMin20 = pBottleMaker * 20;
        int bottleNumberDay = pBottleMaker * 60 * 24;
        int bottleNumberDay3 = bottleNumberDay * 3;
        int bottleNumberMonth = bottleNumberDay * 30;

        System.out.println("За 20 минут машина произвела " + bottleNumberMin20 + " бутылок");
        System.out.println("За сутки машина произвела " + bottleNumberDay + " бутылок");
        System.out.println("За 3 дня машина произвела " + bottleNumberDay3 + " бутылок");
        System.out.println("За месяц машина произвела " + bottleNumberMonth + " бутылок");

        System.out.println();

        System.out.println("Task 5\n");

        int whitePaintConsumption = 2;
        int brownPaintConsumption = 4;
        int totalPaint = 120;
        int numOfClasses = totalPaint / (whitePaintConsumption + brownPaintConsumption);
        int totalWhite = numOfClasses * whitePaintConsumption;
        int totalBrown = numOfClasses * brownPaintConsumption;
        System.out.println("В школе, где " + numOfClasses + " классов, нужно " + totalWhite + " банок белой краски и " +
                totalBrown + " банок коричневой краски");

        System.out.println();

        System.out.println("Task 6\n");

        short mBanana = 80;
        short mMilk = 105;
        short mIceCream = 100;
        short mEgg = 70;

        int MtotalGramm = 5 * mBanana + 2 * mMilk + 2 * mIceCream + 4 * mEgg;
        double MtotalKGramm = (double) MtotalGramm/1000;

        System.out.println("Масса завтрака в граммах " + MtotalGramm);
        System.out.println("Масса завтрака в килограммах " + MtotalKGramm);
        System.out.println();

        System.out.println("Task 7\n");

        short target = 7000;
        int days250 = target/250;
        int days500 = target/500;
        double average =(double) (days250 - days500)/2;
        System.out.println("Всего дней, если скидывать по 250 грамм " + days250);
        System.out.println("Всего дней, если скидывать по 500 грамм " + days500);
        System.out.println("Всего в среднем дней " + average);

        System.out.println("Task 8\n");

        int mashaSalary = 67760;
        int denSalary = 83690;
        int krisSalary = 76230;
        double k = 1.1;

        int newMashaSalary = (int) (mashaSalary * k);
        int newDenSalary = (int) (denSalary * k);
        int newKrisSalary = (int) (krisSalary * k);

        System.out.println("Маша теперь получает " + newMashaSalary + " рублей");
        System.out.println("Годовой доход вырос на " + (newMashaSalary - mashaSalary) + " рублей\n");
        System.out.println("Денис теперь получает " + newDenSalary + " рублей");
        System.out.println("Годовой доход вырос на " + (newDenSalary - denSalary) + " рублей\n");
        System.out.println("Кристина теперь получает " + newKrisSalary + " рублей");
        System.out.println("Годовой доход вырос на " + (newKrisSalary - krisSalary) + " рублей");













    }
}