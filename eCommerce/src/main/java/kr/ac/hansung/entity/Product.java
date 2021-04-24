package kr.ac.hansung.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/*
 * 1) Product: Category�� ManyToMany ����� �����Ͽ����� �������, JoinTable�� ���
 * 2) FetchType�� ������ ���������� ���� Eager�� ����
 * 3) Product�� Category���� ��������� ����
 *    Product ��ȸ�� categories �ʵ� -> Category -> Product�� �д� Cycle�� ���� ���� @JsonIgnore ���
*/

@Getter
@Setter
@ToString
@Entity
@Table(name = "app_product")
public class Product extends AbstractEntity {

	@Column(name = "name", nullable = false)
	private String name;	
	
	@Column(name = "price", nullable = false)
	private double price;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "app_product_category", joinColumns = @JoinColumn(name = "productid"), inverseJoinColumns = @JoinColumn(name = "categoryid"))
	@JsonIgnore
	private Set<Category> categories;

}