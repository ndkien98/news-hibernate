package com.t3h.newspringboot.controller.api;

import com.t3h.newspringboot.model.request.UserRequest;
import com.t3h.newspringboot.model.response.UserResponse;
import com.t3h.newspringboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    /**
     * Reflection chay trong thoi diem run time, ton performance
     */
    @Autowired
    private IUserService iUserService;

    @GetMapping
    public ResponseEntity<List<UserResponse>> getList(){
        return ResponseEntity.ok(iUserService.getList());
    }

    @PostMapping
    public ResponseEntity<UserResponse> insert(@RequestBody UserRequest userRequest){
        return ResponseEntity.ok(iUserService.insert(userRequest));
    }


}
