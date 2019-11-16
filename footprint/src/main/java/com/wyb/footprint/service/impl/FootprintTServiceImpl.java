package com.wyb.footprint.service.impl;

import com.wyb.footprint.domain.entity.FootprintT;
import com.wyb.footprint.mapper.FootprintTMapper;
import com.wyb.footprint.service.FootprintTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FootprintTServiceImpl implements FootprintTService{
    @Resource
    FootprintTMapper mapper;

    @Override
    public List<FootprintT> selectByUserId(Integer userId) {
        return mapper.selectByUserId(userId);
    }

    @Override
    public int updateById(Integer footprintId) {
        return mapper.updateById(footprintId);
    }
}
