public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount; //сумма кредита
        double rate; //годовая процентная ставка
        int creditTerm; //срок кредита

        int annuityPayment1 = service.creditAnnuityCalculate(1_000_000, 9.99, 12);
        int differPayment1 = service.creditDifferCalculate(1_000_000, 9.99, 12);
        System.out.println("Ежемесячный аннуитентный платеж составит: " + annuityPayment1);
        System.out.println("Ежемесячный дифференцированный платеж составит: " + differPayment1);

        int annuityPayment2 = service.creditAnnuityCalculate(1_000_000, 9.99, 24);
        int differPayment2 = service.creditDifferCalculate(1_000_000, 9.99, 24);
        System.out.println("Ежемесячный платеж составит: " + annuityPayment2);
        System.out.println("Ежемесячный дифференцированный платеж составит: " + differPayment2);

        int annuityPayment3 = service.creditAnnuityCalculate(1_000_000, 9.99, 36);
        int differPayment3 = service.creditDifferCalculate(1_000_000, 9.99, 36);
        System.out.println("Ежемесячный платеж составит: " + annuityPayment3);
        System.out.println("Ежемесячный дифференцированный платеж составит: " + differPayment3);
    }
}
