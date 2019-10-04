package com.stormcoder.mapper;

import com.stormcoder.domain.Subscriber;

import java.util.List;

public interface SubscriberMapper {
    Subscriber getSubscriberById(Integer id);
    List<Subscriber> getSubscribers();
}
