package dao;


import model.entity.CategoryEntity;

import java.util.List;

public interface ICategoryDao {

    List<CategoryEntity> getList();
}
