package com.kaikuomingt.kaikuofrom.controller;


import com.kaikuomingt.kaikuofrom.domain.Kaikoufrom;
import com.kaikuomingt.kaikuofrom.domain.Kaikuotype;
import com.kaikuomingt.kaikuofrom.service.KaikoufromService;
import com.kaikuomingt.kaikuofrom.service.KaikuotypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping
public class KaikuofromController {

    @Autowired
    KaikoufromService kaikoufromService;

    @Autowired
    KaikuotypeService kaikuotypeService;



    //跳转管理员页面
    @RequestMapping("/")
    public String indexfrom(ModelMap modelMap){
        List<Kaikuotype> type = kaikuotypeService.getType();
        modelMap.put("type",type);
        return "index";
    }

    /**
     * 添加到kaikoufrom表跳转表格页面
     * @param listname
     *
     */

    @RequestMapping(value = "/addfrom" )
    public String addfrom(@RequestParam List<String> listname,@RequestParam List<String> kaikuoelection,
                          @RequestParam List<String> typefrom,@RequestParam List<String> typeinput,ModelMap modelMap){


        List<Kaikoufrom> kaikoufromList=new ArrayList<>();
        for (int i = 0; i < listname.size(); i++) {
            Kaikoufrom kaikoufrom=new Kaikoufrom();
            String name = listname.get(i);
            String kaikuoelection1 = kaikuoelection.get(i);
            String typefrom1 = typefrom.get(i);
            String typeinput1 = typeinput.get(i);

            kaikoufrom.setName(name);
            kaikoufrom.setKaikuoelection(kaikuoelection1);
            kaikoufrom.setTypefrom(typefrom1);
            kaikoufrom.setTypeinput(typeinput1);
            kaikoufromList.add(kaikoufrom);
        }
        //不为空
        if (!CollectionUtils.isEmpty(listname)){
            kaikoufromService.addfrom(kaikoufromList);
        }
        List<Kaikoufrom> listKaikoufrom = kaikoufromService.list();
        modelMap.put("listKaikoufrom",listKaikoufrom);
        return  "from";

    }




}
