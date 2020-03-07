package com.kaikuomingt.kaikuofrom.service.impl;

import com.kaikuomingt.kaikuofrom.domain.Kaikoufrom;
import com.kaikuomingt.kaikuofrom.domain.Kaikuotype;
import com.kaikuomingt.kaikuofrom.mapper.KaikoufromMapper;
import com.kaikuomingt.kaikuofrom.mapper.KaikuotypeMapper;
import com.kaikuomingt.kaikuofrom.service.KaikoufromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KaikoufromServiceImpl implements KaikoufromService {

    @Autowired
    KaikoufromMapper kaikoufromMapper;

    @Autowired
    KaikuotypeMapper kaikuotypeMapper;

    //添加进入数据库
    @Override
    public void addfrom(List<Kaikoufrom> listname) {

        for (Kaikoufrom kaikoufrom:listname) {

            kaikoufromMapper.addfrom(kaikoufrom);
        }

    }

    @Override
    public List<Kaikoufrom> list() {
        return kaikoufromMapper.list();
    }
}
