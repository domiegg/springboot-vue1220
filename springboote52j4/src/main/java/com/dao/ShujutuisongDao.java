package com.dao;

import com.entity.ShujutuisongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShujutuisongVO;
import com.entity.view.ShujutuisongView;


/**
 * 数据推送
 * 
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
public interface ShujutuisongDao extends BaseMapper<ShujutuisongEntity> {
	
	List<ShujutuisongVO> selectListVO(@Param("ew") Wrapper<ShujutuisongEntity> wrapper);
	
	ShujutuisongVO selectVO(@Param("ew") Wrapper<ShujutuisongEntity> wrapper);
	
	List<ShujutuisongView> selectListView(@Param("ew") Wrapper<ShujutuisongEntity> wrapper);

	List<ShujutuisongView> selectListView(Pagination page,@Param("ew") Wrapper<ShujutuisongEntity> wrapper);
	
	ShujutuisongView selectView(@Param("ew") Wrapper<ShujutuisongEntity> wrapper);
	

}
