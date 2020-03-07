package com.kaikuomingt.kaikuofrom.mapper;

import com.kaikuomingt.kaikuofrom.domain.Kaikuotype;

import java.util.List;

public interface KaikuotypeMapper {


    List<Kaikuotype> selectDictDataByType();

    Kaikuotype selectlable(String lable);
}
