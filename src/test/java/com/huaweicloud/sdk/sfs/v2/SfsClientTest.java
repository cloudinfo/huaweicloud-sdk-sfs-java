package com.huaweicloud.sdk.sfs.v2;

import com.huaweicloud.sdk.sfs.v2.model.ListSfsRequest;
import com.huaweicloud.sdk.sfs.v2.model.ListSfsResponse;
import com.huaweicloud.sdk.sfs.v2.model.SfsShare;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @mail 845885222@qq.com
 * Created by wangkun23 on 2019/4/17.
 */
@Slf4j
public class SfsClientTest extends TestBase {
    @Test
    public void listSfsTest() {
        final ListSfsRequest request = ListSfsRequest.builder().withCount("true").build();

        ListSfsResponse listSfsResponse = sfsClient.listSfs(request);
        log.info("{}", listSfsResponse.getCount());
        for (SfsShare share : listSfsResponse.getShares()) {
            log.info("{}", share.getName());
            log.info("{}", share.getId());
            log.info("{}", share.getLinks());
        }
    }
}
