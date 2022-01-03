package com.t3h.newspringboot.service.impl;

import com.t3h.newspringboot.model.entity.UserEntity;
import com.t3h.newspringboot.model.request.UserRequest;
import com.t3h.newspringboot.model.response.UserResponse;
import com.t3h.newspringboot.repository.UserRepository;
import com.t3h.newspringboot.service.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements IUserService {


    /**
     * DI
     */
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserResponse> getList() {
        ModelMapper modelMapper = new ModelMapper();
        List<UserEntity> userEntities = userRepository.findAll();

        /**
         * -> : toan tu lamda
         */
        /**
         * C1
         */
//        List<UserResponse> userResponses = userEntities.stream().map(userEntity -> {
//            UserResponse userResponse = modelMapper.map(userEntity,UserResponse.class);
//            return userResponse;
//        }).collect(Collectors.toList());
        /**
         * C2
         */
        List<UserResponse> userResponses = userEntities.stream()
                .map(userEntity -> modelMapper.map(userEntity,UserResponse.class)).collect(Collectors.toList());

        return userResponses;
    }

    @Override
    public UserResponse insert(UserRequest userRequest) {
        ModelMapper modelMapper = new ModelMapper();
        UserEntity userEntity = modelMapper.map(userRequest,UserEntity.class);

        /**
         * JDBC
         * hibernate
         * - tu build tat ca cac method get list, insert, udpate...
         * - dung jpa tu dong co tat ca cac method tren
         */
        userEntity = userRepository.save(userEntity);
        return modelMapper.map(userEntity,UserResponse.class);
    }
}
