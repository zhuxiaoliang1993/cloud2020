package com.ynet.service;

import com.ynet.dao.PaymentDao;
import com.ynet.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentdao;

    @Override
    public int create(Payment payment) {
        return paymentdao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentdao.getPaymentById(id);
    }
}
