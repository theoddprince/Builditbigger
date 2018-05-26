package com.udacity.gradle.builditbigger.backend;

import udacity.com.joketeller.JokeTeller;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private JokeTeller joketeller;

    public MyBean() {
        joketeller = new JokeTeller();
    }

    public String getRandomJoke()
    {
        return joketeller.getRandomJoke();
    }

    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }


}