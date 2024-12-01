package com.gharbanao.coreentities.architects;

public class ServicesAndPricing {
    private String service;
    private String detail;
    private String charges;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "ServicesAndPricing{" +
                "service='" + service + '\'' +
                ", detail='" + detail + '\'' +
                ", charges='" + charges + '\'' +
                '}';
    }
}
