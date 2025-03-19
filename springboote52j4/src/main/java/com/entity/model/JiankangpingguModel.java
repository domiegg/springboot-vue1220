package com.entity.model;

import com.entity.JiankangpingguEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康评估
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
public class JiankangpingguModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 身体形态分
	 */
	
	private Float shentixingtaifen;
		
	/**
	 * 运动能力分
	 */
	
	private Float yundongnenglifen;
		
	/**
	 * 身体素质分
	 */
	
	private Float shentisuzhifen;
		
	/**
	 * 身体机能分
	 */
	
	private Float shentijinengfen;
		
	/**
	 * 综合素质分
	 */
	
	private Float zonghesuzhifen;
		
	/**
	 * 评估内容
	 */
	
	private String pingguneirong;
		
	/**
	 * 评估日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingguriqi;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：身体形态分
	 */
	 
	public void setShentixingtaifen(Float shentixingtaifen) {
		this.shentixingtaifen = shentixingtaifen;
	}
	
	/**
	 * 获取：身体形态分
	 */
	public Float getShentixingtaifen() {
		return shentixingtaifen;
	}
				
	
	/**
	 * 设置：运动能力分
	 */
	 
	public void setYundongnenglifen(Float yundongnenglifen) {
		this.yundongnenglifen = yundongnenglifen;
	}
	
	/**
	 * 获取：运动能力分
	 */
	public Float getYundongnenglifen() {
		return yundongnenglifen;
	}
				
	
	/**
	 * 设置：身体素质分
	 */
	 
	public void setShentisuzhifen(Float shentisuzhifen) {
		this.shentisuzhifen = shentisuzhifen;
	}
	
	/**
	 * 获取：身体素质分
	 */
	public Float getShentisuzhifen() {
		return shentisuzhifen;
	}
				
	
	/**
	 * 设置：身体机能分
	 */
	 
	public void setShentijinengfen(Float shentijinengfen) {
		this.shentijinengfen = shentijinengfen;
	}
	
	/**
	 * 获取：身体机能分
	 */
	public Float getShentijinengfen() {
		return shentijinengfen;
	}
				
	
	/**
	 * 设置：综合素质分
	 */
	 
	public void setZonghesuzhifen(Float zonghesuzhifen) {
		this.zonghesuzhifen = zonghesuzhifen;
	}
	
	/**
	 * 获取：综合素质分
	 */
	public Float getZonghesuzhifen() {
		return zonghesuzhifen;
	}
				
	
	/**
	 * 设置：评估内容
	 */
	 
	public void setPingguneirong(String pingguneirong) {
		this.pingguneirong = pingguneirong;
	}
	
	/**
	 * 获取：评估内容
	 */
	public String getPingguneirong() {
		return pingguneirong;
	}
				
	
	/**
	 * 设置：评估日期
	 */
	 
	public void setPingguriqi(Date pingguriqi) {
		this.pingguriqi = pingguriqi;
	}
	
	/**
	 * 获取：评估日期
	 */
	public Date getPingguriqi() {
		return pingguriqi;
	}
			
}
