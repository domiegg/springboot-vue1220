package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussceshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussceshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussceshixinxiView;


/**
 * 测试信息评论表
 *
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
public interface DiscussceshixinxiService extends IService<DiscussceshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussceshixinxiVO> selectListVO(Wrapper<DiscussceshixinxiEntity> wrapper);
   	
   	DiscussceshixinxiVO selectVO(@Param("ew") Wrapper<DiscussceshixinxiEntity> wrapper);
   	
   	List<DiscussceshixinxiView> selectListView(Wrapper<DiscussceshixinxiEntity> wrapper);
   	
   	DiscussceshixinxiView selectView(@Param("ew") Wrapper<DiscussceshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussceshixinxiEntity> wrapper);
   	

}

