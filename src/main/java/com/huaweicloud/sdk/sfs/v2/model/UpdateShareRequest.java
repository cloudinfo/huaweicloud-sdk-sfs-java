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
public class UpdateShareRequest {

    @Setter
    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_id")
    private String shareId;

    @Setter
    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")
    private UpdateShareRequestBody body = null;

    public UpdateShareRequest withBody(UpdateShareRequestBody body) {
        this.body = body;
        return this;
    }
}
