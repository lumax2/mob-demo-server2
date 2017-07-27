package com.mob.demo.es;

import com.mob.elasticsearch.ESClient;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/7/27:12:28
 */
@Service
public class ESTestService {


    @Autowired
    private ESClient esClient;


    public void testES(){
        SearchRequestBuilder searchRequestBuilder = esClient.prepareSearch("");
    }
}
