package model.services;

public class BrazilTaxServices implements TaxService {
    public double tax(Double amount){
        if(amount <= 100.0){
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }

    @Override
    public double tax(double amount) {
        return 0;
    }
}
