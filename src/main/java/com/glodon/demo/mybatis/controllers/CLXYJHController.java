package com.glodon.demo.mybatis.controllers;

import com.glodon.demo.mybatis.mappers.XYJHMapper;
import com.glodon.demo.mybatis.models.XYJH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/CLXYJH")
public class CLXYJHController {

    @Autowired
    private XYJHMapper xyjhMapper;

    @RequestMapping("/All")
    public List<XYJH> SelectAll(){
        return xyjhMapper.selectAll();
    }

}
