package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CeshibaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CeshibaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CeshibaomingView;


/**
 * 测试报名
 *
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
public interface CeshibaomingService extends IService<CeshibaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CeshibaomingVO> selectListVO(Wrapper<CeshibaomingEntity> wrapper);
   	
   	CeshibaomingVO selectVO(@Param("ew") Wrapper<CeshibaomingEntity> wrapper);
   	
   	List<CeshibaomingView> selectListView(Wrapper<CeshibaomingEntity> wrapper);
   	
   	CeshibaomingView selectView(@Param("ew") Wrapper<CeshibaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CeshibaomingEntity> wrapper);
   	

}

