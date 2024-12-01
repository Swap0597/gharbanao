package com.gharbanao.coreentities.houses;

import java.util.List;

public class HouseMaster {
    String id;
    private String name;
    private String type;
    private String designedBy;
    private String plotSize;
    private String price;
    private List<String> svgPath;
    private String imageLink;
    private HouseDetailsMaster houseDetailsMaster;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesignedBy() {
        return designedBy;
    }

    public void setDesignedBy(String designedBy) {
        this.designedBy = designedBy;
    }

    public String getPlotSize() {
        return plotSize;
    }

    public void setPlotSize(String plotSize) {
        this.plotSize = plotSize;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<String> getSvgPath() {
        return svgPath;
    }

    public void setSvgPath(List<String> svgPath) {
        this.svgPath = svgPath;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HouseDetailsMaster getHouseDetailsMaster() {
        return houseDetailsMaster;
    }

    public void setHouseDetailsMaster(HouseDetailsMaster houseDetailsMaster) {
        this.houseDetailsMaster = houseDetailsMaster;
    }

    @Override
    public String toString() {
        return "HouseMaster{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", designedBy='" + designedBy + '\'' +
                ", plotSize='" + plotSize + '\'' +
                ", price='" + price + '\'' +
                ", svgPath=" + svgPath +
                ", imageLink='" + imageLink + '\'' +
                ", houseDetailsMaster=" + houseDetailsMaster +
                '}';
    }
}
