package com.mw.Study.designMode.creational.factorymethod;

public class PyhtonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
