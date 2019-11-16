package com.wyb.footprint.controller;

import com.wyb.footprint.domain.entity.FootprintT;
import com.wyb.footprint.service.FootprintTService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FootprintTController {
    @Resource
    FootprintTService service;

    //查询
    @RequestMapping("/footprint/{userId}")
    public List<FootprintT> selectByUserId(@PathVariable Integer userId){
        return service.selectByUserId(userId);
    }
    //假删除
    @RequestMapping("/delete/{footprintId}")
    public int updateById(@PathVariable Integer footprintId){
        return service.updateById(footprintId);
    }
}

