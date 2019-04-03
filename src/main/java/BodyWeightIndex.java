import java.util.Scanner;

public class BodyWeightIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhap can nang co the ban: ");
        weight = sc.nextDouble();
        System.out.println("Nhap chieu cao co the ban: ");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Trang thai co the ban:  \n");
        if (bmi < 18.0) {
            System.out.printf("%-20.2f%s", bmi, "Thieu can             ");
        } else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Binh thuong           ");
        } else if (bmi < 30) {
            System.out.printf("%-20.2f%s", bmi, "Thua can              ");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Map                   ");
        }


    }
}
