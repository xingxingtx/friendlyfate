package com.wei.io;

import java.util.List;

public class MsgPayload {
    private String name;
    private static List<String> result;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<String> getResult() {
        return result;
    }

    public static void setResult(List<String> result) {
        MsgPayload.result = result;
    }
}
