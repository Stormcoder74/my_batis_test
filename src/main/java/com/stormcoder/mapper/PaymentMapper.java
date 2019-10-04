package com.stormcoder.mapper;

import com.stormcoder.domain.Payment;

import java.util.List;

public interface PaymentMapper {
    List<Payment> getPaymentsBySubscriberId(Integer id);
}
