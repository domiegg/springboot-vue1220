package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiceshujuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiceshujuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiceshujuView;


/**
 * 体测数据
 *
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
public interface TiceshujuService extends IService<TiceshujuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiceshujuVO> selectListVO(Wrapper<TiceshujuEntity> wrapper);
   	
   	TiceshujuVO selectVO(@Param("ew") Wrapper<TiceshujuEntity> wrapper);
   	
   	List<TiceshujuView> selectListView(Wrapper<TiceshujuEntity> wrapper);
   	
   	TiceshujuView selectView(@Param("ew") Wrapper<TiceshujuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiceshujuEntity> wrapper);
   	

}

