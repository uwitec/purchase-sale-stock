package com.ehu.bean.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-25 10:18.
 */
@Data
@ApiModel
public class PurchaseOrderRequest {
    @ApiModelProperty("商家id")
    private int merchantId;

    @ApiModelProperty("负责人")
    private String personInCharge;

    @ApiModelProperty("订单总价")
    private BigDecimal orderTotalPrice;

    @ApiModelProperty("订单实收金额")
    private BigDecimal orderActualPrice;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("供应商id")
    private int supplierId;

    @ApiModelProperty("采购订单详情")
    private List<PurchaseOrderDetailRequest> details = new ArrayList<>();
}