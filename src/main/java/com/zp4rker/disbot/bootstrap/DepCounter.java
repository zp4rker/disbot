package com.zp4rker.disbot.bootstrap;

/**
 * @author zp4rker
 */
public class DepCounter {

    private int count = 0;
    private final int size;

    private String string;

    private final Runnable onComplete;

    public DepCounter(int size, Runnable onComplete) {
        this.size = size;
        this.onComplete = onComplete;
        string = "Loading libraries... " + count + "/" + size;
        System.out.print(string);
    }

    public void increment() {
        count++;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            sb.append("\b");
        }
        string = "Loading libraries... " + count + "/" + size;
        if (count < size) {
            sb.append(string);
            System.out.print(sb.toString());
        } else {
            sb.append(string);
            System.out.println(sb.toString());
            System.out.println("Succesfully loaded libraries.");
            onComplete.run();
        }
    }

}
