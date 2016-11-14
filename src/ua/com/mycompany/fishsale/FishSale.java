/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.mycompany.fishsale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ua.com.mycompany.fishsale.entities.Fish;
import ua.com.mycompany.fishsale.entities.Sale;
import org.joda.time.LocalDate;

/**
 *
 * @author Igor Gayvan
 */
public class FishSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fish fish1 = new Fish(1, "Salmon"),
                fish2 = new Fish(2, "Carp"),
                fish3 = new Fish(3, "Burbot");

        List<Sale> sales = new ArrayList<>();
        sales.add(new Sale(fish1, 100, new LocalDate(2016, 11, 11), 101, new LocalDate(2016, 11, 11), 300));
        sales.add(new Sale(fish1, 100, new LocalDate(2016, 11, 11), 102, new LocalDate(2016, 11, 11), 300));

        sales.add(new Sale(fish2, 100, new LocalDate(2016, 11, 11), 102, new LocalDate(2016, 11, 11), 300));

        sales.add(new Sale(fish3, 100, new LocalDate(2016, 11, 11), 101, new LocalDate(2016, 11, 12), 1));

        Map<Fish, Double> fishIncome = new HashMap<>();

        double totalIncome = 0;
        for (Sale sale : sales) {
            double tmpIncome = 0;

            if (fishIncome.containsKey(sale.getFish())) {
                tmpIncome = fishIncome.get(sale.getFish());
            }

            double saleIncome = sale.calcIncome();

            fishIncome.put(sale.getFish(), tmpIncome + saleIncome);
            totalIncome += saleIncome;
        }

        System.out.printf("     Fish        Income\n");
        System.out.printf("---------------------------------------\n");
        for (Map.Entry<Fish, Double> entry : fishIncome.entrySet()) {
            System.out.printf("%10s    %10.2f\n", entry.getKey().getName(), entry.getValue());
        }
        System.out.printf("---------------------------------------\n");
        System.err.printf("Total income: %10.2f\n", totalIncome);
    }

}
