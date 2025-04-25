package Guvi_Java_Task2;

import java.util.Scanner;

public class HotelTariffCalculatotr {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int month = scanner.nextInt();
	        float rentPerDay = scanner.nextFloat();
	        int days = scanner.nextInt();

	        boolean isPeakSeason;
	        switch (month) {
            case 4: case 5: case 6:
            case 11: case 12:
                isPeakSeason = true;
                break;
            default:
                isPeakSeason = false;
                
	        
	}
	float totalTariff;
	 if (isPeakSeason) {
		 totalTariff = rentPerDay * 1.20f * days;
	 } else {
		 totalTariff = rentPerDay * days;
	 }
	 System.out.printf("%.2f\n", totalTariff);

     scanner.close();

}
}
