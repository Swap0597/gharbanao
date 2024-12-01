package com.gharbanao.coreentities.houses;

import java.util.List;

public class HouseDetailsMaster {

    private String bedRooms;
    private String bathrooms;
    private String locations;
    private int buildYear;
    private String architect;
    private String info;
    private List<String> corousalImageLinks;
    private List<String> amenities;
    private String lat;
    private String lng;

    private String agentName;
    private String agentPhone;
    private String agentEmail;
    private String videoLink;

    public String getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(String bedRooms) {
        this.bedRooms = bedRooms;
    }

    public String getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(String bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        locations = locations;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public String getArchitect() {
        return architect;
    }

    public void setArchitect(String architect) {
        this.architect = architect;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<String> getCorousalImageLinks() {
        return corousalImageLinks;
    }

    public void setCorousalImageLinks(List<String> corousalImageLinks) {
        this.corousalImageLinks = corousalImageLinks;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
    }

    public String getAgentEmail() {
        return agentEmail;
    }

    public void setAgentEmail(String agentEmail) {
        this.agentEmail = agentEmail;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    @Override
    public String toString() {
        return "HouseDetailsMaster{" +
                "bedRooms='" + bedRooms + '\'' +
                ", bathrooms='" + bathrooms + '\'' +
                ", Locations='" + locations + '\'' +
                ", buildYear=" + buildYear +
                ", ArchitectMaster='" + architect + '\'' +
                ", info='" + info + '\'' +
                ", corousalImageLinks=" + corousalImageLinks +
                ", amenities=" + amenities +
                ", lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                ", agentName='" + agentName + '\'' +
                ", agentPhone='" + agentPhone + '\'' +
                ", agentEmail='" + agentEmail + '\'' +
                ", videoLink='" + videoLink + '\'' +
                '}';
    }
}
