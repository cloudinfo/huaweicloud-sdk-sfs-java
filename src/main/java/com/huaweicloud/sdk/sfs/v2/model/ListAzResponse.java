package com.huaweicloud.sdk.sfs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author kun.wang
 * @createdAt: 2020-07-22
 */
@Builder
@ToString
public class ListAzResponse extends SdkResponse {

    /**
     * 取值为true时,表示当前租户可以查询所有能够创建共享的可用区,取值为false时,表示可以查询所有可用区,包含能创建共享和不能创建共享的AZ。
     */
    @Setter
    @Getter
    @JsonProperty(value = "availability_zones")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<AvailabilityZone> availabilityZones;


    @ToString
    static class AvailabilityZone {

        @Setter
        @Getter
        @JsonProperty(value = "id")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String id;
        @Setter
        @Getter
        @JsonProperty(value = "name")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String name;

        @Setter
        @Getter
        @JsonProperty(value = "created_at")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String createdAt;

        @Setter
        @Getter
        @JsonProperty(value = "updated_at")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String updatedAt;
    }
}


