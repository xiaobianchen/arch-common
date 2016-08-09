package com.arch.common.biz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeixinConfig extends BasicEntity {
    private String componentAppid;
    private String componentAppsecret;
    private String token;
    private String encodeingAesKey;
    private String authorizationUrl;
    private String redirectUrl;
    private String messgesUrl;
}