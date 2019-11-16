package com.wyb.footprint.service;

import com.wyb.footprint.domain.entity.FootprintT;

import java.util.List;

public interface FootprintTService {
    List<FootprintT> selectByUserId(Integer userId);
    int updateById(Integer footprintId);
}
