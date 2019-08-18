package com.yfming.tensquare.recruit.dao;

import com.yfming.tensquare.recruit.entity.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface EnterpriseDao extends JpaRepository<Enterprise,String>,JpaSpecificationExecutor<Enterprise>{

    /**
     * 按是否热门查询企业信息
     * @param ishot
     * @return
     */
    public List<Enterprise> findByIshot(String ishot);

}
