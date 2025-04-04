package com.medifinder.LoginRegisterEmail.Requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicineRequest {

    @JsonProperty("medicine_name")
    private String medicineName;
    @JsonProperty("medicine_description")
    private String medicineDescription;
    @JsonProperty("medicine_price")
    private double medicinePrice;
    @JsonProperty("medicine_quantity")
    private int medicineQuantity;
    @JsonProperty("generic_name")
    private String genericName;
}
