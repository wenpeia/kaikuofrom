package com.kaikuomingt.kaikuofrom.service;

import com.kaikuomingt.kaikuofrom.domain.Kaikoufrom;

import java.util.List;

public interface KaikoufromService {
    //添加表单
    void addfrom(List<Kaikoufrom> listname);

    List<Kaikoufrom> list();
}
