package com.kmj.innerpeace.Data;

public class SaveRes {
    String result;
    String message;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SaveRes(String result, String message) {
        this.result = result;
        this.message = message;
    }
}
