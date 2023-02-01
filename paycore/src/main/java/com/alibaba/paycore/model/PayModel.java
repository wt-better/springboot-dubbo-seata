package com.alibaba.paycore.model;

import java.util.Objects;

/**
 * @author wangte
 * Create At 2022/12/9
 */
public class PayModel {

    private Long id;

    private String payNo;

    public PayModel() {
    }

    public PayModel(Long id, String payNo) {
        this.id = id;
        this.payNo = payNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayModel payModel = (PayModel) o;
        return Objects.equals(id, payModel.id) && Objects.equals(payNo, payModel.payNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, payNo);
    }

    @Override
    public String toString() {
        return "PayModel{" +
                "id=" + id +
                ", payNo='" + payNo + '\'' +
                '}';
    }
}
