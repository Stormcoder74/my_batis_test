package com.stormcoder;

import com.stormcoder.domain.Subscriber;
import com.stormcoder.mapper.SubscriberMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory;
        SubscriberMapper subscriberMapper;
        Reader reader = null;
        try {
            reader = Resources
                    .getResourceAsReader("mybatis-config.xml"); //Читаем файл с настройками подключения и настройками MyBatis
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            subscriberMapper = sqlSessionFactory.openSession().getMapper(SubscriberMapper.class); //Создаем маппер, из которого и будем вызывать методы getSubscriberById и getSubscribers
            List<Subscriber> subscribers = subscriberMapper.getSubscribers();
            System.out.println(subscribers);
            Subscriber subscriber = subscriberMapper.getSubscriberById(101);
            System.out.println(subscriber);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
