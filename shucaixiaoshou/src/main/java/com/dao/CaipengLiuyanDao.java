package com.dao;

import com.entity.CaipengLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipengLiuyanView;

/**
 * 菜棚留言 Dao 接口
 *
 * @author 
 */
public interface CaipengLiuyanDao extends BaseMapper<CaipengLiuyanEntity> {

   List<CaipengLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
