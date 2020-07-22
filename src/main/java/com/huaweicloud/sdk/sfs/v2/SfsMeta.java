package com.huaweicloud.sdk.sfs.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.sfs.v2.model.*;

/**
 * @author kun.wang
 * @createdAt: 2020-07-22
 */
@SuppressWarnings("unchecked")
public class SfsMeta {

    public static final HttpRequestDef<ListSfsRequest, ListSfsResponse> ListSfss = getAllShare();

    private static HttpRequestDef<ListSfsRequest, ListSfsResponse> getAllShare() {
        // basic
        HttpRequestDef.Builder<ListSfsRequest, ListSfsResponse> builder =
                HttpRequestDef.builder(HttpMethod.GET, ListSfsRequest.class, ListSfsResponse.class)
                        .withUri("/v2/{project_id}/shares")
                        .withContentType("application/json;charset=UTF-8");
        // requests
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListSfsRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );

        builder.withRequestField("enterprise_project_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListSfsRequest::getEnterpriseProjectId, (req, v) -> {
                    req.setEnterpriseProjectId(v);
                })
        );
        builder.withRequestField("with_count",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListSfsRequest::getWithCount, (req, v) -> {
                    req.setWithCount("true");
                })
        );
        return builder.build();
    }

    /**
     * deleteShare
     */
    public static final HttpRequestDef<DeleteShareRequest, DeleteShareResponse> deleteShare = genForDeleteShare();

    private static HttpRequestDef<DeleteShareRequest, DeleteShareResponse> genForDeleteShare() {
        // basic
        HttpRequestDef.Builder<DeleteShareRequest, DeleteShareResponse> builder =
                HttpRequestDef.builder(HttpMethod.DELETE, DeleteShareRequest.class, DeleteShareResponse.class)
                        .withUri("/v2/{project_id}/shares/{share_id}")
                        .withContentType("application/json;charset=UTF-8");
        // requests
        builder.withRequestField("share_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteShareRequest::getShareId, (req, v) -> {
                    req.setShareId(v);
                })
        );
        return builder.build();
    }

    /**
     * updateShare
     */
    public static final HttpRequestDef<UpdateShareRequest, UpdateShareResponse> updateShare = genForUpdateShare();

    private static HttpRequestDef<UpdateShareRequest, UpdateShareResponse> genForUpdateShare() {
        // basic
        HttpRequestDef.Builder<UpdateShareRequest, UpdateShareResponse> builder =
                HttpRequestDef.builder(HttpMethod.PUT, UpdateShareRequest.class, UpdateShareResponse.class)
                        .withUri("/v2/{project_id}/shares/{share_id}")
                        .withContentType("application/json;charset=UTF-8");
        // requests
        builder.withRequestField("share_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(UpdateShareRequest::getShareId, (req, v) -> {
                    req.setShareId(v);
                })
        );

        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                UpdateShareRequestBody.class,
                f -> f.withMarshaller(UpdateShareRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );
        return builder.build();
    }
}
