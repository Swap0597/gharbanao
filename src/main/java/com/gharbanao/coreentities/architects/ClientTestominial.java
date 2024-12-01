package com.gharbanao.coreentities.architects;

public class ClientTestominial {
    private String testimonial;
    private String testimonialBy;

    public String getTestimonial() {
        return testimonial;
    }

    public void setTestimonial(String testimonial) {
        this.testimonial = testimonial;
    }

    public String getTestimonialBy() {
        return testimonialBy;
    }

    public void setTestimonialBy(String testimonialBy) {
        this.testimonialBy = testimonialBy;
    }

    @Override
    public String toString() {
        return "ClientTestominial{" +
                "testimonial='" + testimonial + '\'' +
                ", testimonialBy='" + testimonialBy + '\'' +
                '}';
    }
}
