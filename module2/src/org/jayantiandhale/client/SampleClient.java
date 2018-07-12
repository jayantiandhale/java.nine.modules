package org.jayantiandhale.client;

import org.jayantiandhale.controller.SampleController;
//import org.jayantiandhale.model.Sample; //gives " not accessible" error
public class SampleClient {
    public static void main(String[] args) {
        SampleController controller=new SampleController();
        System.out.println(controller.getSampleData());
        //Model  model=new Model();
    }
}
