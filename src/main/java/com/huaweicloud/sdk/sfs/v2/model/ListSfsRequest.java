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
public class ListSfsRequest {

    @Setter
    @Getter
    @JsonProperty(value = "marker")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String marker;


    @Setter
    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")
    private Integer limit;


    @Setter
    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")
    private String enterpriseProjectId;


    @Setter
    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")
    private String id;


    @Setter
    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_count")
    private String withCount;

}
