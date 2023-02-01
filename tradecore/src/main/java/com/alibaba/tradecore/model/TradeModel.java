package com.alibaba.tradecore.model;

import java.util.Objects;

/**
 * @author wangte
 * Create At 2022/12/8
 */
public class TradeModel {

    private Long id;

    private String tradeNo;

    public TradeModel() {
    }

    public TradeModel(Long id, String tradeNo) {
        this.id = id;
        this.tradeNo = tradeNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TradeModel that = (TradeModel) o;
        return Objects.equals(id, that.id) && Objects.equals(tradeNo, that.tradeNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tradeNo);
    }

    @Override
    public String toString() {
        return "TradeModel{" +
                "id=" + id +
                ", tradeNo='" + tradeNo + '\'' +
                '}';
    }
}
