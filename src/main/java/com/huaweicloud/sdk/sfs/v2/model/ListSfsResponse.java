package com.huaweicloud.sdk.sfs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kun.wang
 * @createdAt: 2020-07-22
 */
@ToString
public class ListSfsResponse extends SdkResponse {

    @Setter
    @Getter
    @JsonProperty(value = "count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String count;

    @Setter
    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shares")
    private List<SfsShare> shares = new ArrayList<>();

    public ListSfsResponse withCount(String count) {
        this.count = count;
        return this;
    }

    public ListSfsResponse withShares(List<SfsShare> shares) {
        this.shares = shares;
        return this;
    }
}
