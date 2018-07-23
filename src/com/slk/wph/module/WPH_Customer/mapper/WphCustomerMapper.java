package com.slk.wph.module.WPH_Customer.mapper;

import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Customer.po.WphCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphCustomerMapper {
    int countByExample(WphCustomerExample example);

    int deleteByExample(WphCustomerExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphCustomer record);

    int insertSelective(WphCustomer record);

    List<WphCustomer> selectByExample(WphCustomerExample example);

    WphCustomer selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphCustomer record, @Param("example") WphCustomerExample example);

    int updateByExample(@Param("record") WphCustomer record, @Param("example") WphCustomerExample example);

    int updateByPrimaryKeySelective(WphCustomer record);

    int updateByPrimaryKey(WphCustomer record);
}