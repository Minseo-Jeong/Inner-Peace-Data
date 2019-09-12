package com.kmj.innerpeace.Data;

public class SendData {
    int label;
    EEGData data ;

    public SendData(int label, EEGData data) {
        this.label = label;
        this.data = data;
    }
}
