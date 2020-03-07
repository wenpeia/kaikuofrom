package com.kaikuomingt.kaikuofrom.domain;

import javax.persistence.Id;
public class Kaikoufrom {

    @Id
    private Long id;

    //表单名字
    private String name;
    //必填与非必填
    private String kaikuoelection;
    //表单校验格式
    private String typefrom;
    //input里属性type格式
    private String typeinput;

    public String getTypeinput() {
        return typeinput;
    }

    public void setTypeinput(String typeinput) {
        this.typeinput = typeinput;
    }

    public String getKaikuoelection() {
        return kaikuoelection;
    }

    public void setKaikuoelection(String kaikuoelection) {
        this.kaikuoelection = kaikuoelection;
    }

    public String getTypefrom() {
        return typefrom;
    }

    public void setTypefrom(String typefrom) {
        this.typefrom = typefrom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Kaikoufrom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kaikuoelection='" + kaikuoelection + '\'' +
                ", typefrom='" + typefrom + '\'' +
                '}';
    }
}
