package com.t3h.service.service.impl;


import com.t3h.service.model.request.NewsRequest;
import com.t3h.service.model.response.NewResponse;
import com.t3h.service.repository.NewsRepository;
import com.t3h.service.service.INewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewServiceImpl implements INewService {

    private final NewsRepository newsRepository;

    public NewServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public List<NewResponse> getAll() {


        return null;
    }

    @Override
    public void insert(NewsRequest newsRequest) {

    }

    @Override
    public List<NewResponse> findByAuthor(String author) {
        return null;
    }

    @Override
    public List<NewResponse> findByNumberAccess(Integer numberAccess) {
        return null;
    }
}
