package com.mdc.test2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 权限表
 *
 * @author yzjk code generator
 * @date 2019-11-01 00:13:11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_permission")
public class Permission extends Model<Permission> implements Serializable {
private static final long serialVersionUID = 1L;

    /**
   * 
   */
    @TableId(type = IdType.INPUT)
    private Long id;
    /**
   * 父权限
   */
    private Long parentId;
    /**
   * 权限名称
   */
    private String name;
    /**
   * 权限英文名称
   */
    private String enname;
    /**
   * 授权路径
   */
    private String url;
    /**
   * 备注
   */
    private String description;
    /**
   * 
   */
    private Date created;
    /**
   * 
   */
    private Date updated;
  
}
