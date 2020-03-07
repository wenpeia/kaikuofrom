package com.kaikuomingt.kaikuofrom.domain;

import javax.persistence.Id;

/**
 *
 * @author Administrator
 */
public class Kaikuotype {

    @Id
    private Long id;

    private String lable;

    private String value;

    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Kaikuotype{" +
                "id=" + id +
                ", lable='" + lable + '\'' +
                ", value='" + value + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
