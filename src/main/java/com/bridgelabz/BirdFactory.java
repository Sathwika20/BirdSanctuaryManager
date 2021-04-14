package com.bridgelabz;

public class BirdFactory {

    public static String getBird(String bird) {
        switch (bird) {
            case "duck":
                bird = "duck";
                System.out.println("duck");
                break;
            case "penguin":
                bird = "penguin";
                System.out.println("penguin");
                break;
            case "parrot":
                bird = "parrot";
                System.out.println("parrot");
        }
        return bird;

    }
}
