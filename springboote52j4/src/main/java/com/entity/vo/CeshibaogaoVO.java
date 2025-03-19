package com.entity.vo;

import com.entity.CeshibaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 测试报告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
public class CeshibaogaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 测试班级
	 */
	
	private String ceshibanji;
		
	/**
	 * 测试地点
	 */
	
	private String ceshididian;
		
	/**
	 * 测试成绩
	 */
	
	private Float ceshichengji;
		
	/**
	 * 排名
	 */
	
	private Integer paiming;
		
	/**
	 * 体测建议
	 */
	
	private String ticejianyi;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：测试班级
	 */
	 
	public void setCeshibanji(String ceshibanji) {
		this.ceshibanji = ceshibanji;
	}
	
	/**
	 * 获取：测试班级
	 */
	public String getCeshibanji() {
		return ceshibanji;
	}
				
	
	/**
	 * 设置：测试地点
	 */
	 
	public void setCeshididian(String ceshididian) {
		this.ceshididian = ceshididian;
	}
	
	/**
	 * 获取：测试地点
	 */
	public String getCeshididian() {
		return ceshididian;
	}
				
	
	/**
	 * 设置：测试成绩
	 */
	 
	public void setCeshichengji(Float ceshichengji) {
		this.ceshichengji = ceshichengji;
	}
	
	/**
	 * 获取：测试成绩
	 */
	public Float getCeshichengji() {
		return ceshichengji;
	}
				
	
	/**
	 * 设置：排名
	 */
	 
	public void setPaiming(Integer paiming) {
		this.paiming = paiming;
	}
	
	/**
	 * 获取：排名
	 */
	public Integer getPaiming() {
		return paiming;
	}
				
	
	/**
	 * 设置：体测建议
	 */
	 
	public void setTicejianyi(String ticejianyi) {
		this.ticejianyi = ticejianyi;
	}
	
	/**
	 * 获取：体测建议
	 */
	public String getTicejianyi() {
		return ticejianyi;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
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
			
}
