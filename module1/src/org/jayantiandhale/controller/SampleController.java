package org.jayantiandhale.controller;

import org.jayantiandhale.model.Sample;

public class SampleController {

    public String getSampleData() {
        Sample sample=new Sample("sampleData","sampleDescription");
        return sample.getData();

    }

}
