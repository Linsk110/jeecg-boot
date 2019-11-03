package org.jeecg.modules.linsk.kk.entity;

import java.io.Serializable;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;

/**
 * @Description: 人员信息
 * @Author: jeecg-boot
 * @Date:   2019-11-02
 * @Version: V1.0
 */
@Data
@TableName("demo")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="demo对象", description="人员信息")
public class user {
    
	/**主键ID*/
	@TableId(type = IdType.ID_WORKER_STR)
    @ApiModelProperty(value = "主键ID")
	private java.lang.String id;
	/**姓名*/
	@Excel(name = "姓名", width = 15)
    @ApiModelProperty(value = "姓名")
	private java.lang.String name;
	/**关键词*/
	@Excel(name = "关键词", width = 15)
    @ApiModelProperty(value = "关键词")
	private java.lang.String keyWord;
	/**打卡时间*/
	@Excel(name = "打卡时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "打卡时间")
	private java.util.Date punchTime;
	/**工资*/
	@Excel(name = "工资", width = 15)
    @ApiModelProperty(value = "工资")
	private java.math.BigDecimal salaryMoney;
	/**奖金*/
	@Excel(name = "奖金", width = 15)
    @ApiModelProperty(value = "奖金")
	private java.lang.Double bonusMoney;
	/**性别 {男:1,女:2}*/
	@Excel(name = "性别 {男:1,女:2}", width = 15)
    @ApiModelProperty(value = "性别 {男:1,女:2}")
	private java.lang.String sex;
	/**年龄*/
	@Excel(name = "年龄", width = 15)
    @ApiModelProperty(value = "年龄")
	private java.lang.Integer age;
	/**生日*/
	@Excel(name = "生日", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "生日")
	private java.util.Date birthday;
	/**邮箱*/
	@Excel(name = "邮箱", width = 15)
    @ApiModelProperty(value = "邮箱")
	private java.lang.String email;
	/**个人简介*/
	@Excel(name = "个人简介", width = 15)
    @ApiModelProperty(value = "个人简介")
	private java.lang.String content;
	/**创建人*/
	@Excel(name = "创建人", width = 15)
    @ApiModelProperty(value = "创建人")
	private java.lang.String createBy;
	/**创建时间*/
	@Excel(name = "创建时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
	private java.util.Date createTime;
	/**修改人*/
	@Excel(name = "修改人", width = 15)
    @ApiModelProperty(value = "修改人")
	private java.lang.String updateBy;
	/**修改时间*/
	@Excel(name = "修改时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "修改时间")
	private java.util.Date updateTime;
	/**所属部门编码*/
	@Excel(name = "所属部门编码", width = 15)
    @ApiModelProperty(value = "所属部门编码")
	private java.lang.String sysOrgCode;
}
