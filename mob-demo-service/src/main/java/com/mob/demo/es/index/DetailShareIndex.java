package com.mob.demo.es.index;

import com.mob.demo.es.entity.DetailShare;
import com.mob.elasticsearch.lamfire.index.AbstractIndex;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.search.facet.FacetBuilders;
import org.elasticsearch.search.facet.terms.TermsFacet;
import org.elasticsearch.search.facet.terms.TermsFacet.Entry;
import org.elasticsearch.search.facet.terms.TermsFacetBuilder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Component
public class DetailShareIndex extends AbstractIndex<DetailShare> {
	@SuppressWarnings("unchecked")
	public Map<String, Integer> countByAppkey(long starttime, long endtime) {
		RangeQueryBuilder rangeQuery = QueryBuilders.rangeQuery("datetime").from(starttime).to(endtime).includeLower(true).includeUpper(false);
		
		String facetField = "appkey";
		String facetName = facetField;
		TermsFacetBuilder facetBuilder = FacetBuilders.termsFacet(facetField).field(facetField).size(100000);

		TermsFacet facet = (TermsFacet) super.facet(rangeQuery, facetBuilder, facetName);

		Map<String, Integer> map = new TreeMap<String, Integer>();
		List<Entry> list = (List<Entry>) facet.getEntries();
		for (Entry e : list) {
			map.put(e.getTerm().toString().trim(), e.getCount());
		}
		return map;
	}
	
	public static void main(String[] args) {
		DetailShareIndex index = new DetailShareIndex();
		System.out.println(index.countByAppkey(0, System.currentTimeMillis()));
	}
}
