package com.huaweicloud.sdk.sfs.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.sfs.v2.model.DeleteShareRequest;
import com.huaweicloud.sdk.sfs.v2.model.DeleteShareResponse;
import com.huaweicloud.sdk.sfs.v2.model.ListSfsRequest;
import com.huaweicloud.sdk.sfs.v2.model.ListSfsResponse;

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
}
