package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.Plan;

@Repository
public interface PlanDAO extends JpaRepository<Plan, Integer> {

	//pk값 반환 
	@Query("select nvl(max(plan_num),0)+1 from Plan")
	public int getNextPlanNum();
	
	
	@Query(value="select * from Plan where user_num =:user_num order by plan_date",nativeQuery = true)
	public List<Plan> findByUserNum(int user_num);
}
