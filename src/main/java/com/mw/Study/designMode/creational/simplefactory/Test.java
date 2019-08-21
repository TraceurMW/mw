package com.mw.Study.designMode.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
//        Video video = new JavaVideo();
//        video.produce();
        VideoFactory videoFactory = new VideoFactory();
        Video java = videoFactory.getVideo("java");
        Video video = videoFactory.getVideo1(JavaVideo.class);
    }
}
