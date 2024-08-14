package LLD.Patterns.behavioral.template;

import LLD.Patterns.behavioral.template.paymentMethods.PayToFriend;
import LLD.Patterns.behavioral.template.paymentMethods.PayToMerchant;

public class Main {
    public static void main(String[] args) {

        //? Template pattern
        Payment paymentToFriend= new PayToFriend();
        paymentToFriend.sendMoney();

        PayToMerchant payToMerchant= new PayToMerchant();
        payToMerchant.sendMoney();

    }
}
