package com.liang.springcloud.service;

import com.liang.springcloud.entity.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById( Long id);
}
