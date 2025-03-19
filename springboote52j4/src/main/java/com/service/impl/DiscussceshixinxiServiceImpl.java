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


import com.dao.DiscussceshixinxiDao;
import com.entity.DiscussceshixinxiEntity;
import com.service.DiscussceshixinxiService;
import com.entity.vo.DiscussceshixinxiVO;
import com.entity.view.DiscussceshixinxiView;

@Service("discussceshixinxiService")
public class DiscussceshixinxiServiceImpl extends ServiceImpl<DiscussceshixinxiDao, DiscussceshixinxiEntity> implements DiscussceshixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussceshixinxiEntity> page = this.selectPage(
                new Query<DiscussceshixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussceshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussceshixinxiEntity> wrapper) {
		  Page<DiscussceshixinxiView> page =new Query<DiscussceshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussceshixinxiVO> selectListVO(Wrapper<DiscussceshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussceshixinxiVO selectVO(Wrapper<DiscussceshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussceshixinxiView> selectListView(Wrapper<DiscussceshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussceshixinxiView selectView(Wrapper<DiscussceshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
