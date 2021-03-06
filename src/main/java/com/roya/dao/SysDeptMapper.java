package com.roya.dao;

import com.roya.model.SysDept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysDeptMapper {
    int deleteByPrimaryKey(@Param("id")Integer id);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(@Param("id")Integer id);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKey(SysDept record);

	List<SysDept> listDept();

	List<SysDept> childListByLevel(@Param("level") String level);

	void batchUpdateLevel(@Param("sysDeptList") List<SysDept> sysDeptList);

	int countByNameAndParentId(@Param("parentId")Integer parentId,@Param("name") String name,@Param("id")Integer id);

	//查看是否有部门的parentId是当前部门
	int countByParentId(@Param("deptId") int deptId);
}