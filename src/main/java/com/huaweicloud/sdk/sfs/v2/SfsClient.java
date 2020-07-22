package com.huaweicloud.sdk.sfs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.sfs.v2.model.*;

/**
 * @author kun.wang
 * @createdAt: 2020-07-22
 */
public class SfsClient {

    protected HcClient hcClient;

    public SfsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SfsClient> newBuilder() {
        return new ClientBuilder<>(SfsClient::new);
    }


    public ListAllShareResponse listSfs(ListAllShareRequest request) {
        return hcClient.syncInvokeHttp(request, SfsMeta.ListSfss);
    }

    public ListAllShareDetailResponse listAllShareDetail(ListAllShareDetailRequest request) {
        return hcClient.syncInvokeHttp(request, SfsMeta.listAllShareDetail);
    }

    /**
     * https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=SFS&api=deleteShare
     *
     * @param request
     * @return
     */
    public DeleteShareResponse deleteShare(DeleteShareRequest request) {
        return hcClient.syncInvokeHttp(request, SfsMeta.deleteShare);
    }

    /**
     * 修改共享的描述和名称信息。
     *
     * @param request
     * @return
     */
    public UpdateShareResponse updateShare(UpdateShareRequest request) {
        return hcClient.syncInvokeHttp(request, SfsMeta.updateShare);
    }


    public ListAzResponse queryAZ(ListAzRequest request) {
        return hcClient.syncInvokeHttp(request, SfsMeta.queryAZ);
    }
}
