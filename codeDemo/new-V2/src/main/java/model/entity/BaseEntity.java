package model.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@Data
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Timestamp createDate;

    private Timestamp updateDate;

    private int creatorId;

    private int editorId;
}
