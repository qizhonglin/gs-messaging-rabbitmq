package com.philips.rabbitmq;

import java.util.concurrent.CountDownLatch;

/**
 * Created by 310031267 on 2016/4/13.
 */
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
