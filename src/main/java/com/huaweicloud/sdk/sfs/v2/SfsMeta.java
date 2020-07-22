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

    public static final HttpRequestDef<ListAllShareRequest, ListAllShareResponse> ListSfss = getAllShare();

    private static HttpRequestDef<ListAllShareRequest, ListAllShareResponse> getAllShare() {
        // basic
        HttpRequestDef.Builder<ListAllShareRequest, ListAllShareResponse> builder =
                HttpRequestDef.builder(HttpMethod.GET, ListAllShareRequest.class, ListAllShareResponse.class)
                        .withUri("/v2/{project_id}/shares")
                        .withContentType("application/json;charset=UTF-8");
        // requests
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListAllShareRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );

        builder.withRequestField("enterprise_project_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListAllShareRequest::getEnterpriseProjectId, (req, v) -> {
                    req.setEnterpriseProjectId(v);
                })
        );
        builder.withRequestField("with_count",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListAllShareRequest::getWithCount, (req, v) -> {
                    req.setWithCount("true");
                })
        );
        return builder.build();
    }

    /**
     * listAllShareDetail
     * <p>
     * 查询所有共享的详细信息
     */
    public static final HttpRequestDef<ListAllShareDetailRequest, ListAllShareDetailResponse> listAllShareDetail = genForListAllShareDetail();

    private static HttpRequestDef<ListAllShareDetailRequest, ListAllShareDetailResponse> genForListAllShareDetail() {
        // basic
        HttpRequestDef.Builder<ListAllShareDetailRequest, ListAllShareDetailResponse> builder =
                HttpRequestDef.builder(HttpMethod.GET, ListAllShareDetailRequest.class, ListAllShareDetailResponse.class)
                        .withUri("/v2/{project_id}/shares/detail")
                        .withContentType("application/json;charset=UTF-8");
        // requests
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListAllShareDetailRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );

        builder.withRequestField("enterprise_project_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListAllShareDetailRequest::getEnterpriseProjectId, (req, v) -> {
                    req.setEnterpriseProjectId(v);
                })
        );
        builder.withRequestField("with_count",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListAllShareDetailRequest::getWithCount, (req, v) -> {
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

        builder.withRequestField("share",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                UpdateShareRequestBody.class,
                f -> f.withMarshaller(UpdateShareRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );
        return builder.build();
    }


    /**
     * 列出可用区。查询manila中AZ,用于创建share,该接口是在manila原有接口的基础上扩展,通过增加可选参数share_az,来决定时查询所有AZ(包括scheduler中的AZ),还是仅查询用于创建共享的AZ
     */
    public static final HttpRequestDef<ListAzRequest, ListAzResponse> queryAZ = genForqueryAZ();

    private static HttpRequestDef<ListAzRequest, ListAzResponse> genForqueryAZ() {
        // basic
        HttpRequestDef.Builder<ListAzRequest, ListAzResponse> builder =
                HttpRequestDef.builder(HttpMethod.GET, ListAzRequest.class, ListAzResponse.class)
                        .withUri("/v2/{project_id}/availability-zones")
                        .withContentType("application/json;charset=UTF-8");
        // requests
        builder.withRequestField("share_az",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Boolean.class,
                f -> f.withMarshaller(ListAzRequest::getShareAz, (req, v) -> {
                    req.setShareAz(v);
                })
        );
        return builder.build();
    }

}
