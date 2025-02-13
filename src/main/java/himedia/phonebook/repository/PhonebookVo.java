package himedia.phonebook.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PhonebookVo {
	private Integer id;
	private String name;
	private String hp;
	private String tel;
}
