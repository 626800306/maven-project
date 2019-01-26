package com.baizhi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zzu
 * @date 2019/1/26 - 10:11
 */
public class UserTest {
    public static void main(String[] args) throws ParseException {
        String date = "2019-01-26 10:23:11";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = format.parse(date);
        System.out.println(parse);
    }
}
