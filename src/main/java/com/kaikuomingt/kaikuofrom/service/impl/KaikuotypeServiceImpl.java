package com.kaikuomingt.kaikuofrom.service.impl;

import com.kaikuomingt.kaikuofrom.domain.Kaikuotype;
import com.kaikuomingt.kaikuofrom.mapper.KaikuotypeMapper;
import com.kaikuomingt.kaikuofrom.service.KaikoufromService;
import com.kaikuomingt.kaikuofrom.service.KaikuotypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaikuotypeServiceImpl implements KaikuotypeService {

    @Autowired
    KaikuotypeMapper kaikuotypeMapper;

    /**
     * 根据字典类型查询字典数据信息
     *
     *
     * @return 参数键值
     */
    @Override
    public List<Kaikuotype> getType() {

        List<Kaikuotype> kaikuotypes = kaikuotypeMapper.selectDictDataByType();

        return kaikuotypes;
    }

}
