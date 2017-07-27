package com.mob.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.mob.demo.beans.User;
import com.mob.demo.dao.CommentDAO;
import com.mob.demo.domain.App;
//import com.mob.demo.kafka.KafkaSender;
//import com.mob.demo.mongo.UserRepository;
import com.mob.demo.kafka.KafkaSender;
import com.mob.demo.service.AppInfoService;
import com.mob.demo.service.DemoService;
import com.mob.demo.service.DubboOnlyService;
import com.mob.elasticsearch.ESClient;
import com.mob.jedis.client.RedisClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.JedisCluster;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.*;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/6/2:12:25
 */
//@Service

@Path("demo")
@com.alibaba.dubbo.config.annotation.Service
public class DemoServiceImpl implements DemoService {



    @Autowired
    private AppInfoService appInfoService;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private RedisClient redisClient;


    @Autowired
    private RedisClient redisClient;


    @Autowired
    private KafkaSender kafkaSender;


    private Logger logger = LogManager.getLogger(DemoServiceImpl.class);


    @GET
    @Path("/kafka")
    @Produces(ContentType.TEXT_PLAIN_UTF_8)
    @Override
    public String kafka() {

        kafkaSender.sendMessage();

        return "ok";
    }


    @GET
    @Path("/jedis")
    @Produces(ContentType.TEXT_PLAIN_UTF_8)
    public String jedis() {

        String test = redisClient.get("test");

        return "test=" + test;
    }

    @Autowired
    private CommentDAO commentDAO;

    @GET
    @Path("test")
    @Produces(ContentType.TEXT_PLAIN_UTF_8)
    public String test() {

//        logger.info("test method");
//
//        System.out.println("demo  method!!");
//
//        App app = appInfoService.getAppByAppKey("androidv1101");
//
//
////        User user = userRepository.findByName("fuck");
//
//        String test = redisClient.get("test");

        long c=commentDAO.count();

        return "commentdao.count:"+c;

//        return "from demo service" + app.getStorename().toString() + ",user=" + ""/*user.toString()*/ + ",test=" + test;
    }

    @Autowired
    private ESClient esClient;

    @GET
    @Path("/estest")
    @Produces(ContentType.TEXT_PLAIN_UTF_8)
    public String estest() {

        List<String> retList = new ArrayList<>();
        String plat = "android";
        String sdk = "sharesdk";
        String sdkver = "";
        String apppkg = "";
        String appver = "";
        try {
            List<String> indexNames = getIndexNames();
            BoolQueryBuilder query = QueryBuilders.boolQuery();
            TermQueryBuilder platQuery = QueryBuilders.termQuery("plat", plat);
            TermQueryBuilder sdkQuery = QueryBuilders.termQuery("sdk", sdk);
            TermQueryBuilder sdkverQuery = QueryBuilders.termQuery("sdkver", sdkver);
            TermQueryBuilder apppkgQuery = QueryBuilders.termQuery("apppkg", apppkg);
            TermQueryBuilder appverQuery = QueryBuilders.termQuery("appver", appver);
            query.must(platQuery).must(sdkQuery).must(sdkverQuery).must(apppkgQuery)
                    .must(appverQuery);
            SearchRequestBuilder searchRequestBuilder = esClient.prepareSearch(indexNames.toArray(new
                    String[0]));
            searchRequestBuilder.setQuery(query);
            SearchResponse sr = searchRequestBuilder.execute().actionGet();
            Iterator<SearchHit> i = sr.getHits().iterator();
            while (i.hasNext()) {
                Map<String, Object> resourceMap = i.next().getSource();
                retList.add((String) resourceMap.get("id"));

                System.out.println(resourceMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        }

        return retList.size()+"";
    }

    private List<String> getIndexNames() {
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        String suffixName = ".";
        if (month < 10) {
            suffixName = suffixName + year + "0" + month;
        } else {
            suffixName = suffixName + year + "" + month;
        }
        String prefixName = "error_base_info";
        List<String> list = new ArrayList<>();
        list.add(prefixName + suffixName);
        return list;
    }



    @GET
    @Path("/mybatis")
    @Produces(ContentType.TEXT_PLAIN_UTF_8)
    public String mybatis() {
        App app = appInfoService.getAppByAppKey("androidv1101");

        return app.toString();

//        return "from demo service" + app.getStorename().toString() + ",user=" + ""/*user.toString()*/ + ",test=" + test;
    }
}
