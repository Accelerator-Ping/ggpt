package com.adv.pojo;

public class Advert {
    private Integer advId;

    private Integer type;

    private Integer categoryId;

    private String advName;

    private String advText;

    private String advImage;

    public Advert(Integer advId, Integer type, Integer categoryId, String advName, String advText, String advImage) {
        this.advId = advId;
        this.type = type;
        this.categoryId = categoryId;
        this.advName = advName;
        this.advText = advText;
        this.advImage = advImage;
    }

    public Advert() {
        super();
    }

    public Integer getAdvId() {
        return advId;
    }

    public void setAdvId(Integer advId) {
        this.advId = advId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getAdvName() {
        return advName;
    }

    public void setAdvName(String advName) {
        this.advName = advName == null ? null : advName.trim();
    }

    public String getAdvText() {
        return advText;
    }

    public void setAdvText(String advText) {
        this.advText = advText == null ? null : advText.trim();
    }

    public String getAdvImage() {
        return advImage;
    }

    public void setAdvImage(String advImage) {
        this.advImage = advImage == null ? null : advImage.trim();
    }
}