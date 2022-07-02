package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.vo.Place;

public interface PlaceDAO extends JpaRepository<Place, Integer> {
	/*
	//PlaceDAO는 insert 처리는 전부 db에서 하고 따로 delete나 update처리는 없기 때문에
	//무조건 뿌려주는 것만 잘 쓰면 될 것 같아용
	//근데 그 뿌리는 것도 어떤 넘버 혹은 키워드를 기준으로 뿌리는 쿼리들만 잘 생각하면 될 것 같아요
	
	//이것도 db넣으면서 차례대로 그냥 insert할건지 다오의 이 메소드 넣을 건지도 따져봐야하고용
	@Query("select nvl(max(place_num),0)+1 from Place") //사용자 정의 sql은 Entity클래스 이름이랑 똑같아야 함 !! 대소문자 구분 필
	public int getNextPlaceNum();
	
	//#################소윤님도연님여기꼭읽어주셔요#############################
	//이건 일단 place팀 place카테고리 클릭하면 사용자가 모든 옵션 입력 하든 안하든 다 헤비쿼리로만 돌아가게끔 만들었어요
	//근데 사용자가 선택 안 한 값은 null처리하면 안되고 자동 0으로 처리해야할 것 같아요(null로 들어가면 아예 쿼리를 못 읽을 듯해요)
	//이건 사용자가 정렬 선택 안하면 제일 기본으로 뜨게끔 하는 최신순으로 헤비쿼리 !
	//근데 또 그리고 만약에 사용자가 place_name아무것도 입력 안하고 이 쿼리를 돌려버리면 place_name에다가는 null이 올텐데...?
	//빈칸으로 처리하기에도 애매하지 않나요,,,?ㅠㅠㅠ
	@Query("select * from place"
			+ "where place_region_num = ${place_region_num}"
			+ "and place_type_num = ${place_type_num}"
			+ "and place_name like '%'||#{place_name}||'%'"
			+ "and place_park = ${place_park}"
			+ "and place_meal = ${place_meal}"
			+ "and place_weight = ${place_weight}"
			+ "order by ${place_num} desc")
	public Place findByAllOptionAndNum();
	
	//그리고 이 쿼리는 사용자가 조회수 순으로 클릭했을 때 !
		@Query("select * from place"
				+ "where place_region_num = ${place_region_num}"
				+ "and place_type_num = ${place_type_num}"
				+ "and place_name like '%'||#{place_name}||'%'"
				+ "and place_park = ${place_park}"
				+ "and place_meal = ${place_meal}"
				+ "and place_weight = ${place_weight}"
				+ "order by ${place_hits} desc")
		public Place findByAllOptionAndHits();
		
	
//	그리고 place가 사용되는 곳이
//	dibs랑 reservation(이 두개를 가지고 또 plan에서도 사용) 그리고 리뷰게시판등등인데
//	user_num가지고 dibs한 place불러오거나
//	마찬가지로 user_num가지고 reservation한 place불러오는건
//	따로 뷰를 생성하는 게 좋을 것 같아요
//	plan에서 팝업창에는 place_num, place_name, place_addr, 위도, 경도 이렇게 뷰로 셋팅해서 가져오지만
//	팝업창에서 보여줄 때는 place_name말고 나머지는 다 히든처리해서 가져와도 좋을 것 같아요 !!!!
	
	*/
}
