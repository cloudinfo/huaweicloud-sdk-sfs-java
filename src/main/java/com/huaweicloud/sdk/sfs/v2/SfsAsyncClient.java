package com.huaweicloud.sdk.sfs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;

/**
 * @author kun.wang
 * @createdAt: 2020-07-22
 */
public class SfsAsyncClient {
    protected HcClient hcClient;

    public SfsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SfsAsyncClient> newBuilder() {
        return new ClientBuilder<>(SfsAsyncClient::new);
    }
}
