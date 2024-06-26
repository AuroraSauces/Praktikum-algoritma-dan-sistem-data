public class mobilmain26 {
    public static int maxAcceleration(mobil26[] car, int left, int right) {
        if (left == right)
            return car[left].topAcceleration;

        int mid = (left + right) / 2;

        int maxLeft = maxAcceleration(car, left, mid);
        int maxRight = maxAcceleration(car, mid + 1, right);

        return Math.max(maxLeft, maxRight);
    }

    public static int minAcceleration(mobil26[] cars, int left, int right) {
        if (left == right)
            return cars[left].topAcceleration;

        int mid = (left + right) / 2;

        int minLeft = minAcceleration(cars, left, mid);
        int minRight = minAcceleration(cars, mid + 1, right);

        return Math.min(minLeft, minRight);
    }

    public static double averageTopPower(mobil26[] cars) {
        int sum = 0;
        for (mobil26 car : cars) {
            sum += car.topPower;
        }
        return (double) sum / cars.length;
    }


   public static void main(String[] args) {
    mobil26[] cars = {
        new mobil26("BMW", "M2 Coupe", 2016, 6816, 728),
        new mobil26("Ford", "Fiesta ST", 2014, 3921, 575),
        new mobil26("Nissan", "370Z", 2009, 4360, 657),
        new mobil26("Subaru", "BRZ", 2014, 4058, 609),
        new mobil26("Subaru", "Impreza WRX STI", 2013, 6255, 703),
        new mobil26("Toyota", "AE86 Trueno", 1986, 3700, 553),
        new mobil26("Toyota", "86/GT86", 2014, 4180, 609),
        new mobil26("Volkswagen", "Golf GTI", 2014, 4180, 631)
    };

    System.out.println("Data Mobil :");
    System.out.println("================================");
    for(mobil26 car : cars){
        System.out.println(car);
    }
    System.out.println("================================");

    int maxAcc = maxAcceleration(cars, 0, cars.length - 1);
    int minAcc = minAcceleration(cars, 0, cars.length - 1);
    double avgTopPower = averageTopPower(cars);

    System.out.println("Top Acceleration Tertinggi: " + maxAcc);
    System.out.println("Top Acceleration Terendah: " + minAcc);
    System.out.println("Rata - rata Top Power: " + avgTopPower);
   }
}