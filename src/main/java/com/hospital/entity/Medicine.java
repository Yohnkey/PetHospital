package com.hospital.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by zhuzheng on 17/3/16.
 */
@Entity
public class Medicine {
    private int medicineId;
    private String medicineName;
    private Double medicinePrice;
    private Integer medicineType;
    private String description;

    @Id
    @Column(name = "medicine_id", nullable = false)
    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    @Basic
    @Column(name = "medicine_name", nullable = true, length = 255)
    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    @Basic
    @Column(name = "medicine_price", nullable = true, precision = 0)
    public Double getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(Double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    @Basic
    @Column(name = "medicine_type", nullable = true)
    public Integer getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(Integer medicineType) {
        this.medicineType = medicineType;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Medicine medicine = (Medicine) o;

        if (medicineId != medicine.medicineId) return false;
        if (medicineName != null ? !medicineName.equals(medicine.medicineName) : medicine.medicineName != null)
            return false;
        if (medicinePrice != null ? !medicinePrice.equals(medicine.medicinePrice) : medicine.medicinePrice != null)
            return false;
        if (medicineType != null ? !medicineType.equals(medicine.medicineType) : medicine.medicineType != null)
            return false;
        if (description != null ? !description.equals(medicine.description) : medicine.description != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = medicineId;
        result = 31 * result + (medicineName != null ? medicineName.hashCode() : 0);
        result = 31 * result + (medicinePrice != null ? medicinePrice.hashCode() : 0);
        result = 31 * result + (medicineType != null ? medicineType.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
