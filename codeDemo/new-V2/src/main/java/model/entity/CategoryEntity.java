package model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name = "CATEGORY")
@Entity
public class CategoryEntity extends BaseEntity{

    private String name;

    private int parentsCategoryId;
}
