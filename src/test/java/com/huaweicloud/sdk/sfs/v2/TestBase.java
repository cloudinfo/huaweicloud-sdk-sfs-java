package com.huaweicloud.sdk.sfs.v2;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import org.junit.Before;

/**
 * @author kun.wang
 * @createdAt: 2020-07-22
 */
public class TestBase {

    protected SfsClient sfsClient;

    @Before
    public void before() {

        String accessKey = "xxxxx";
        String accessSecret = "xxxxx";
        String projectId = "xxxxxx";

        String endpoint = "https://sfs.cn-north-1.myhuaweicloud.com";

        final BasicCredentials basicCredentials = new BasicCredentials()
                .withAk(accessKey).withSk(accessSecret)
                .withProjectId(projectId);

        sfsClient = SfsClient.newBuilder()
                .withCredential(basicCredentials)
                .withEndpoint(endpoint)
                .build();
    }
}
