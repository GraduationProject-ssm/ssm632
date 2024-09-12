package com.dao;

import com.entity.ZhiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyuanView;

/**
 * 职员 Dao 接口
 *
 * @author 
 */
public interface ZhiyuanDao extends BaseMapper<ZhiyuanEntity> {

   List<ZhiyuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}