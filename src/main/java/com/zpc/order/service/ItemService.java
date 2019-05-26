package com.zpc.order.service;

import com.zpc.order.entity.Item;
import com.zpc.order.properties.ItemProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ItemService {

      // Spring框架对RESTful方式的http请求做了封装，来简化操作
        @Autowired
        private RestTemplate restTemplate ;

//        @Value("${common.constant.itemip}")
//        private String itemIp ;
//
//        @Value("${common.constant.itemport}")
//        private String itemport ;
//
//        @Value("${common.constant.queryItemByIdUri}")
//        private String queryItemByIdUri ;

    @Autowired
    ItemProperties itemProperties;

//    public Item queryItemById(Long id) {
//        System.out.println("orderProperties="+itemProperties);
//        String url = "http://"+itemIp+":"+itemport+"/"+queryItemByIdUri+"/"+id ;
//        return this.restTemplate.getForObject(url, Item.class);
//    }

    public Item queryItemById(Long id) {
        //走注册中心查找相应的服务， 这种方法必须开启负载均衡@LoadBalanced
        String itemUrl = "http://app-item/item/{id}";
        Item item = restTemplate.getForObject(itemUrl,Item.class,id);
        System.out.println("sys order service item="+item);
        return item;
    }
}
