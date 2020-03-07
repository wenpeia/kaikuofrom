package com.kaikuomingt.kaikuofrom.mapper;

import com.kaikuomingt.kaikuofrom.domain.Kaikoufrom;

import java.util.List;

public interface KaikoufromMapper {
    //添加表单
     void addfrom(Kaikoufrom listname);

    List<Kaikoufrom> list();

}
