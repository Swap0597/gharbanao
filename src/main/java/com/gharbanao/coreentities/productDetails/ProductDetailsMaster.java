package com.gharbanao.coreentities.productDetails;

import java.util.List;

public class ProductDetailsMaster {
    private String category;
    private String tipperEnabled;
    private String name;
    private List<String> vehicleInfo;
//    private String vehicleInfo;
    private String imageLink;
    private String enabled;
    private String info;
    private  List<ButtonInfo> buttonInfos;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTipperEnabled() {
        return tipperEnabled;
    }

    public void setTipperEnabled(String tipperEnabled) {
        this.tipperEnabled = tipperEnabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getVehicleInfo() {
        return vehicleInfo;
    }

    public void setVehicleInfo(List<String> vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

//    public String getProductWiseInfo() {
//        return productWiseInfo;
//    }
//
//    public void setProductWiseInfo(String productWiseInfo) {
//        this.productWiseInfo = productWiseInfo;
//    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<ButtonInfo> getButtonInfos() {
        return buttonInfos;
    }

    public void setButtonInfos(List<ButtonInfo> buttonInfos) {
        this.buttonInfos = buttonInfos;
    }
}
