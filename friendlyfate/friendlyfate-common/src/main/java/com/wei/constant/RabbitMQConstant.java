package com.wei.constant;

/**
 * @author Administrator
 */

public enum RabbitMQConstant {
    EXCHANGE_A("EXCHANGE_A", "my-mq-exchange_A"),
    EXCHANGE_B("EXCHANGE_B", "my-mq-exchange_B"),
    EXCHANGE_C("EXCHANGE_C", "my-mq-exchange_C"),


    QUEUE_A("QUEUE_A", "QUEUE_A"),
    QUEUE_B("QUEUE_B", "QUEUE_B"),
    QUEUE_C("QUEUE_C", "QUEUE_C"),

    ROUTINGKEY_A("ROUTINGKEY_A", "spring.boot.routingKey.A"),
    ROUTINGKEY_B("ROUTINGKEY_B", "spring.boot.routingKey.B"),
    ROUTINGKEY_C("ROUTINGKEY_C", "spring.boot.routingKey.C");

    RabbitMQConstant(String key, String value) {
        this.key = key;
        this.value = value;
    }

    RabbitMQConstant() {
    }

    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static String getValue(String key){
        RabbitMQConstant[] values = RabbitMQConstant.values();
        for (RabbitMQConstant value : values) {
            if(value.getKey().equals(key)){
                return value.getValue();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.key;
    }
}
