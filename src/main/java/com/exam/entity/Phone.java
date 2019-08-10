package com.exam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Phone {
    @Id
    private String id;
    private String name;
    private String brand;
    private Long price;
    private String description;
    private String createdAtMLS;
    private String updatedAtMLS;
    private int status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAtMLS() {
        return createdAtMLS;
    }

    public void setCreatedAtMLS(String createdAtMLS) {
        this.createdAtMLS = createdAtMLS;
    }

    public String getUpdatedAtMLS() {
        return updatedAtMLS;
    }

    public void setUpdatedAtMLS(String updatedAtMLS) {
        this.updatedAtMLS = updatedAtMLS;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public static final class Builder {
        private String id;
        private String name;
        private String brand;
        private Long price;
        private String description;
        private String createdAtMLS;
        private String updatedAtMLS;
        private int status;

        private Builder() {
        }

        public static Builder aPhone() {
            return new Builder();
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder withPrice(Long price) {
            this.price = price;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withCreatedAtMLS(String createdAtMLS) {
            this.createdAtMLS = createdAtMLS;
            return this;
        }

        public Builder withUpdatedAtMLS(String updatedAtMLS) {
            this.updatedAtMLS = updatedAtMLS;
            return this;
        }

        public Builder withStatus(int status) {
            this.status = status;
            return this;
        }

        public Phone build() {
            Phone phone = new Phone();
            phone.setId(id);
            phone.setName(name);
            phone.setBrand(brand);
            phone.setPrice(price);
            phone.setDescription(description);
            phone.setCreatedAtMLS(createdAtMLS);
            phone.setUpdatedAtMLS(updatedAtMLS);
            phone.setStatus(status);
            return phone;
        }
    }
}
