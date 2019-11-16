package com.wyb.footprint.domain.entity;


import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@TableName(value = "footprint_t")
public class FootprintT {
    @TableId(value = "footprint_id", type = IdType.AUTO)
    private Integer footprintId;

    /**
     * user id
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 描叙
     */
    @TableField(value = "descript")
    private String descript;

    /**
     * 0表示已下架，1表示未下架
     */
    @TableField(value = "state")
    private Integer state;

    /**
     * 图片
     */
    @TableField(value = "img")
    private String img;

    /**
     * 现价
     */
    @TableField(value = "current_price")
    private Double currentPrice;

    /**
     * 原价
     */
    @TableField(value = "original_price")
    private Double originalPrice;

    /**
     * 购买时间
     */
    @TableField(value = "buytime")
    private Date buytime;

    /**
     * 0表示删除，1表示未删除
     */
    @TableField(value = "locked")
    @TableLogic
    private Integer locked;

    public static final String COL_FOOTPRINT_ID = "footprint_id";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_DESCRIPT = "descript";

    public static final String COL_STATE = "state";

    public static final String COL_IMG = "img";

    public static final String COL_CURRENT_PRICE = "current_price";

    public static final String COL_ORIGINAL_PRICE = "original_price";

    public static final String COL_BUYTIME = "buytime";

    public static final String COL_LOCKED = "locked";
}