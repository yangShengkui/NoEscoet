package com.slk.wph.module.WPH_Invoice.mapper;

import com.slk.wph.module.WPH_Invoice.po.WphInvoice;
import com.slk.wph.module.WPH_Invoice.po.WphInvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphInvoiceMapper {
    int countByExample(WphInvoiceExample example);

    int deleteByExample(WphInvoiceExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphInvoice record);

    int insertSelective(WphInvoice record);

    List<WphInvoice> selectByExample(WphInvoiceExample example);

    WphInvoice selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphInvoice record, @Param("example") WphInvoiceExample example);

    int updateByExample(@Param("record") WphInvoice record, @Param("example") WphInvoiceExample example);

    int updateByPrimaryKeySelective(WphInvoice record);

    int updateByPrimaryKey(WphInvoice record);
}