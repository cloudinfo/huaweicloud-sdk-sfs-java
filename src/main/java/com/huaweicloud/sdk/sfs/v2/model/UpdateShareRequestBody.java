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
public class UpdateShareRequestBody {

    @Setter
    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share")
    private Share share;

    @Builder
    @ToString
    public static class Share {
        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "display_description")
        private String description;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "display_name")
        private String name;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "is_public")
        private Boolean isPublic;
    }
}
