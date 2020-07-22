package com.huaweicloud.sdk.sfs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.sfs.v2.model.DeleteShareRequest;
import com.huaweicloud.sdk.sfs.v2.model.DeleteShareResponse;
import com.huaweicloud.sdk.sfs.v2.model.ListSfsRequest;
import com.huaweicloud.sdk.sfs.v2.model.ListSfsResponse;

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


    public ListSfsResponse listSfs(ListSfsRequest request) {
        return hcClient.syncInvokeHttp(request, SfsMeta.ListSfss);
    }

    /**
     * https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=SFS&api=deleteShare
     * @param request
     * @return
     */
    public DeleteShareResponse deleteShare(DeleteShareRequest request) {
        return hcClient.syncInvokeHttp(request, SfsMeta.deleteShare);
    }
}
