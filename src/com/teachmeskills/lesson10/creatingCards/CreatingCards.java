package com.teachmeskills.lesson10.creatingCards;

import com.teachmeskills.lesson10.card.BaseCard;
import com.teachmeskills.lesson10.client.Client;

public class CreatingCards {

    public static Client getClient() {
        BaseCard belCard1 = new BaseCard(123, "1111-2222-3333-4444", 300);
        BaseCard belCard2 = new BaseCard(123, "1111-2222-3333-4444", 400);
        BaseCard visaCard1 = new BaseCard(321, "1111-2222-3333-4444", 500);
        BaseCard visaCard2 = new BaseCard(123, "1111-2222-3333-4444", 800);
        BaseCard masterCard1 = new BaseCard(321, "1111-2222-3333-4444", 100);
        BaseCard masterCard2 = new BaseCard(531, "1234-2345-3456-4567", 300);
        BaseCard[] baseCard = new BaseCard[]{belCard1, belCard2, visaCard1, visaCard2, masterCard1, masterCard2};
        return new Client("Bob", baseCard);
    }

}
