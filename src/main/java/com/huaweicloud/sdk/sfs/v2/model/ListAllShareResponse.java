package com.huaweicloud.sdk.sfs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kun.wang
 * @createdAt: 2020-07-22
 */
@ToString
public class ListAllShareResponse extends SdkResponse {

    @Setter
    @Getter
    @JsonProperty(value = "count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String count;

    @Setter
    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shares")
    private List<Share> shares = new ArrayList<>();

    public ListAllShareResponse withCount(String count) {
        this.count = count;
        return this;
    }

    public ListAllShareResponse withShares(List<Share> shares) {
        this.shares = shares;
        return this;
    }

    @ToString
    @NoArgsConstructor
    public static class Share {

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
        @JsonProperty(value = "links")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private List<SfsLink> links;
    }
}
