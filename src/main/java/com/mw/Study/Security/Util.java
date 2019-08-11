package com.mw.Study.Security;

import com.mw.Study.Security.Dto.User;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.HashMap;

//笔记
public class Util {

    //序列化输出对象，调试用
    public static void soutObject(Object o){
        String s = ReflectionToStringBuilder.toString(o, ToStringStyle.MULTI_LINE_STYLE);
        System.out.println(s);
    }

    static class test{
        public test() {
        }

        String name;
        User user;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    }
    public static void main(String[] args) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("aa","aa");
        StringBuilder builder = new StringBuilder();
        User user = new User();
        user.setPassword("dsad");
        user.setUsername("dsasada");
        test test = new test();
        test.setUser(user);
        test.setName("dasdfadas");
//        user.setName("adasdad");
        soutObject(test);
    }
}
