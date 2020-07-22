package com.huaweicloud.sdk.sfs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author kun.wang
 * @createdAt: 2020-07-22
 */
@Builder
@ToString
public class ListAzRequest {

    /**
     * 取值为true时,表示当前租户可以查询所有能够创建共享的可用区,取值为false时,表示可以查询所有可用区,包含能创建共享和不能创建共享的AZ。
     */
    @Setter
    @Getter
    @JsonProperty(value = "share_az")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean shareAz;
}
