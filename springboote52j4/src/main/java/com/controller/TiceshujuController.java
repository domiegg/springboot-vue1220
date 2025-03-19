package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.TiceshujuEntity;
import com.entity.view.TiceshujuView;

import com.service.TiceshujuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 体测数据
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
@RestController
@RequestMapping("/ticeshuju")
public class TiceshujuController {
    @Autowired
    private TiceshujuService ticeshujuService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TiceshujuEntity ticeshuju,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			ticeshuju.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			ticeshuju.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TiceshujuEntity> ew = new EntityWrapper<TiceshujuEntity>();
		PageUtils page = ticeshujuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ticeshuju), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TiceshujuEntity ticeshuju, 
		HttpServletRequest request){
        EntityWrapper<TiceshujuEntity> ew = new EntityWrapper<TiceshujuEntity>();
		PageUtils page = ticeshujuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ticeshuju), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TiceshujuEntity ticeshuju){
       	EntityWrapper<TiceshujuEntity> ew = new EntityWrapper<TiceshujuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ticeshuju, "ticeshuju")); 
        return R.ok().put("data", ticeshujuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TiceshujuEntity ticeshuju){
        EntityWrapper< TiceshujuEntity> ew = new EntityWrapper< TiceshujuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ticeshuju, "ticeshuju")); 
		TiceshujuView ticeshujuView =  ticeshujuService.selectView(ew);
		return R.ok("查询体测数据成功").put("data", ticeshujuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TiceshujuEntity ticeshuju = ticeshujuService.selectById(id);
        return R.ok().put("data", ticeshuju);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TiceshujuEntity ticeshuju = ticeshujuService.selectById(id);
        return R.ok().put("data", ticeshuju);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TiceshujuEntity ticeshuju, HttpServletRequest request){
    	ticeshuju.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ticeshuju);
        ticeshujuService.insert(ticeshuju);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TiceshujuEntity ticeshuju, HttpServletRequest request){
    	ticeshuju.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ticeshuju);
        ticeshujuService.insert(ticeshuju);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TiceshujuEntity ticeshuju, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ticeshuju);
        ticeshujuService.updateById(ticeshuju);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ticeshujuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<TiceshujuEntity> wrapper = new EntityWrapper<TiceshujuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshigonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = ticeshujuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
