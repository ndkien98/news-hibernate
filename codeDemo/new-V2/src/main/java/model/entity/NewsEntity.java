package model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name = "NEWS")
@Entity
public class NewsEntity extends BaseEntity{

    private String title;

    private String content;

    private String avatar;

    private String author;

    private int categoryId;

    private String originalResource;

    private int numberAccess;

    private int censor;
}
