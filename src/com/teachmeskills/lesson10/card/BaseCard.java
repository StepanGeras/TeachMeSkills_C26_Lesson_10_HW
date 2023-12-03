package com.teachmeskills.lesson10.card;

import java.util.Objects;

public class BaseCard {

    private int cvv;
    private String numberCard;
    private int sum;

    public BaseCard(int cvv, String numberCard, int sum) {
        this.cvv = cvv;
        this.numberCard = numberCard;
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseCard baseCard = (BaseCard) o;
        return cvv == baseCard.cvv && Objects.equals(numberCard, baseCard.numberCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, numberCard);
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
