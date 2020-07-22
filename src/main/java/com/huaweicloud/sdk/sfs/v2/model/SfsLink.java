package com.huaweicloud.sdk.sfs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author kun.wang
 * @createdAt: 2020-07-22
 */
@ToString
public class SfsLink {

    @Setter
    @Getter
    @JsonProperty(value = "href")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String href;

    @Setter
    @Getter
    @JsonProperty(value = "rel")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String rel;
}
