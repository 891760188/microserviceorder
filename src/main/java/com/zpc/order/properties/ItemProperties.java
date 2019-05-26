package com.zpc.order.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 以common.constant开头的配置被匹配到
 * @author Evan
 */
@Component
@ConfigurationProperties(prefix="common.constant")
public class ItemProperties {
    private String itemip;
    private String itemport;
    private String queryItemByIdUri;

    public String getItemip() {
        return itemip;
    }

    public void setItemip(String itemip) {
        this.itemip = itemip;
    }

    public String getItemport() {
        return itemport;
    }

    public void setItemport(String itemport) {
        this.itemport = itemport;
    }

    public String getQueryItemByIdUri() {
        return queryItemByIdUri;
    }

    public void setQueryItemByIdUri(String queryItemByIdUri) {
        this.queryItemByIdUri = queryItemByIdUri;
    }

    @Override
    public String toString() {
        return "ItemProperties{" +
                "itemip='" + itemip + '\'' +
                ", itemport='" + itemport + '\'' +
                ", queryItemByIdUri='" + queryItemByIdUri + '\'' +
                '}';
    }
}
