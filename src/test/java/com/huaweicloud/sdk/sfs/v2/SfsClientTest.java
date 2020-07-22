package com.huaweicloud.sdk.sfs.v2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
        final ListAllShareRequest request = ListAllShareRequest.builder().withCount("true").build();
        ListAllShareResponse response = sfsClient.listSfs(request);
        log.info("{}", response.getCount());
        for (ListAllShareResponse.Share share : response.getShares()) {
            log.info("{}", share.getName());
            log.info("{}", share.getId());
            log.info("{}", share.getLinks());
        }
    }


    @Test
    public void listAllShareDetail() {
        final ListAllShareDetailRequest request = ListAllShareDetailRequest.builder().withCount("true").build();
        ListAllShareDetailResponse response = sfsClient.listAllShareDetail(request);
        log.info("{}", response.getCount());
        for (ListAllShareDetailResponse.Share share : response.getShares()) {
            log.info("{}", share.getId());
            log.info("{}", share.getName());
            log.info("{}", share.getShareProto());
            log.info("{}", share.getDescription());
            log.info("{}", share.getAvailabilityZone());
            log.info("{}", share.getCreatedAt());
            log.info("{}", share.getSize());
            log.info("{}", share.getStatus());
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

    /**
     * errorCode: 422
     * errorMsg: Unable to process the contained instructions
     */
    @Test
    public void updateShare() throws JsonProcessingException {
        String shareId = "a45f315f-a218-4f41-b701-ebfab27a2cad";
        UpdateShareRequestBody.Share share = UpdateShareRequestBody.Share.builder()
                .name("wangkun23").build();

        final UpdateShareRequest request = UpdateShareRequest.builder()
                .shareId(shareId).body(UpdateShareRequestBody.builder().share(share).build()).build();
        System.out.println(new ObjectMapper().writeValueAsString(request));
        UpdateShareResponse response = sfsClient.updateShare(request);
        log.info("{}", response.getHttpStatusCode());
    }

    /**
     * errorCode: 404
     * errorMsg: The resource could not be found.
     */
    @Test
    public void queryAZ() {
        final ListAzRequest request = ListAzRequest.builder()
                .shareAz(true).build();
        ListAzResponse response = sfsClient.queryAZ(request);
        log.info("{}", response.getAvailabilityZones());
    }
}
