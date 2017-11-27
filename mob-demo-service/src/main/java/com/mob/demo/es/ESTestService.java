//package com.mob.demo.es;
//
//import com.lamfire.json.JSON;
//import com.lamfire.utils.ObjectUtils;
//import com.lamfire.utils.StringUtils;
//import com.mob.demo.es.entity.DetailShare;
//import com.mob.demo.es.index.DetailShareIndex;
//import org.elasticsearch.action.search.SearchRequestBuilder;
//import org.elasticsearch.action.search.SearchResponse;
//import org.elasticsearch.index.query.BoolQueryBuilder;
//import org.elasticsearch.index.query.QueryBuilders;
//import org.elasticsearch.search.SearchHit;
//import org.elasticsearch.search.SearchHits;
//import org.elasticsearch.search.sort.SortOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * es 演示demo
// * User: zhouzhipeng
// * Date: 2017/7/27:12:28
// */
//@Service
//public class ESTestService {
//
//
//    @Autowired
//    private DetailShareIndex index;
//
//
//    public byte[] findDB() throws Exception {
//
//        String appkey="";
//        String subjectid="";
//        Integer pagesize = 10;
//        String startid="";
//
//        String nextid = null;
////        DetailShareIndex index = new DetailShareIndex();
//        BoolQueryBuilder query = QueryBuilders.boolQuery();
//        //query
//        if(StringUtils.isNotEmpty(appkey) && StringUtils.isEmpty(subjectid)) {
//            query.must(QueryBuilders.termQuery("appkey", appkey));
//        } else if(StringUtils.isNotEmpty(subjectid)) {
//            query.must(QueryBuilders.termQuery("subjectid", subjectid));
//        }
//
//        //pageno, 如果后续更改成mongodb或者数据量很大效率很低，则采用setFrom的方式
//        int pageno = 1;
//        if(StringUtils.isNotEmpty(startid)) {
//            pageno = Integer.valueOf(startid);
//        }
//
//        //search
//        SearchRequestBuilder search = index.createSearchRequestBuilder();
//        SearchResponse response = search.setQuery(query).setFrom((pageno - 1) * pagesize).setSize(pagesize).addSort("datetime", SortOrder.DESC).execute().actionGet();
//
//        //总数
//        Long total = response.getHits().getTotalHits();
//
//        //结果集
//        List<DetailShare> list = esResponseToObj(response, DetailShare.class);
//
//
//        //组装结果集
//        List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
//        Map<String, Object> item = null;
//        DetailShare entity = null;
//        for(int i=0; i < list.size(); i++) {
//            item = new HashMap<String, Object>();
//            mapList.add(item);
//            entity = list.get(i);
//            item.put("id", entity.getId());
//            item.put("commentid", entity.getCommentid());
//            item.put("snsplat", entity.getSnsplat());
//            item.put("nickname", "");
//            item.put("icon", entity.getIcon());
//            item.put("verifytype", entity.getSecrettype());
//            item.put("gender", entity.getGender());
//            item.put("region", "");
//            item.put("content", entity.getContent());
//            item.put("datetime", entity.getDatetime());
//            item.put("title", entity.getTitle());
//            item.put("subjectid", entity.getSubjectid());
//            item.put("authuserid", entity.getAuthuserid());
//        }
//        nextid = (list.size() < pagesize) ? null:(pageno + 1) + "";
//
//        JSON json = new JSON();//结果
//        JSON res = new JSON();
//        json.put("status", 200);
//        json.put("res", res);
//
//        res.put("appkey", appkey);
//        res.put("subjectid", subjectid);
//        res.put("startid", startid);
//        res.put("pagesize", pagesize);
//        res.put("total", total);
//        res.put("list", mapList);
//        res.put("nextstartid", nextid);
//        return json.toString().getBytes("UTF-8");
//    }
//
//    public static <E> List<E> esResponseToObj(SearchResponse response, Class<E> cls) {
//        SearchHits totalHits = response.getHits();
//        SearchHit[] hits = totalHits.getHits();
//        List<E> list = new ArrayList<E>();
//        for(SearchHit hit : hits) {
//            list.add(ObjectUtils.convertToObject(hit.getSource(), cls));
//        }
//        return list;
//    }
//}
