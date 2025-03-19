package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShujutuisongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShujutuisongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShujutuisongView;


/**
 * 数据推送
 *
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
public interface ShujutuisongService extends IService<ShujutuisongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShujutuisongVO> selectListVO(Wrapper<ShujutuisongEntity> wrapper);
   	
   	ShujutuisongVO selectVO(@Param("ew") Wrapper<ShujutuisongEntity> wrapper);
   	
   	List<ShujutuisongView> selectListView(Wrapper<ShujutuisongEntity> wrapper);
   	
   	ShujutuisongView selectView(@Param("ew") Wrapper<ShujutuisongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShujutuisongEntity> wrapper);
   	

}

