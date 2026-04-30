package com.school.labs.lab05.Test.two;

public class Machine {
    public void checkBag(Goods goods) throws DangerException {
        if (goods.isDanger()) {
            throw new DangerException();
        }
    }
}