package com.t.service.impl;

import com.t.domain.Admin;
import com.t.mapper.IAdminMapper;
import com.t.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yfei_2200 on 2018/10/8.
 */
@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    IAdminMapper adminMapper;

    @Override
    public List<Admin> getList() {
        return adminMapper.getList();
    }
}
