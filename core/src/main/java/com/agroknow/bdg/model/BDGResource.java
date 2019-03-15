package com.agroknow.bdg.model;

import com.yoshtec.owl.annotations.OwlClass;
import com.yoshtec.owl.annotations.OwlDataProperty;
import com.yoshtec.owl.annotations.OwlIndividualId;
import com.yoshtec.owl.annotations.dprop.OwlFunctionalDataProperty;
import com.yoshtec.owl.annotations.OwlDataType;

@OwlClass(uri="http://dev.bigdatagrapes.eu#BDGResource")
public class BDGResource {

    @OwlIndividualId
    private String id;


    public BDGResource() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
