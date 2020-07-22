package com.huaweicloud.sdk.sfs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kun.wang
 * @createdAt: 2020-07-22
 */
@Builder
@ToString
public class CreateShareRequest {

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
        @JsonProperty(value = "description")
        private String description;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "is_public")
        private Boolean isPublic;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "metadata")
        private Map<String, String> metadata = new HashMap<>();

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "name")
        private String name;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "share_network_id")
        private String shareNetworkId;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "share_proto")
        private String shareProto;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "share_type")
        private String shareType;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "size")
        private int size;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "snapshot_id")
        private String snapshotId;

    }
}
