package com.egzosn.pay.payoneer.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.egzosn.pay.common.bean.CurType;

import java.math.BigDecimal;

/**
 * @author Fuzx
 * @create 2018 2018/1/22 0022
 */
public class PayoneerRequestBean {
    public PayoneerRequestBean() {

    }

    public PayoneerRequestBean(String payeeId, BigDecimal amount, String clientReferenceId, CurType currency, String description) {
        this.payeeId = payeeId;
        this.amount = amount;
        this.clientReferenceId = clientReferenceId;
        this.currency = currency;
        this.description = description;
    }

    /**
     * 收款id
     */
    @JSONField(name="payee_id")
    private String payeeId;
    /**
     * 收款金额
     */
    private BigDecimal amount;
    /**
     * 订单id
     */
    @JSONField(name="client_reference_id")
    private String clientReferenceId;
    /**
     * 币种
     */
    private CurType currency;
    /**
     * 订单详情 (选填)
     */
    private String description;

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getClientReferenceId() {
        return clientReferenceId;
    }

    public void setClientReferenceId(String clientReferenceId) {
        this.clientReferenceId = clientReferenceId;
    }

    public CurType getCurrency() {
        return currency;
    }

    public void setCurrency(CurType currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
