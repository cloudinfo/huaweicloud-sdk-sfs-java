package com.huaweicloud.sdk.sfs.v2;

import com.huaweicloud.sdk.sfs.v2.model.*;
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

        ListSfsResponse response = sfsClient.listSfs(request);
        log.info("{}", response.getCount());
        for (SfsShare share : response.getShares()) {
            log.info("{}", share.getName());
            log.info("{}", share.getId());
            log.info("{}", share.getLinks());
        }
    }


    @Test
    public void deleteShare() {
        String shareId = "ff8f26b8-be7c-4657-80ae-76357063edd9";
        final DeleteShareRequest request = DeleteShareRequest.builder()
                .shareId(shareId).build();
        DeleteShareResponse response = sfsClient.deleteShare(request);
        log.info("{}", response.getHttpStatusCode());
    }
}
