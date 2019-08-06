package com.mw.User.Service.impl;

import com.mw.User.Dao.UserRepository;
import com.mw.User.Entity.User;
import com.mw.User.Service.UserService;
import com.mw.common.Service.impl.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl extends CommonServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public List getList() {
        List<User> all = userRepository.findAll();
        return all;
    }

    @Override
    @Transactional(readOnly = true)
    public User getById(Long id) {
        Optional<User> byId = userRepository.findById(id);
        User one = byId.get();
        return one;
    }

    @Override
    @Transactional
    public User save(User user) {
        User save = userRepository.save(user);
        return save;
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
