package com.wxl.mybatis;

import com.wxl.mybatis.dao.UserDao;
import com.wxl.mybatis.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author wangxl
 * @since 2022/10/18 20:19
 */
@SpringBootTest
public class MyBatisQuickStartApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }
}
