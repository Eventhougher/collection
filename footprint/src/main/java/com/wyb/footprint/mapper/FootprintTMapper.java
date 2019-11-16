package com.wyb.footprint.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.wyb.footprint.domain.entity.FootprintT;import java.util.List;

public interface FootprintTMapper extends BaseMapper<FootprintT> {


    List<FootprintT> selectByUserId(Integer userId);

    //假删除
    int updateById(Integer footprintId);
}