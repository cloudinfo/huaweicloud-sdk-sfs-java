package com.huaweicloud.sdk.sfs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kun.wang
 * @createdAt: 2020-07-22
 */
public class ListAllShareDetailResponse {

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


    @ToString
    public static class Share {

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "id")
        private String id;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "project_id")
        private String projectId;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "name")
        private String name;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "description")
        private String description;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "availability_zone")
        private String availabilityZone;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "created_at")
        private String createdAt;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "export_location")
        private String exportLocation;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "export_locations")
        private List<String> exportLocations = new ArrayList<>();


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
        @JsonProperty(value = "share_proto")
        private String shareProto;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "size")
        private int size;

        @Setter
        @Getter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "status")
        private String status;

        @Setter
        @Getter
        @JsonProperty(value = "links")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private List<Link> links;
    }

    @ToString
    static class Link {

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
}
