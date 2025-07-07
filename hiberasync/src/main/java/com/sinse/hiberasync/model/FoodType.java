package com.sinse.hiberasync.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/* [ORM - java의 Object와 Relation(관계형DB) 자체를 직접 매핑]
 * JPA는 JAVA의 자체 API에서 지원하는 인터페이스 (즉 자바 표준)
 * Hibernate는 사설로 JPA를 구현한 구현체, 표준은 아님
 */

@Data
@Entity
@Table(name="food_type")
public class FoodType {
	@Id
	private int food_type_id;
	private String title;
}
