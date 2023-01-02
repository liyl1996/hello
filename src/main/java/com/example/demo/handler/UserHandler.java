//package com.example.demo.handler;
//
//import com.example.demo.domain.User;
//import org.springframework.stereotype.Component;
//import top.javatool.canal.client.annotation.CanalTable;
//import top.javatool.canal.client.handler.EntryHandler;
//
///**
// * @author Administrator
// */
//@CanalTable("t_user")
//@Component
//public class UserHandler implements EntryHandler<User> {
//
//    @Override
//    public void insert(User user) {
//        System.out.println("新增用户");
//        System.out.println("user = " + user);
//    }
//
//    @Override
//    public void update(User before, User after) {
//        System.out.println("修改用户");
//        System.out.println("修改用户before：" + before);
//        System.out.println("修改用户after：" + after);
//    }
//
//    @Override
//    public void delete(User user) {
//        System.out.println("删除用户user = " + user);
//    }
//
//}
