package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("goods")
public class Goods implements Serializable {

    @TableId(type = IdType.AUTO)//mabatis-plus主键回填
    private int id;
    @TableField("good_name")
    private String goodName;
    @TableField("good_price")
    private BigDecimal goodPrice;
    @TableField("good_save")
    private int goodSave;
    @TableField("good_info")
    private String goodInfo;
    @TableField("good_image")
    private String goodImage;
    private int status;
    private Date createtime=new Date();
    private int tid;

}
