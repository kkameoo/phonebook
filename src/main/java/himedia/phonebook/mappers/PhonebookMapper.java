package himedia.phonebook.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import himedia.phonebook.repository.PhonebookVo;

// 이 매퍼 인터페이스 mybatis mapper 설정이 namespace로 등록해 줘야 한다.
@Mapper // MyBatis Mapper
public interface PhonebookMapper {
	
//	<select id=selectAll" resultType="phonebookVo">
	List<PhonebookVo> selectAll();
	
//	<insert id="insert" parameterType="phonebookVo">
	int insert(PhonebookVo phonebookVo);
	
//	<select id="selectOne" parameterType="int" resultType="phonebookVo">
//	@Select("SELECT * FROM phonebook WHERE id=#{id}")
	PhonebookVo selectOne(Integer id);
	
//	<update id="update" parameterType="phonebookVo">
	int update(PhonebookVo phonebookVo);
	
//	<delete id="delete" parameterType="int">
	int delete(Integer id);
}
