package com.entity.view;

import com.entity.ShujutuisongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 数据推送
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
@TableName("shujutuisong")
public class ShujutuisongView  extends ShujutuisongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShujutuisongView(){
	}
 
 	public ShujutuisongView(ShujutuisongEntity shujutuisongEntity){
 	try {
			BeanUtils.copyProperties(this, shujutuisongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
