package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> {
            List<Integer> list = new ArrayList<>();
            arg.forEach(item -> list.add(item / divider));
            return list;
        };
    }
}
