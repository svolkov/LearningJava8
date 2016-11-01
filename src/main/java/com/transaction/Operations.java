package com.transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by sergey.volkov on 10/28/2016.
 */
public class Operations {
    public static void main(String[] args){
        Trader rauol = new Trader("Rauol","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(rauol, 2012, 1000),
                new Transaction(rauol, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        transactions.stream().forEach(System.out::println);

        //transactions.stream().filter(t -> t.getYear() == 2011).sorted(Comparator.comparing(Fun))
    }
}
