package com.mw.User.Service;

import com.mw.User.Entity.User;
import com.mw.common.Service.CommonService;
import org.springframework.boot.configurationprocessor.json.JSONArray;


import java.util.List;

public interface UserService extends CommonService {
    public List getList();

    public User getById(Long id);

    public User save(User user);

    public void deleteById(Long id);

}
