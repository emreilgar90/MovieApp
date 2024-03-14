package com.emreilgar.movieapp.controller;

import com.emreilgar.movieapp.dto.UserCreateRequestDto;
import com.emreilgar.movieapp.dto.UserCreateResponseDto;
import com.emreilgar.movieapp.mapper.IUserMapper;
import com.emreilgar.movieapp.model.User;
import com.emreilgar.movieapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private IUserMapper userMapper;

    @PostMapping("/create")
    public ResponseEntity<Boolean> createUser(@RequestBody UserCreateRequestDto dto) {
        Boolean result = userService.save(dto);
        return ResponseEntity.ok(result);
    }
    @GetMapping("/findall")
    public ResponseEntity<List<User>> findall(){
        return ResponseEntity.ok(userService.findall());
    }

}
