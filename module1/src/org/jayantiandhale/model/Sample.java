package org.jayantiandhale.model;

public class Sample {
    String data;
    String description;

    public Sample(String data, String description) {
            super();
            this.data = data;
            this.description = description;
            }
    public String getData() {
            return data;
            }
    public void setData(String data) {
            this.data = data;
            }
    public String getDescription() {
            return description;
            }
    public void setDescription(String description) {
            this.description = description;
            }
}
