package com.emreilgar.movieapp.service;

import com.emreilgar.movieapp.dto.UserCreateRequestDto;
import com.emreilgar.movieapp.mapper.IUserMapper;
import com.emreilgar.movieapp.model.User;
import com.emreilgar.movieapp.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final IUserRepository userRepository;

    public Boolean save(UserCreateRequestDto dto) {
        Optional<User> users = userRepository.findById(dto.getId());
        if (users.isEmpty()) {
            User user = IUserMapper.INSTANCE.toUserCreate(dto);
            userRepository.save(user);
            return true;
        } else {
            throw new RuntimeException("save metodu içinde null bir nesne ile karşılaşıldı. Nesnenin başarılı bir şekilde oluşturulup oluşturulmadığını kontrol edin.");
        }
    }

    public List<User> findall() {
        List<User> userList=userRepository.findAll();
        return userList;
    }
}
