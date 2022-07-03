package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.Reservation;

@Repository
public interface ReservationDAO extends JpaRepository<Reservation, Integer> {

	@Query("select nvl(max(reservation_num), 0) + 1 from Reservation") //쿼리문 직접 작성 => 쿼리문에 들어간 테이블 이름은 entity에 들어간 클래스 이름과 일치해야함!!!
	public int getNextReservationNum(); //예약번호를 자동으로 생성해주기 위한 메소드
	
	
//	@Query("select(r.reservation_spa * p.place_spa_price) + (r.reservation_meal * p.place_meal_price)+((r.reservation_checkin_date - r.reservation_checkout_date)* room_price) "
//			+ "from Room r, Place p "
//			+ "where r.place_num = p.place_num "
//			+ "and r.room_num = p.room_num")
//	public int price();
	
	@Modifying
	@Query(value = "insert into Reservation r(r.reservation_num, r.user_num, r.place_num, r.room_num, r.reservation_park, "
			+ "r.reservation_spa, r.reservation_meal_cnt, r.reservation_price, r.reservation_checkin_date, "
			+ "r.reservation_checkout_date, r.reservation_people_cnt, r.reservation_s_dog_cnt, r.reservation_m_dog_cnt, r.reservation_l_dog_cnt) "
			+ "values(:#{#r.reservation_num}, :#{#r.userinfo.user_num}, :#{#r.place.place_num}, :#{#r.room.room_num}, "
			+ ":#{#r.reservation_park}, :#{#r.reservation_spa}, :#{#r.reservation_meal_cnt}, :#{#r.reservation_price}, To_Date(':#{#r.reservation_checkin_date}','YYYY-MM-DD'), "
			+ "To_Date(':#{#r.reservation_checkout_date}','YYYY-MM-DD'), :#{#r.reservation_people_cnt}, :#{#r.reservation_s_dog_cnt}, :#{#r.reservation_m_dog_cnt}, :#{#r.reservation_l_dog_cnt}),", nativeQuery = true)
	@Transactional
	public void insert(@Param("r") Reservation r);
	
	
	
}
