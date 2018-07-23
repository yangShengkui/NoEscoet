package com.slk.wph.module.WPH_Orderingnursing.mapper;

import com.slk.wph.module.WPH_Orderingnursing.po.WphOrderingnursing;
import com.slk.wph.module.WPH_Orderingnursing.po.WphOrderingnursingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphOrderingnursingMapper {
    int countByExample(WphOrderingnursingExample example);

    int deleteByExample(WphOrderingnursingExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphOrderingnursing record);

    int insertSelective(WphOrderingnursing record);

    List<WphOrderingnursing> selectByExample(WphOrderingnursingExample example);

    WphOrderingnursing selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphOrderingnursing record, @Param("example") WphOrderingnursingExample example);

    int updateByExample(@Param("record") WphOrderingnursing record, @Param("example") WphOrderingnursingExample example);

    int updateByPrimaryKeySelective(WphOrderingnursing record);

    int updateByPrimaryKey(WphOrderingnursing record);
}