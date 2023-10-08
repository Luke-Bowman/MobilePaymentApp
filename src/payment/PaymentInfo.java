package src.payment;

public class PaymentInfo {
    private String creditCardNumber;
    private String expirationDate;
    private Integer securityNum;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getSecurityNum() {
        return securityNum;
    }

    public void setSecurityNum(Integer securityNum) {
        this.securityNum = securityNum;
    }
}

