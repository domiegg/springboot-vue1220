package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShujutuisongDao;
import com.entity.ShujutuisongEntity;
import com.service.ShujutuisongService;
import com.entity.vo.ShujutuisongVO;
import com.entity.view.ShujutuisongView;

@Service("shujutuisongService")
public class ShujutuisongServiceImpl extends ServiceImpl<ShujutuisongDao, ShujutuisongEntity> implements ShujutuisongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShujutuisongEntity> page = this.selectPage(
                new Query<ShujutuisongEntity>(params).getPage(),
                new EntityWrapper<ShujutuisongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShujutuisongEntity> wrapper) {
		  Page<ShujutuisongView> page =new Query<ShujutuisongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShujutuisongVO> selectListVO(Wrapper<ShujutuisongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShujutuisongVO selectVO(Wrapper<ShujutuisongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShujutuisongView> selectListView(Wrapper<ShujutuisongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShujutuisongView selectView(Wrapper<ShujutuisongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
