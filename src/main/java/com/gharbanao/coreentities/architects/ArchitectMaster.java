package com.gharbanao.coreentities.architects;

import java.util.List;

public class ArchitectMaster {
    private String id;
    private String name;
    private List<String> buildings;
    private List<String> projects;
    private float rating;
    private String imageLink;
    private String tagline;
    private String address;
    private String email;
    private String biography;
    private List<String> portFolioLinks;
    private List<ClientTestominial> clientTestominal;
    private List<String> skillsAndTools;
    private List<ProjectTimeline> projectTimelines;
    private List<ServicesAndPricing> servicesAndPricings;
    private String linkedIn;
    private String instagram;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<String> buildings) {
        this.buildings = buildings;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public List<String> getPortFolioLinks() {
        return portFolioLinks;
    }

    public void setPortFolioLinks(List<String> portFolioLinks) {
        this.portFolioLinks = portFolioLinks;
    }

    public List<ClientTestominial> getClientTestominal() {
        return clientTestominal;
    }

    public void setClientTestominal(List<ClientTestominial> clientTestominal) {
        this.clientTestominal = clientTestominal;
    }

    public List<String> getSkillsAndTools() {
        return skillsAndTools;
    }

    public void setSkillsAndTools(List<String> skillsAndTools) {
        this.skillsAndTools = skillsAndTools;
    }

    public List<ProjectTimeline> getProjectTimelines() {
        return projectTimelines;
    }

    public void setProjectTimelines(List<ProjectTimeline> projectTimelines) {
        this.projectTimelines = projectTimelines;
    }

    public List<ServicesAndPricing> getServicesAndPricings() {
        return servicesAndPricings;
    }

    public void setServicesAndPricings(List<ServicesAndPricing> servicesAndPricings) {
        this.servicesAndPricings = servicesAndPricings;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ArchitectMaster{" +
                "name='" + name + '\'' +
                ", buildings=" + buildings +
                ", projects=" + projects +
                ", rating=" + rating +
                ", imageLink='" + imageLink + '\'' +
                ", tagline='" + tagline + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", biography='" + biography + '\'' +
                ", portFolioLinks=" + portFolioLinks +
                ", clientTestominal=" + clientTestominal +
                ", skillsAndTools=" + skillsAndTools +
                ", projectTimelines=" + projectTimelines +
                ", servicesAndPricings=" + servicesAndPricings +
                ", linkedIn='" + linkedIn + '\'' +
                ", instagram='" + instagram + '\'' +
                '}';
    }
}
