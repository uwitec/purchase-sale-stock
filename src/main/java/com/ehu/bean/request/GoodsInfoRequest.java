package com.ehu.bean.request;

import com.ehu.bean.Page;
import lombok.Data;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-24 17:56.
 */
@Data
public class GoodsInfoRequest extends Page {
    private String searchText = "";

    private int firstMenuId;

    private int secondMenuId;
}
