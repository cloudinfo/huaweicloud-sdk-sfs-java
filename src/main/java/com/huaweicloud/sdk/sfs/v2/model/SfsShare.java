package com.huaweicloud.sdk.sfs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author kun.wang
 * @createdAt: 2020-07-22
 */
@ToString
public class SfsShare {

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
