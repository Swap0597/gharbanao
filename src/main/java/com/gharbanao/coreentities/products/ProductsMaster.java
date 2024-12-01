package com.gharbanao.coreentities.products;

import java.util.List;

public class ProductsMaster {
    String id;
    boolean enable;
    String name;
    String info;
    List<String> features;
    String settingTime;
    String size;
    String imageLink;
    String additionalInfo1;
    String additionalInfo2;
    String additionalInfo3;
    String types;
    String strength;
    String sustainability;
    String path;

    public ProductsMaster() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public String getSettingTime() {
        return settingTime;
    }

    public void setSettingTime(String settingTime) {
        this.settingTime = settingTime;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getAdditionalInfo1() {
        return additionalInfo1;
    }

    public void setAdditionalInfo1(String additionalInfo1) {
        this.additionalInfo1 = additionalInfo1;
    }

    public String getAdditionalInfo2() {
        return additionalInfo2;
    }

    public void setAdditionalInfo2(String additionalInfo2) {
        this.additionalInfo2 = additionalInfo2;
    }

    public String getAdditionalInfo3() {
        return additionalInfo3;
    }

    public void setAdditionalInfo3(String additionalInfo3) {
        this.additionalInfo3 = additionalInfo3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isEnable() {
        return enable;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getSustainability() {
        return sustainability;
    }

    public void setSustainability(String sustainability) {
        this.sustainability = sustainability;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
