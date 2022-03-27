public class CreditPaymentService {
    public int creditAnnuityCalculate(int creditAmount, double rate, int creditTerm) {
        double i = rate / 100 / 12; //ежемес.процентная ставка
        int annuityPayment = (int) (creditAmount * (i + i / (Math.pow((1 + i), creditTerm) - 1))); //аннуитетный платеж

        return annuityPayment;

    }

    public int creditDifferCalculate(int creditAmount, double rate, int creditTerm) {
        double i = rate / 100 / 12; //ежемес.процентная ставка
        int debtPart = creditAmount / creditTerm; //расчет долговой части платежа
        int percentage = (int) (creditAmount * i); //расчет процентной части платежа
        int differPayment = debtPart + percentage; //дифференцированный платеж
        return differPayment;
    }

}
