package service;


import model.response.NewResponse;

import java.util.List;

public interface INewsService {
    List<NewResponse> getList();
}
