package oop_00000110660_grandmoze.week08;

public class JavaPaymentService {
    public void checkout(Object product) {
        if (product instanceof Electronic) {
            Electronic e = (Electronic) product;
            System.out.println("[JAVA] Checkout Elektronik: " + e.getName() + " (Garansi: " + e.getWarrantyMonths() + " bulan)");
        } else if (product instanceof Clothing) {
            Clothing c = (Clothing) product;
            System.out.println("[JAVA] Checkout Pakaian: " + c.getName() + " (Ukuran: " + c.getSize() + ")");
        }
    }
}